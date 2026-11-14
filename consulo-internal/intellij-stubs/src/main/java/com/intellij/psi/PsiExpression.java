package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiExpression extends com.intellij.psi.PsiElement, com.intellij.psi.PsiAnnotationMemberValue {
    PsiExpression[] EMPTY_ARRAY = new PsiExpression[0];
    com.intellij.psi.PsiType getType();
}
