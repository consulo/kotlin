/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.stubs.impl

import consulo.language.psi.PsiElement
import consulo.language.psi.stub.StubElement
import org.jetbrains.kotlin.psi.KtValueArgument
import org.jetbrains.kotlin.psi.stubs.KotlinValueArgumentStub
import org.jetbrains.kotlin.psi.stubs.elements.KtValueArgumentElementType

class KotlinValueArgumentStubImpl<T : KtValueArgument>(
    parent: StubElement<out PsiElement>?,
    elementType: KtValueArgumentElementType<T>,
    private val isSpread: Boolean
) : KotlinPlaceHolderStubImpl<T>(parent, elementType), KotlinValueArgumentStub<T> {
    override fun isSpread(): Boolean = isSpread
}