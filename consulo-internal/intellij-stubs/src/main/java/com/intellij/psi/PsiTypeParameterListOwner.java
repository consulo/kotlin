package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiTypeParameterListOwner extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.PsiMember, com.intellij.lang.jvm.JvmTypeParametersOwner, com.intellij.psi.PsiJvmModifiersOwner {
    com.intellij.psi.PsiTypeParameterList getTypeParameterList();
    com.intellij.psi.PsiTypeParameter[] getTypeParameters();
    boolean hasTypeParameters();
    com.intellij.psi.PsiClass getContainingClass();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiTypeParameterListOwner

}
