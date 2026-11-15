package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiReferenceExpression extends com.intellij.psi.PsiExpression, com.intellij.psi.PsiJavaCodeReferenceElement {
    com.intellij.psi.PsiExpression getQualifierExpression();
    com.intellij.psi.PsiElement getQualifier();
    String getReferenceName();
    com.intellij.psi.PsiElement resolve();
    com.intellij.psi.PsiType getType();
    com.intellij.psi.PsiElement getReferenceNameElement();
    void setQualifierExpression(com.intellij.psi.PsiExpression expression);
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiReferenceExpression
    public com.intellij.psi.PsiElement bindToElementViaStaticImport(com.intellij.psi.PsiClass p0) throws com.intellij.util.IncorrectOperationException;
}
