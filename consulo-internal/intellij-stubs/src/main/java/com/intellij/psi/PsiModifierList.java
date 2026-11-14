package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiModifierList extends com.intellij.psi.PsiElement, com.intellij.psi.PsiAnnotationOwner {
    boolean hasModifierProperty(String name);
    boolean hasExplicitModifier(String name);
    void setModifierProperty(String name, boolean value);
    void checkSetModifierProperty(String name, boolean value);
    com.intellij.psi.PsiAnnotation[] getAnnotations();
    com.intellij.psi.PsiAnnotation[] getApplicableAnnotations();
    com.intellij.psi.PsiAnnotation findAnnotation(String qualifiedName);
    com.intellij.psi.PsiAnnotation addAnnotation(String qualifiedName);
    boolean hasAnnotation(String qualifiedName);
    com.intellij.psi.PsiElement getParent();
}
