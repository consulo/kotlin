package com.intellij.codeInsight;

@SuppressWarnings("all")
public abstract class ExternalAnnotationsManager {
    public static ExternalAnnotationsManager getInstance(com.intellij.openapi.project.Project p) { return null; }
    public abstract com.intellij.psi.PsiAnnotation findExternalAnnotation(com.intellij.psi.PsiModifierListOwner listOwner, String annotationFQN);
    public abstract com.intellij.psi.PsiAnnotation[] findExternalAnnotations(com.intellij.psi.PsiModifierListOwner listOwner);
    public abstract boolean isExternalAnnotation(com.intellij.psi.PsiAnnotation annotation);
}
