package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnnotationOwner {
    com.intellij.psi.PsiAnnotation[] getAnnotations();
    com.intellij.psi.PsiAnnotation[] getApplicableAnnotations();
    com.intellij.psi.PsiAnnotation findAnnotation(String qualifiedName);
    com.intellij.psi.PsiAnnotation addAnnotation(String qualifiedName);
    boolean hasAnnotation(String qualifiedName);
}
