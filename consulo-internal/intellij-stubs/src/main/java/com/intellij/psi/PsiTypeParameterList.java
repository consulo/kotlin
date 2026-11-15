package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiTypeParameterList extends com.intellij.psi.PsiElement {
    com.intellij.psi.PsiTypeParameter[] getTypeParameters();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiTypeParameterList
    public int getTypeParameterIndex(com.intellij.psi.PsiTypeParameter p0);
}
