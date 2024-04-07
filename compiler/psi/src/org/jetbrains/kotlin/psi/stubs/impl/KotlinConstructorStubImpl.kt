/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.stubs.impl

import consulo.index.io.StringRef
import consulo.language.psi.PsiElement
import consulo.language.psi.stub.StubElement
import org.jetbrains.kotlin.psi.KtConstructor
import org.jetbrains.kotlin.psi.stubs.KotlinConstructorStub
import org.jetbrains.kotlin.psi.stubs.elements.KtConstructorElementType

class KotlinConstructorStubImpl<T : KtConstructor<T>>(
    parent: StubElement<out PsiElement>?,
    elementType: KtConstructorElementType<T>,
    private val containingClassName: StringRef?,
    private val hasBody: Boolean,
    private val isDelegatedCallToThis: Boolean,
    private val isExplicitDelegationCall: Boolean,
) : KotlinStubBaseImpl<T>(parent, elementType), KotlinConstructorStub<T> {
    override fun getFqName() = null
    override fun getName() = StringRef.toString(containingClassName)
    override fun isTopLevel() = false
    override fun isExtension() = false
    override fun hasBody() = hasBody
    override fun isDelegatedCallToThis() = isDelegatedCallToThis
    override fun isExplicitDelegationCall() = isExplicitDelegationCall
}
