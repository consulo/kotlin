package com.intellij.psi.util

import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType

/**
 * Element type of this PSI element (node's element type), or null when the element has no AST node.
 * Same contract as IntelliJ's `com.intellij.psi.util.elementType`.
 */
val PsiElement.elementType: IElementType?
    get() = node?.elementType

/**
 * Sequence of this element followed by all its descendants in depth-first order.
 * Children are visited in sibling order. Same contract as IntelliJ's
 * `com.intellij.psi.util.descendants` (without the `childrenFirst` / `canGoInside`
 * parameters — add them back if some call-site needs them).
 */
fun PsiElement.descendants(): Sequence<PsiElement> = sequence {
    yield(this@descendants)
    var child = firstChild
    while (child != null) {
        yieldAll(child.descendants())
        child = child.nextSibling
    }
}
