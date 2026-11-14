package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiMember extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner {
    com.intellij.psi.PsiClass getContainingClass();
    String getName();
}
