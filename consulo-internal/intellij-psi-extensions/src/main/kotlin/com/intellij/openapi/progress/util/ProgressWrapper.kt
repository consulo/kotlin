package com.intellij.openapi.progress.util

import com.intellij.openapi.progress.ProgressIndicator

/** IntelliJ's progress indicator wrapper; Consulo's indicators are not wrapped, so one is its own original. */
class ProgressWrapper private constructor() {
    companion object {
        @JvmStatic
        fun unwrap(indicator: ProgressIndicator?): ProgressIndicator? = indicator
    }
}
