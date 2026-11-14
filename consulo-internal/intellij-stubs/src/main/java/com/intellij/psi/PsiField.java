package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiField extends com.intellij.psi.PsiElement, com.intellij.psi.PsiVariable, com.intellij.psi.PsiMember, com.intellij.psi.PsiDocCommentOwner {
    PsiField[] EMPTY_ARRAY = new PsiField[0];
    com.intellij.psi.PsiClass getContainingClass();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    com.intellij.psi.PsiExpression getInitializer();
    boolean hasInitializer();
    void normalizeDeclaration();
    Object computeConstantValue();
    com.intellij.psi.PsiElement setName(String name);
}
