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

package org.jetbrains.kotlin.psi.stubs.elements

import consulo.index.io.StringRef
import consulo.language.psi.stub.StubElement
import consulo.language.psi.stub.StubInputStream
import consulo.language.psi.stub.StubOutputStream
import org.jetbrains.annotations.NonNls
import org.jetbrains.kotlin.psi.KtEnumEntrySuperclassReferenceExpression
import org.jetbrains.kotlin.psi.stubs.KotlinEnumEntrySuperclassReferenceExpressionStub
import org.jetbrains.kotlin.psi.stubs.impl.KotlinEnumEntrySuperclassReferenceExpressionStubImpl

class KtEnumEntrySuperClassReferenceExpressionElementType(@NonNls debugName: String) :
    KtStubElementType<KotlinEnumEntrySuperclassReferenceExpressionStub, KtEnumEntrySuperclassReferenceExpression>(
        debugName,
        KtEnumEntrySuperclassReferenceExpression::class.java,
        KotlinEnumEntrySuperclassReferenceExpressionStub::class.java
    ) {

    override fun createStub(
        psi: KtEnumEntrySuperclassReferenceExpression,
        parentStub: StubElement<*>
    ): KotlinEnumEntrySuperclassReferenceExpressionStub {
        return KotlinEnumEntrySuperclassReferenceExpressionStubImpl(parentStub, StringRef.fromString(psi.getReferencedName())!!)
    }

    override fun serialize(stub: KotlinEnumEntrySuperclassReferenceExpressionStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.getReferencedName())
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>): KotlinEnumEntrySuperclassReferenceExpressionStub {
        return KotlinEnumEntrySuperclassReferenceExpressionStubImpl(parentStub, dataStream.readName()!!)
    }
}
