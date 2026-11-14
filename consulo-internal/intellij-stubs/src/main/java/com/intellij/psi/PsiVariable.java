package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiVariable extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.PsiNamedElement {
    com.intellij.psi.PsiType getType();
    com.intellij.psi.PsiTypeElement getTypeElement();
    String getName();
    com.intellij.psi.PsiExpression getInitializer();
    boolean hasInitializer();
    Object computeConstantValue();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    com.intellij.psi.PsiElement setName(String name);
    void normalizeDeclaration();
}
