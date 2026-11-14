package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiParameter extends com.intellij.psi.PsiElement, com.intellij.psi.PsiVariable {
    PsiParameter[] EMPTY_ARRAY = new PsiParameter[0];
    com.intellij.psi.PsiElement getDeclarationScope();
    boolean isVarArgs();
}
