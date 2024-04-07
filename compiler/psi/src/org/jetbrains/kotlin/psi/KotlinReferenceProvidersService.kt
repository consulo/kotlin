/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi

import consulo.language.psi.PsiElement
import consulo.language.psi.PsiReference
import consulo.project.Project

open class KotlinReferenceProvidersService {
    open fun getReferences(psiElement: PsiElement): Array<PsiReference> = PsiReference.EMPTY_ARRAY

    companion object {
        private val NO_REFERENCES_SERVICE = KotlinReferenceProvidersService()

        @JvmStatic
        fun getInstance(project: Project): KotlinReferenceProvidersService {
            return project.getInstance(KotlinReferenceProvidersService::class.java) ?: NO_REFERENCES_SERVICE
        }

        @JvmStatic
        fun getReferencesFromProviders(psiElement: PsiElement): Array<PsiReference> {
            return getInstance(psiElement.project).getReferences(psiElement)
        }
    }
}
