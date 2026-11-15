package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnnotationOwner {
    com.intellij.psi.PsiAnnotation[] getAnnotations();
    com.intellij.psi.PsiAnnotation[] getApplicableAnnotations();
    com.intellij.psi.PsiAnnotation findAnnotation(String qualifiedName);
    com.intellij.psi.PsiAnnotation addAnnotation(String qualifiedName);
    default boolean hasAnnotation(String qualifiedName) { return false; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiAnnotationOwner
    public default boolean hasAnnotations() { return false; }
}
