/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.stubs.elements

import consulo.language.psi.PsiElement
import consulo.language.psi.stub.StubElement
import consulo.language.psi.stub.StubInputStream
import consulo.language.psi.stub.StubOutputStream
import org.jetbrains.kotlin.psi.KtValueArgument
import org.jetbrains.kotlin.psi.stubs.KotlinValueArgumentStub
import org.jetbrains.kotlin.psi.stubs.impl.KotlinValueArgumentStubImpl

class KtValueArgumentElementType<T : KtValueArgument>(debugName: String, psiClass: Class<T>) :
    KtStubElementType<KotlinValueArgumentStub<T>, T>(debugName, psiClass, KotlinValueArgumentStub::class.java) {

    override fun createStub(psi: T, parentStub: StubElement<out PsiElement>?): KotlinValueArgumentStub<T> {
        return KotlinValueArgumentStubImpl(parentStub, this, psi.isSpread)
    }

    override fun serialize(stub: KotlinValueArgumentStub<T>, dataStream: StubOutputStream) {
        dataStream.writeBoolean(stub.isSpread())
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<PsiElement>?): KotlinValueArgumentStub<T> {
        val isSpread = dataStream.readBoolean()
        return KotlinValueArgumentStubImpl(parentStub, this, isSpread)
    }
}
