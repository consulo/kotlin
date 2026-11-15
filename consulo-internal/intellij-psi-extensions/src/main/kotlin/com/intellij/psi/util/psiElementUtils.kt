package com.intellij.psi.util

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import kotlin.reflect.KClass

/** Matches IntelliJ's PsiElement.startOffset: the start of the element's text range. */
val PsiElement.startOffset: Int
    get() = textRange.startOffset

/** Matches IntelliJ's PsiElement.endOffset: the end of the element's text range. */
val PsiElement.endOffset: Int
    get() = textRange.endOffset

/** Matches IntelliJ's PsiElement.nextLeaf(skipEmptyElements): the next leaf in the tree. */
fun PsiElement.nextLeaf(skipEmptyElements: Boolean = false): PsiElement? = PsiTreeUtil.nextLeaf(this, skipEmptyElements)

/** Matches IntelliJ's PsiElement.prevLeaf(skipEmptyElements): the previous leaf in the tree. */
fun PsiElement.prevLeaf(skipEmptyElements: Boolean = false): PsiElement? = PsiTreeUtil.prevLeaf(this, skipEmptyElements)

/** Matches IntelliJ's PsiElement.nextLeaf(filter): the next leaf that [filter] accepts. */
fun PsiElement.nextLeaf(filter: (PsiElement) -> Boolean): PsiElement? = nextLeafs.firstOrNull(filter)

/** Matches IntelliJ's PsiElement.prevLeaf(filter): the previous leaf that [filter] accepts. */
fun PsiElement.prevLeaf(filter: (PsiElement) -> Boolean): PsiElement? = prevLeafs.firstOrNull(filter)

/** Matches IntelliJ's PsiElement.nextLeafs: the leaves after this element. */
val PsiElement.nextLeafs: Sequence<PsiElement>
    get() = generateSequence(nextLeaf()) { it.nextLeaf() }

/** Matches IntelliJ's PsiElement.prevLeafs: the leaves before this element, nearest first. */
val PsiElement.prevLeafs: Sequence<PsiElement>
    get() = generateSequence(prevLeaf()) { it.prevLeaf() }

/** Matches IntelliJ's PsiElement.siblings(forward, withSelf). */
fun PsiElement.siblings(forward: Boolean = true, withSelf: Boolean = true): Sequence<PsiElement> {
    val next: (PsiElement) -> PsiElement? = if (forward) PsiElement::getNextSibling else PsiElement::getPrevSibling
    return generateSequence(if (withSelf) this else next(this), next)
}

/** Matches IntelliJ's PsiElement.parentOfTypes(classes, withSelf): the nearest parent of one of [classes], within the file. */
fun <T : PsiElement> PsiElement.parentOfTypes(vararg classes: KClass<out T>, withSelf: Boolean = false): T? {
    for (element in parents(withSelf)) {
        if (classes.any { it.isInstance(element) }) {
            @Suppress("UNCHECKED_CAST")
            return element as T
        }
        if (element is PsiFile) {
            return null
        }
    }
    return null
}

/** Matches IntelliJ's PsiElement.findParentOfType(strict): PsiTreeUtil.getParentOfType. */
inline fun <reified T : PsiElement> PsiElement.findParentOfType(strict: Boolean = true): T? =
    PsiTreeUtil.getParentOfType(this, T::class.java, strict)

/** Matches IntelliJ's PsiElement.findTopmostParentOfType(strict): the outermost parent of type [T]. */
inline fun <reified T : PsiElement> PsiElement.findTopmostParentOfType(strict: Boolean = true): T? =
    parents(withSelf = !strict).takeWhile { it !is PsiFile || it is T }.filterIsInstance<T>().lastOrNull()
