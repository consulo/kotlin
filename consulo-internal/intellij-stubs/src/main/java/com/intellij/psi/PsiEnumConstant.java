package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiEnumConstant extends com.intellij.psi.PsiField, com.intellij.psi.PsiConstructorCall, com.intellij.lang.jvm.JvmEnumField {
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiEnumConstant
    public com.intellij.psi.PsiExpressionList getArgumentList();
    public com.intellij.psi.PsiEnumConstantInitializer getInitializingClass();
    public com.intellij.psi.PsiEnumConstantInitializer getOrCreateInitializingClass();
}
