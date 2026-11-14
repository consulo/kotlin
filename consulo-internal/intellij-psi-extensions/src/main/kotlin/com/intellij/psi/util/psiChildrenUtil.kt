package com.intellij.psi.util

import com.intellij.psi.PsiElement

/** Sequence of direct children whose type matches T. */
inline fun <reified T : PsiElement> PsiElement.childrenOfType(): Sequence<T> = sequence {
    var child = firstChild
    while (child != null) {
        if (child is T) yield(child)
        child = child.nextSibling
    }
}
