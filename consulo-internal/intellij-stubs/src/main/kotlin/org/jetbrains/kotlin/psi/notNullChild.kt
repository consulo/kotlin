package org.jetbrains.kotlin.psi

import com.intellij.psi.PsiElement

fun <T : PsiElement> notNullChild(element: T?): T = element ?: error("Required non-null child was null")
