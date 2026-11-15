package com.intellij.psi.stubs

import com.intellij.psi.StubBuilder
import com.intellij.openapi.vfs.VirtualFile

interface LanguageStubDefinition {
    val stubVersion: Int
    val builder: StubBuilder
    fun shouldBuildStubFor(file: VirtualFile): Boolean = true
}
