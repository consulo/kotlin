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

import consulo.content.scope.SearchScope
import consulo.language.ast.ASTNode
import consulo.language.psi.PsiElement
import consulo.language.util.IncorrectOperationException
import consulo.navigation.ItemPresentationProvider
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.stubs.KotlinConstructorStub
import org.jetbrains.kotlin.psi.stubs.elements.KtConstructorElementType
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes

abstract class KtConstructor<T : KtConstructor<T>> : KtDeclarationStub<KotlinConstructorStub<T>>, KtFunction {
    protected constructor(node: ASTNode) : super(node)
    protected constructor(stub: KotlinConstructorStub<T>, nodeType: KtConstructorElementType<T>) : super(stub, nodeType)

    abstract fun getContainingClassOrObject(): KtClassOrObject

    override fun isLocal() = false

    override fun getValueParameterList() = getStubOrPsiChild(KtStubElementTypes.VALUE_PARAMETER_LIST)

    override fun getValueParameters() = valueParameterList?.parameters ?: emptyList()

    override fun getReceiverTypeReference() = null

    override fun getContextReceivers(): List<KtContextReceiver> = emptyList()

    override fun getTypeReference() = null

    @Throws(IncorrectOperationException::class)
    override fun setTypeReference(typeRef: KtTypeReference?) = throw IncorrectOperationException("setTypeReference to constructor")

    override fun getColon() = findChildByType<PsiElement>(KtTokens.COLON)

    override fun getBodyExpression(): KtBlockExpression? = null

    override fun getEqualsToken() = null

    override fun hasBlockBody() = hasBody()

    fun isDelegatedCallToThis(): Boolean {
        stub?.let { return it.isDelegatedCallToThis() }
        return when (this) {
            is KtPrimaryConstructor -> false
            is KtSecondaryConstructor -> getDelegationCallOrNull()?.isCallToThis() ?: true
            else -> throw IllegalStateException("Unknown constructor type: $this")
        }
    }

    fun isExplicitDelegationCall(): Boolean {
        stub?.let { return it.isExplicitDelegationCall() }
        return when (this) {
            is KtPrimaryConstructor -> false
            is KtSecondaryConstructor -> getDelegationCallOrNull()?.isImplicit == false
            else -> throw IllegalStateException("Unknown constructor type: $this")
        }
    }

    override fun hasBody(): Boolean {
        stub?.let { return it.hasBody() }
        return bodyExpression != null
    }

    override fun hasDeclaredReturnType() = false

    override fun getTypeParameterList() = null

    override fun getTypeConstraintList() = null

    override fun getTypeConstraints() = emptyList<KtTypeConstraint>()

    override fun getTypeParameters() = emptyList<KtTypeParameter>()

    override fun getName(): String? = getContainingClassOrObject().name

    override fun getNameAsSafeName() = KtPsiUtil.safeName(name)

    override fun getFqName() = null

    override fun getNameAsName() = nameAsSafeName

    override fun getNameIdentifier() = null

    override fun getIdentifyingElement(): PsiElement? = getConstructorKeyword()

    @Throws(IncorrectOperationException::class)
    override fun setName(name: String): PsiElement = throw IncorrectOperationException("setName to constructor")

    override fun getPresentation() = ItemPresentationProvider.getItemPresentation(this)

    open fun getConstructorKeyword(): PsiElement? = findChildByType(KtTokens.CONSTRUCTOR_KEYWORD)

    fun hasConstructorKeyword(): Boolean = stub != null || getConstructorKeyword() != null

    override fun getTextOffset(): Int {
        return getConstructorKeyword()?.textOffset
            ?: valueParameterList?.textOffset
            ?: super.getTextOffset()
    }

    override fun getUseScope(): SearchScope {
        return getContainingClassOrObject().useScope
    }
}
