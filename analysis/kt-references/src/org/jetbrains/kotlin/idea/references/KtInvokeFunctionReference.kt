/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.references

import consulo.document.util.TextRange
import consulo.language.ast.ASTNode
import consulo.language.psi.MultiRangeReference
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForSelectorOrThis
import org.jetbrains.kotlin.util.OperatorNameConventions
import java.util.*

abstract class KtInvokeFunctionReference(expression: KtCallExpression) : KtSimpleReference<KtCallExpression>(expression),
    MultiRangeReference {
    override val resolvesByNames: Collection<Name> get() = NAMES

    override fun getRangeInElement(): TextRange {
        return element.textRange.shiftRight(-element.textOffset)
    }

    override fun getRanges(): List<TextRange> {
        val list = ArrayList<TextRange>()
        val valueArgumentList = expression.valueArgumentList
        if (valueArgumentList != null) {
            if (valueArgumentList.arguments.isNotEmpty()) {
                val valueArgumentListNode = valueArgumentList.node
                val lPar = valueArgumentListNode.findChildByType(KtTokens.LPAR)
                if (lPar != null) {
                    list.add(getRange(lPar))
                }

                val rPar = valueArgumentListNode.findChildByType(KtTokens.RPAR)
                if (rPar != null) {
                    list.add(getRange(rPar))
                }
            } else {
                list.add(getRange(valueArgumentList.node))
            }
        }

        val functionLiteralArguments = expression.lambdaArguments
        for (functionLiteralArgument in functionLiteralArguments) {
            val functionLiteralExpression = functionLiteralArgument.getLambdaExpression() ?: continue
            list.add(getRange(functionLiteralExpression.leftCurlyBrace))
            val rightCurlyBrace = functionLiteralExpression.rightCurlyBrace
            if (rightCurlyBrace != null) {
                list.add(getRange(rightCurlyBrace))
            }
        }

        return list
    }

    private fun getRange(node: ASTNode): TextRange {
        val textRange = node.textRange
        return textRange.shiftRight(-expression.textOffset)
    }

    override fun canRename(): Boolean = true

    companion object {
        private val NAMES = listOf(OperatorNameConventions.INVOKE)
    }
}
