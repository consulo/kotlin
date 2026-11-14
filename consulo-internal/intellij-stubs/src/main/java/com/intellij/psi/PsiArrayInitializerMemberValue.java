package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiArrayInitializerMemberValue extends com.intellij.psi.PsiAnnotationMemberValue {
    com.intellij.psi.PsiAnnotationMemberValue[] getInitializers();
}
