/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.asJava.classes

import com.intellij.java.language.impl.psi.impl.light.LightReferenceListBuilder
import com.intellij.java.language.impl.psi.impl.light.LightTypeParameterBuilder
import com.intellij.java.language.psi.PsiTypeParameterListOwner
import consulo.language.psi.PsiElement
import consulo.language.psi.PsiFile
import org.jetbrains.kotlin.asJava.elements.PsiElementWithOrigin
import org.jetbrains.kotlin.asJava.unwrapped
import org.jetbrains.kotlin.psi.KtTypeParameter
import org.jetbrains.kotlin.psi.KtTypeParameterListOwner

class KtUltraLightTypeParameter(
    name: String,
    private val myOwner: PsiTypeParameterListOwner,
    private val myParent: PsiElement,
    index: Int,
    referenceListBuilder: (PsiElement) -> KotlinLightReferenceListBuilder
) :
    LightTypeParameterBuilder(name, myOwner, index),
    PsiElementWithOrigin<KtTypeParameter> {

    private val superList: LightReferenceListBuilder by lazyPub { referenceListBuilder(this) }

    override val origin: KtTypeParameter get() = (myOwner.unwrapped as KtTypeParameterListOwner).typeParameters[index]

    override fun getExtendsList(): LightReferenceListBuilder = superList

    override fun getParent(): PsiElement = myParent

    override fun getContainingFile(): PsiFile = myOwner.containingFile

    override fun getUseScope() = origin.useScope
}