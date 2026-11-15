package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiParameterList extends com.intellij.psi.PsiElement {
    int getParametersCount();
    com.intellij.psi.PsiParameter[] getParameters();
    default com.intellij.psi.PsiParameter getParameter(int index) { return null; }
    int getParameterIndex(com.intellij.psi.PsiParameter parameter);
    default boolean isEmpty() { return false; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiParameterList

}
