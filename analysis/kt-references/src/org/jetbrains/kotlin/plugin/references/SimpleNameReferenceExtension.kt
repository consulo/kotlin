/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.plugin.references

import consulo.component.extension.ExtensionPointName
import consulo.language.psi.PsiElement
import org.jetbrains.kotlin.idea.references.KtSimpleNameReference
import org.jetbrains.kotlin.psi.KtPsiFactory

interface SimpleNameReferenceExtension {
    companion object {
        val EP_NAME: ExtensionPointName<SimpleNameReferenceExtension> =
            ExtensionPointName.create(SimpleNameReferenceExtension::class.java)
    }

    fun isReferenceTo(reference: KtSimpleNameReference, element: PsiElement): Boolean

    fun handleElementRename(reference: KtSimpleNameReference, psiFactory: KtPsiFactory, newElementName: String): PsiElement?
}
