package com.intellij.openapi.ui

import java.awt.LayoutManager
import javax.swing.JPanel

/** IntelliJ's panel built by the UI DSL (see com.intellij.ui.dsl.builder.panel). */
open class DialogPanel(layout: LayoutManager? = null) : JPanel(layout)
