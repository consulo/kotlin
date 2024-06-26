/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi

import consulo.language.ast.ASTNode
import org.jetbrains.kotlin.psi.stubs.KotlinPlaceHolderStub
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes

class KtContractEffectList : KtElementImplStub<KotlinPlaceHolderStub<KtContractEffectList>> {
    constructor(node: ASTNode) : super(node)
    constructor(stub: KotlinPlaceHolderStub<KtContractEffectList>) : super(stub, KtStubElementTypes.CONTRACT_EFFECT_LIST)
}

fun KtContractEffectList.getContractEffects(): List<KtContractEffect> =
    getStubOrPsiChildrenAsList(KtStubElementTypes.CONTRACT_EFFECT)
