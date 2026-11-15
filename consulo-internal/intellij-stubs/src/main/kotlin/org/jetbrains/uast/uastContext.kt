package org.jetbrains.uast

import com.intellij.psi.PsiElement

// compile-time only: code behind a UastContext service, which Consulo never has
@Suppress("unused", "UNUSED_PARAMETER")
fun <T : UElement> UastContext.convertOpt(element: PsiElement?, parent: UElement?): T? = null
