package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnnotationParameterList extends com.intellij.psi.PsiElement {
    com.intellij.psi.PsiNameValuePair[] getAttributes();
}
