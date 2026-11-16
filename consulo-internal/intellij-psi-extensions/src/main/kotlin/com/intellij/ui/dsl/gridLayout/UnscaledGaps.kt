package com.intellij.ui.dsl.gridLayout

/** IntelliJ's gaps of the UI DSL grid layout, in unscaled pixels. */
data class UnscaledGaps(val top: Int = 0, val left: Int = 0, val bottom: Int = 0, val right: Int = 0) {
    companion object {
        @JvmField
        val EMPTY: UnscaledGaps = UnscaledGaps()
    }
}
