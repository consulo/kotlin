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

/** Matches IntelliJ's PsiElement.parents(withSelf): this element's parents, up to the file. */
fun PsiElement.parents(withSelf: Boolean): Sequence<PsiElement> {
    val seed = if (withSelf) this else if (this is com.intellij.psi.PsiFile) null else parent
    return generateSequence(seed) { if (it is com.intellij.psi.PsiFile) null else it.parent }
}

/** Matches IntelliJ's PsiElement.parentOfType(withSelf). */
inline fun <reified T : PsiElement> PsiElement.parentOfType(withSelf: Boolean = false): T? =
    parents(withSelf).filterIsInstance<T>().firstOrNull()

/** Matches IntelliJ's PsiElement.parentsOfType(withSelf). */
inline fun <reified T : PsiElement> PsiElement.parentsOfType(withSelf: Boolean = true): Sequence<T> =
    parents(withSelf).filterIsInstance<T>()

/** Matches IntelliJ's PsiElement.descendantsOfType(childrenFirst): this element and its descendants of type T. */
inline fun <reified T : PsiElement> PsiElement.descendantsOfType(childrenFirst: Boolean = false): Sequence<T> =
    descendants(childrenFirst).filterIsInstance<T>()

/** Depth-first descendants including this element; children before their parent when [childrenFirst]. */
fun PsiElement.descendants(childrenFirst: Boolean): Sequence<PsiElement> = sequence {
    if (!childrenFirst) yield(this@descendants)
    var child = firstChild
    while (child != null) {
        yieldAll(child.descendants(childrenFirst))
        child = child.nextSibling
    }
    if (childrenFirst) yield(this@descendants)
}
