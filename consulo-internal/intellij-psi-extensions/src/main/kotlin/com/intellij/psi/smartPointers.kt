package com.intellij.psi

/** Matches IntelliJ's E.createSmartPointer(). */
fun <E : PsiElement> E.createSmartPointer(): SmartPsiElementPointer<E> =
    SmartPointerManager.getInstance(project).createSmartPsiElementPointer(this)
