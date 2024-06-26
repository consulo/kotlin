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

package org.jetbrains.kotlin.psi.stubs.elements;

import consulo.index.io.StringRef;
import consulo.language.psi.stub.IndexSink;
import consulo.language.psi.stub.StubElement;
import consulo.language.psi.stub.StubInputStream;
import consulo.language.psi.stub.StubOutputStream;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.psi.KtParameter;
import org.jetbrains.kotlin.psi.stubs.KotlinParameterStub;
import org.jetbrains.kotlin.psi.stubs.impl.KotlinParameterStubImpl;

import java.io.IOException;

public class KtParameterElementType extends KtStubElementType<KotlinParameterStub, KtParameter> {
    public KtParameterElementType(@NotNull @NonNls String debugName) {
        super(debugName, KtParameter.class, KotlinParameterStub.class);
    }

    @NotNull
    @Override
    public KotlinParameterStub createStub(@NotNull KtParameter psi, StubElement parentStub) {
        FqName fqName = psi.getFqName();
        StringRef fqNameRef = StringRef.fromString(fqName != null ? fqName.asString() : null);
        return new KotlinParameterStubImpl(
                (StubElement<?>) parentStub, fqNameRef, StringRef.fromString(psi.getName()),
                psi.isMutable(), psi.hasValOrVar(), psi.hasDefaultValue(), null
        );
    }

    @Override
    public void serialize(@NotNull KotlinParameterStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
        dataStream.writeBoolean(stub.isMutable());
        dataStream.writeBoolean(stub.hasValOrVar());
        dataStream.writeBoolean(stub.hasDefaultValue());
        FqName name = stub.getFqName();
        dataStream.writeName(name != null ? name.asString() : null);
        dataStream.writeName(stub instanceof KotlinParameterStubImpl ? ((KotlinParameterStubImpl) stub).getFunctionTypeParameterName() : null);
    }

    @NotNull
    @Override
    public KotlinParameterStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef name = dataStream.readName();
        boolean isMutable = dataStream.readBoolean();
        boolean hasValOrValNode = dataStream.readBoolean();
        boolean hasDefaultValue = dataStream.readBoolean();
        StringRef fqName = dataStream.readName();

        return new KotlinParameterStubImpl((StubElement<?>) parentStub, fqName, name, isMutable, hasValOrValNode, hasDefaultValue,
                                           dataStream.readNameString());
    }

    @Override
    public void indexStub(@NotNull KotlinParameterStub stub, @NotNull IndexSink sink) {
        StubIndexService.getInstance().indexParameter(stub, sink);
    }
}
