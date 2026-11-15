package com.intellij.openapi.progress.impl

/** IntelliJ's check that a long computation calls checkCanceled often enough (a debugging aid): the computation itself. */
class CancellationCheck private constructor() {
    companion object {
        @JvmStatic
        fun <T> runWithCancellationCheck(block: () -> T): T = block()
    }
}
