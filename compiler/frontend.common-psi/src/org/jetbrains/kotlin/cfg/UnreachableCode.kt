/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.cfg

import consulo.document.util.TextRange
import consulo.language.psi.PsiComment
import consulo.language.psi.PsiElement
import consulo.language.psi.PsiElementVisitor
import consulo.language.psi.PsiWhiteSpace
import consulo.language.psi.util.PsiTreeUtil
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtElement
import org.jetbrains.kotlin.psi.KtPsiUtil

interface UnreachableCode {
    val elements: Set<KtElement>
    val reachableElements: Set<KtElement>
    val unreachableElements: Set<KtElement>

    companion object {
        fun getUnreachableTextRanges(
            element: KtElement,
            reachableElements: Set<KtElement>,
            unreachableElements: Set<KtElement>
        ): List<TextRange> {
            return if (element.hasChildrenInSet(reachableElements)) {
                with(
                    element.getLeavesOrReachableChildren(reachableElements, unreachableElements)
                        .removeReachableElementsWithMeaninglessSiblings(reachableElements).mergeAdjacentTextRanges()
                ) {
                    if (isNotEmpty()) this
                    // Specific case like condition in when:
                    // element is dead but its only child is alive and has the same text range
                    else listOf(element.textRange.endOffset.let { TextRange(it, it) })
                }
            } else {
                listOf(element.textRange!!)
            }
        }

        private fun KtElement.hasChildrenInSet(set: Set<KtElement>): Boolean =
            PsiTreeUtil.collectElements(this) { it != this }.any { it in set }

        private fun KtElement.getLeavesOrReachableChildren(
            reachableElements: Set<KtElement>,
            unreachableElements: Set<KtElement>
        ): List<PsiElement> {
            val children = ArrayList<PsiElement>()
            acceptChildren(object : PsiElementVisitor() {
                override fun visitElement(element: PsiElement) {
                    val isReachable =
                        element is KtElement && reachableElements.contains(element) && !element.hasChildrenInSet(unreachableElements)
                    if (isReachable || element.children.isEmpty()) {
                        children.add(element)
                    } else {
                        element.acceptChildren(this)
                    }
                }
            })
            return children
        }

        private fun List<PsiElement>.removeReachableElementsWithMeaninglessSiblings(reachableElements: Set<KtElement>): List<PsiElement> {
            fun PsiElement.isMeaningless() = this is PsiWhiteSpace
                    || this.node?.elementType == KtTokens.COMMA
                    || this is PsiComment

            val childrenToRemove = HashSet<PsiElement>()
            fun collectSiblingsIfMeaningless(elementIndex: Int, direction: Int) {
                val index = elementIndex + direction
                if (index !in 0 until size) return

                val element = this[index]
                if (element.isMeaningless()) {
                    childrenToRemove.add(element)
                    collectSiblingsIfMeaningless(index, direction)
                }
            }
            for ((index, element) in this.withIndex()) {
                if (reachableElements.contains(element)) {
                    childrenToRemove.add(element)
                    collectSiblingsIfMeaningless(index, -1)
                    collectSiblingsIfMeaningless(index, 1)
                }
            }
            return this.filter { it !in childrenToRemove }
        }


        private fun List<PsiElement>.mergeAdjacentTextRanges(): List<TextRange> {
            val result = ArrayList<TextRange>()
            val lastRange = fold(null as TextRange?) { currentTextRange, element ->

                val elementRange = element.textRange!!
                when {
                    currentTextRange == null -> {
                        elementRange
                    }
                    currentTextRange.endOffset == elementRange.startOffset -> {
                        currentTextRange.union(elementRange)
                    }
                    else -> {
                        result.add(currentTextRange)
                        elementRange
                    }
                }
            }
            if (lastRange != null) {
                result.add(lastRange)
            }
            return result
        }
    }

}

class UnreachableCodeImpl(
    override val reachableElements: Set<KtElement>,
    override val unreachableElements: Set<KtElement>
) : UnreachableCode {

    // This is needed in order to highlight only '1 < 2' and not '1', '<' and '2' as well
    override val elements: Set<KtElement> = KtPsiUtil.findRootExpressions(unreachableElements)

}
