/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.stubs.elements

import consulo.index.io.StringRef
import consulo.language.psi.PsiElement
import consulo.language.psi.stub.StubElement
import consulo.language.psi.stub.StubInputStream
import consulo.language.psi.stub.StubOutputStream
import org.jetbrains.kotlin.psi.KtImportAlias
import org.jetbrains.kotlin.psi.stubs.KotlinImportAliasStub
import org.jetbrains.kotlin.psi.stubs.impl.KotlinImportAliasStubImpl

class KtImportAliasElementType(debugName: String) :
    KtStubElementType<KotlinImportAliasStub, KtImportAlias>(debugName, KtImportAlias::class.java, KotlinImportAliasStub::class.java) {
    override fun createStub(psi: KtImportAlias, parentStub: StubElement<out PsiElement>?): KotlinImportAliasStub {
        return KotlinImportAliasStubImpl(parentStub, StringRef.fromString(psi.name))
    }

    override fun serialize(stub: KotlinImportAliasStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.getName())
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<PsiElement>?): KotlinImportAliasStub {
        val name = dataStream.readName()
        return KotlinImportAliasStubImpl(parentStub, name)
    }
}
