package com.intellij.ui.dsl.listCellRenderer

import java.awt.Component
import javax.swing.DefaultListCellRenderer
import javax.swing.JList
import javax.swing.ListCellRenderer

/** IntelliJ's list cell renderer showing the text of each value, [nullValue] for null. */
fun <T> textListCellRenderer(nullValue: String = "", textProvider: (T) -> String?): ListCellRenderer<T?> =
    object : ListCellRenderer<T?> {
        private val delegate = DefaultListCellRenderer()

        override fun getListCellRendererComponent(list: JList<out T?>, value: T?, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component {
            val text = if (value == null) nullValue else textProvider(value) ?: ""
            return delegate.getListCellRendererComponent(list, text, index, isSelected, cellHasFocus)
        }
    }
