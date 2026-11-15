package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiParameter extends com.intellij.psi.PsiElement, com.intellij.psi.PsiVariable, com.intellij.lang.jvm.JvmParameter, com.intellij.psi.PsiJvmModifiersOwner, com.intellij.navigation.NavigationItem {
    PsiParameter[] EMPTY_ARRAY = new PsiParameter[0];
    com.intellij.psi.PsiElement getDeclarationScope();
    boolean isVarArgs();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiParameter
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiParameter> ARRAY_FACTORY = null;
    public default com.intellij.psi.PsiAnnotation[] getAnnotations() { return null; }
}
