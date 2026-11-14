package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnnotationMethod extends com.intellij.psi.PsiMethod {
    com.intellij.psi.PsiAnnotationMemberValue getDefaultValue();
}
