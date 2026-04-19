@file:JvmName("PsiUtilCoreKt")
package com.intellij.psi.util

import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType

val PsiElement.elementType: IElementType?
    get() = PsiUtilCore.getElementType(this)

inline fun <reified T : PsiElement> PsiElement.childrenOfType(): List<T> =
    PsiTreeUtil.getChildrenOfTypeAsList(this, T::class.java)

fun <T : PsiElement> notNullChild(element: T?): T = element ?: error("Required non-null child was null")
