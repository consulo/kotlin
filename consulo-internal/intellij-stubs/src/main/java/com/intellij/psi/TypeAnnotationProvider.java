package com.intellij.psi;

@SuppressWarnings("all")
public interface TypeAnnotationProvider {
    TypeAnnotationProvider EMPTY = new TypeAnnotationProvider() { public com.intellij.psi.PsiAnnotation[] getAnnotations() { return new com.intellij.psi.PsiAnnotation[0]; } };
    com.intellij.psi.PsiAnnotation[] getAnnotations();
    static TypeAnnotationProvider create(com.intellij.psi.PsiAnnotation[] annotations) {
        return new TypeAnnotationProvider() { public com.intellij.psi.PsiAnnotation[] getAnnotations() { return annotations; } };
    }
}
