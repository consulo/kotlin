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

package org.jetbrains.kotlin.psi.stubs.impl

import org.jetbrains.kotlin.psi.KtTypeParameter
import org.jetbrains.kotlin.psi.stubs.KotlinTypeParameterStub
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes
import consulo.index.io.StringRef
import consulo.language.psi.PsiElement
import consulo.language.psi.stub.StubElement

class KotlinTypeParameterStubImpl(
    parent: StubElement<out PsiElement>?,
    private val name: StringRef?,
    private val isInVariance: Boolean,
    private val isOutVariance: Boolean
) : KotlinStubBaseImpl<KtTypeParameter>(parent, KtStubElementTypes.TYPE_PARAMETER), KotlinTypeParameterStub {
    override fun isInVariance() = isInVariance
    override fun isOutVariance() = isOutVariance
    override fun getName() = StringRef.toString(name)
    // type parameters don't have FqNames
    override fun getFqName() = null
}
