/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi

import consulo.language.ast.ASTNode
import org.jetbrains.kotlin.psi.stubs.KotlinValueArgumentStub
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes

class KtLambdaArgument : KtValueArgument, LambdaArgument {
    constructor(node: ASTNode) : super(node)

    constructor(stub: KotlinValueArgumentStub<KtLambdaArgument>) : super(stub, KtStubElementTypes.LAMBDA_ARGUMENT) {}

    override fun getLambdaExpression(): KtLambdaExpression? = getArgumentExpression()?.unpackFunctionLiteral()
}
