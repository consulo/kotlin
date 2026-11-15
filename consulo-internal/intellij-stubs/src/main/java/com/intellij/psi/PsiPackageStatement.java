package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiPackageStatement extends com.intellij.psi.PsiElement {
    default String getPackageName() { return null; }
    default com.intellij.psi.PsiModifierList getAnnotationList() { return null; }
}
