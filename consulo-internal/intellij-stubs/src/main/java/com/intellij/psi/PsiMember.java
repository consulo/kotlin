package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiMember extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.NavigatablePsiElement {
    com.intellij.psi.PsiClass getContainingClass();
    String getName();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiMember
    public static final com.intellij.psi.PsiMember[] EMPTY_ARRAY = null;
}
