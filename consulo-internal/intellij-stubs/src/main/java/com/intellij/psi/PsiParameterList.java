package com.intellij.psi;
@SuppressWarnings("all")
public interface PsiParameterList extends PsiElement {
    PsiParameter[] getParameters();
    int getParametersCount();
    int getParameterIndex(PsiParameter p0);
}
