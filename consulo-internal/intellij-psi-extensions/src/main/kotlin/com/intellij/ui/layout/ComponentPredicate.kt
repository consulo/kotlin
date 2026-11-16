package com.intellij.ui.layout

import javax.swing.AbstractButton

/** IntelliJ's observable condition of UI components (e.g. a check box being selected). */
abstract class ComponentPredicate : () -> Boolean {
    abstract fun addListener(listener: (Boolean) -> Unit)
}

/** IntelliJ's [ComponentPredicate] of a button being selected. */
val AbstractButton.selected: ComponentPredicate
    get() {
        val button = this
        return object : ComponentPredicate() {
            override fun invoke(): Boolean = button.isSelected
            override fun addListener(listener: (Boolean) -> Unit) {
                button.addChangeListener { listener(button.isSelected) }
            }
        }
    }
