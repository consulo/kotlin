package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiRecordComponent extends com.intellij.psi.PsiElement, com.intellij.psi.PsiMember, com.intellij.psi.PsiNamedElement, com.intellij.psi.PsiVariable {
    PsiRecordComponent[] EMPTY_ARRAY = new PsiRecordComponent[0];
    com.intellij.psi.PsiType getType();
    com.intellij.psi.PsiTypeElement getTypeElement();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    com.intellij.psi.PsiClass getContainingClass();
    boolean isVarArgs();
    String getName();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiRecordComponent
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiRecordComponent> ARRAY_FACTORY = null;
}
