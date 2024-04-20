/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.asJava.elements

import com.intellij.java.language.impl.psi.impl.light.LightTypeParameterListBuilder
import com.intellij.java.language.psi.PsiTypeParameterListOwner
import consulo.language.psi.PsiElement
import consulo.language.psi.PsiFile
import consulo.language.psi.resolve.PsiScopeProcessor
import consulo.language.psi.resolve.ResolveState
import org.jetbrains.kotlin.idea2.KotlinLanguage

class KotlinLightTypeParameterListBuilder(private val owner: PsiTypeParameterListOwner) :
    LightTypeParameterListBuilder(owner.manager, KotlinLanguage.INSTANCE) {
    override fun processDeclarations(
        processor: PsiScopeProcessor,
        state: ResolveState,
        lastParent: PsiElement?,
        place: PsiElement
    ): Boolean {
        return typeParameters.all { processor.execute(it, state) }
    }

    override fun getParent(): PsiElement = owner
    override fun getContainingFile(): PsiFile = owner.containingFile

    override fun getText(): String? = ""
}
