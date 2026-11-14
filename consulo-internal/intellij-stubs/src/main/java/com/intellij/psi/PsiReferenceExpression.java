package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiReferenceExpression extends com.intellij.psi.PsiExpression, com.intellij.psi.PsiJavaCodeReferenceElement {
    com.intellij.psi.PsiExpression getQualifierExpression();
    com.intellij.psi.PsiElement getQualifier();
    String getReferenceName();
    com.intellij.psi.PsiElement resolve();
    com.intellij.psi.PsiType getType();
    com.intellij.psi.PsiIdentifier getReferenceNameElement();
    void setQualifierExpression(com.intellij.psi.PsiExpression expression);
}
