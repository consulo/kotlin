package com.intellij.psi.util

import com.intellij.openapi.project.Project
import com.intellij.psi.JavaPsiFacade
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiClassType
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementFactory
import com.intellij.psi.PsiMethod

/** Convenience: get the PsiElementFactory for a project. */
val Project.psiFactory: PsiElementFactory
    get() = JavaPsiFacade.getInstance(this).elementFactory

/** Convenience: PsiElement to ASTNode (or null). */
val PsiElement?.psi: PsiElement? get() = this

/** Method parameters as a list — works with the Kotlin extension idiom. */
val PsiMethod.parameters: Array<com.intellij.psi.PsiParameter>
    get() = parameterList.parameters

/** Find a class type by name in the given scope. */
fun PsiElementFactory.getTypeByName(qualifiedName: String, scope: com.intellij.psi.search.GlobalSearchScope): PsiClassType? {
    return createTypeByFQClassName(qualifiedName, scope)
}
