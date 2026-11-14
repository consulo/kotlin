package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiParameterList extends com.intellij.psi.PsiElement {
    int getParametersCount();
    com.intellij.psi.PsiParameter[] getParameters();
    com.intellij.psi.PsiParameter getParameter(int index);
    int getParameterIndex(com.intellij.psi.PsiParameter parameter);
    boolean isEmpty();
}
