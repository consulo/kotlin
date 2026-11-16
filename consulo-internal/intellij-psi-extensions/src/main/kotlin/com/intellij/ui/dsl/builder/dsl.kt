// A subset of IntelliJ's Kotlin UI DSL (com.intellij.ui.dsl.builder) on Swing, for the upstream settings panels:
// rows of components, titled groups, indents and button groups.
package com.intellij.ui.dsl.builder

import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.JBIntSpinner
import com.intellij.ui.layout.ComponentPredicate
import java.awt.BorderLayout
import java.awt.Component
import java.awt.FlowLayout
import javax.swing.BorderFactory
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.ButtonGroup
import javax.swing.JCheckBox
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JRadioButton

enum class AlignX { LEFT, CENTER, RIGHT, FILL }

enum class BottomGap { NONE, SMALL, MEDIUM }

enum class RightGap { SMALL, COLUMNS }

/** Client properties the IntelliJ UI DSL reads from components. */
object DslComponentProperty {
    @JvmField
    val VISUAL_PADDINGS: Any = "dsl.visualPaddings"
}

interface Cell<out T : JComponent> {
    val component: T

    fun align(align: AlignX): Cell<T>

    fun gap(rightGap: RightGap): Cell<T>

    fun enabledIf(predicate: ComponentPredicate): Cell<T>

    fun applyToComponent(task: T.() -> Unit): Cell<T>
}

interface Row {
    fun <T : JComponent> cell(component: T): Cell<T>

    fun checkBox(text: String): Cell<JCheckBox>

    fun radioButton(text: String, value: Any? = null): Cell<JRadioButton>

    fun spinner(range: IntRange, step: Int = 1): Cell<JBIntSpinner>

    fun label(text: String): Cell<JLabel>

    fun bottomGap(bottomGap: BottomGap): Row
}

interface Panel {
    fun row(label: String? = null, init: Row.() -> Unit): Row

    fun group(title: String? = null, indent: Boolean = true, init: Panel.() -> Unit): Row

    fun indent(init: Panel.() -> Unit)

    fun buttonsGroup(title: String? = null, indent: Boolean = title != null, init: Panel.() -> Unit)
}

/** IntelliJ's `panel { }`: the rows the [init] block adds, top to bottom. */
fun panel(init: Panel.() -> Unit): DialogPanel {
    val result = DialogPanel(BorderLayout())
    val content = PanelImpl(null)
    content.init()
    result.add(content.component, BorderLayout.NORTH)
    return result
}

private class CellImpl<T : JComponent>(override val component: T, private val row: RowImpl) : Cell<T> {
    override fun align(align: AlignX): Cell<T> {
        if (align == AlignX.FILL) {
            row.fill(component)
        }
        return this
    }

    override fun gap(rightGap: RightGap): Cell<T> = this

    override fun enabledIf(predicate: ComponentPredicate): Cell<T> {
        component.isEnabled = predicate()
        predicate.addListener { component.isEnabled = it }
        return this
    }

    override fun applyToComponent(task: T.() -> Unit): Cell<T> {
        component.task()
        return this
    }
}

private class RowImpl(private val buttonGroup: ButtonGroup?) : Row {
    val component: JPanel = JPanel(FlowLayout(FlowLayout.LEFT, 5, 2)).apply { alignmentX = Component.LEFT_ALIGNMENT }

    private fun <T : JComponent> add(child: T): Cell<T> {
        component.add(child)
        return CellImpl(child, this)
    }

    fun fill(child: JComponent) {
        component.layout = BorderLayout()
        component.add(child, BorderLayout.CENTER)
    }

    override fun <T : JComponent> cell(component: T): Cell<T> = add(component)

    override fun checkBox(text: String): Cell<JCheckBox> = add(JCheckBox(text))

    override fun radioButton(text: String, value: Any?): Cell<JRadioButton> = add(JRadioButton(text).also { buttonGroup?.add(it) })

    override fun spinner(range: IntRange, step: Int): Cell<JBIntSpinner> = add(JBIntSpinner(range.first, range.first, range.last, step))

    override fun label(text: String): Cell<JLabel> = add(JLabel(text))

    override fun bottomGap(bottomGap: BottomGap): Row {
        if (bottomGap != BottomGap.NONE) {
            component.border = BorderFactory.createEmptyBorder(0, 0, if (bottomGap == BottomGap.SMALL) 4 else 8, 0)
        }
        return this
    }
}

private class PanelImpl(private val buttonGroup: ButtonGroup?, leftIndent: Int = 0) : Panel {
    val component: JPanel = JPanel().apply {
        layout = BoxLayout(this, BoxLayout.Y_AXIS)
        alignmentX = Component.LEFT_ALIGNMENT
        border = BorderFactory.createEmptyBorder(0, leftIndent, 0, 0)
    }

    override fun row(label: String?, init: Row.() -> Unit): Row {
        val row = RowImpl(buttonGroup)
        if (label != null) {
            row.label(label)
        }
        row.init()
        component.add(row.component)
        return row
    }

    override fun group(title: String?, indent: Boolean, init: Panel.() -> Unit): Row {
        val group = PanelImpl(buttonGroup)
        group.component.border = BorderFactory.createTitledBorder(title ?: "")
        group.init()
        return row { cell(group.component).align(AlignX.FILL) }
    }

    override fun indent(init: Panel.() -> Unit) {
        val indented = PanelImpl(buttonGroup, leftIndent = 20)
        indented.init()
        component.add(indented.component)
    }

    override fun buttonsGroup(title: String?, indent: Boolean, init: Panel.() -> Unit) {
        if (title != null) {
            row { label(title) }
        }
        val group = PanelImpl(ButtonGroup(), leftIndent = if (indent) 20 else 0)
        group.init()
        component.add(group.component)
        component.add(Box.createVerticalStrut(4))
    }
}
