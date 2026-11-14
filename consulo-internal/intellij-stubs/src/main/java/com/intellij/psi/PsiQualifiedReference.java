package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiQualifiedReference extends com.intellij.psi.PsiReference {
    com.intellij.psi.PsiElement getQualifier();
    String getReferenceName();
}
