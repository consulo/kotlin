package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiTypeParameterListOwner extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner {
    com.intellij.psi.PsiTypeParameterList getTypeParameterList();
    com.intellij.psi.PsiTypeParameter[] getTypeParameters();
    boolean hasTypeParameters();
    com.intellij.psi.PsiClass getContainingClass();
}
