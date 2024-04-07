/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.util

import consulo.language.ast.LighterASTNode
import consulo.language.util.FlyweightCapableTreeStructure
import consulo.util.lang.ref.Ref

fun LighterASTNode.getChildren(tree: FlyweightCapableTreeStructure<LighterASTNode>): List<LighterASTNode> {
    val children = Ref<Array<LighterASTNode?>>()
    val count = tree.getChildren(this, children)
    return if (count > 0) children.get().filterNotNull() else emptyList()
}