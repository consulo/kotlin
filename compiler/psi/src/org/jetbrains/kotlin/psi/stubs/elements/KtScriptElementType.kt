/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.stubs.elements

import consulo.index.io.StringRef
import consulo.language.psi.PsiElement
import consulo.language.psi.stub.IndexSink
import consulo.language.psi.stub.StubElement
import consulo.language.psi.stub.StubInputStream
import consulo.language.psi.stub.StubOutputStream
import org.jetbrains.kotlin.psi.KtScript
import org.jetbrains.kotlin.psi.stubs.KotlinScriptStub
import org.jetbrains.kotlin.psi.stubs.impl.KotlinScriptStubImpl

class KtScriptElementType(debugName: String) : KtStubElementType<KotlinScriptStub, KtScript>(
    debugName, KtScript::class.java, KotlinScriptStub::class.java
) {

    override fun createStub(psi: KtScript, parentStub: StubElement<out PsiElement>): KotlinScriptStub {
        return KotlinScriptStubImpl(parentStub, StringRef.fromString(psi.fqName.asString()))
    }

    override fun serialize(stub: KotlinScriptStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.getFqName().asString())
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<PsiElement>): KotlinScriptStub {
        val fqName = dataStream.readName()
        return KotlinScriptStubImpl(parentStub, fqName)
    }


    override fun indexStub(stub: KotlinScriptStub, sink: IndexSink) {
        StubIndexService.getInstance().indexScript(stub, sink)
    }
}
