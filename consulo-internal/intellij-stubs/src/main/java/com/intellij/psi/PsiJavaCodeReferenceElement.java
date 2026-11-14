package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiJavaCodeReferenceElement extends com.intellij.psi.PsiElement {
    com.intellij.psi.PsiElement getReferenceNameElement();
    String getReferenceName();
    String getQualifiedName();
    com.intellij.psi.PsiElement getQualifier();
    com.intellij.psi.PsiElement resolve();
    com.intellij.psi.PsiType[] getTypeParameters();
    boolean isQualified();
}
