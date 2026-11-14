package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiNameValuePair extends com.intellij.psi.PsiElement {
    PsiNameValuePair[] EMPTY_ARRAY = new PsiNameValuePair[0];
    String getName();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    String getLiteralValue();
    com.intellij.psi.PsiAnnotationMemberValue getValue();
    com.intellij.psi.PsiAnnotationMemberValue setValue(com.intellij.psi.PsiAnnotationMemberValue v);
}
