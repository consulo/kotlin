package com.intellij.openapi.fileTypes

/** IntelliJ's binary file decompilers; the slow decompiler operations it guards are always allowed in Consulo. */
class BinaryFileTypeDecompilers private constructor() {
    fun <T> allowDecompilerSlowOperation(block: () -> T): T = block()

    companion object {
        private val INSTANCE = BinaryFileTypeDecompilers()

        @JvmStatic
        fun getInstance(): BinaryFileTypeDecompilers = INSTANCE
    }
}
