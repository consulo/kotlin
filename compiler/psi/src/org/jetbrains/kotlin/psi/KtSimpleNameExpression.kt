/*
 * Copyright 2010-2016 JetBrains s.r.o.
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

package org.jetbrains.kotlin.psi

import consulo.language.ast.ASTNode
import consulo.language.ast.IElementType
import consulo.language.psi.PsiElement
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.name.Name

interface KtSimpleNameExpression : KtReferenceExpression {

    fun getReferencedName(): String

    fun getReferencedNameAsName(): Name

    fun getReferencedNameElement(): PsiElement

    fun getIdentifier(): PsiElement?

    fun getReferencedNameElementType(): IElementType
}

abstract class KtSimpleNameExpressionImpl(node: ASTNode) : KtExpressionImpl(node), KtSimpleNameExpression {
    override fun getIdentifier(): PsiElement? = findChildByType(KtTokens.IDENTIFIER)

    override fun getReferencedNameElementType() = getReferencedNameElementTypeImpl(this)

    override fun <R, D> accept(visitor: KtVisitor<R, D>, data: D): R {
        return visitor.visitSimpleNameExpression(this, data)
    }

    override fun getReferencedNameAsName() = getReferencedNameAsNameImpl(this)

    override fun getReferencedName() = getReferencedNameImpl(this)

    //NOTE: an unfortunate way to share an implementation between stubbed and not stubbed tree
    companion object {
        fun getReferencedNameElementTypeImpl(expression: KtSimpleNameExpression): IElementType {
            return expression.getReferencedNameElement().node!!.elementType
        }

        fun getReferencedNameAsNameImpl(expresssion: KtSimpleNameExpression): Name {
            val name = expresssion.getReferencedName()
            return Name.identifier(name)
        }

        fun getReferencedNameImpl(expression: KtSimpleNameExpression): String {
            val text = expression.getReferencedNameElement().node!!.text
            return KtPsiUtil.unquoteIdentifierOrFieldReference(text)
        }
    }
}
