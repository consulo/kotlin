package com.intellij.psi.util

import com.intellij.psi.PsiElement

/** Matches IntelliJ's PsiElement.childrenOfType(): the direct children whose type matches T. */
inline fun <reified T : PsiElement> PsiElement.childrenOfType(): List<T> {
    val result = ArrayList<T>()
    var child = firstChild
    while (child != null) {
        if (child is T) result.add(child)
        child = child.nextSibling
    }
    return result
}
