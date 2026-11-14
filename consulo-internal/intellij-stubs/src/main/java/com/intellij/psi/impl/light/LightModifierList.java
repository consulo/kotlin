package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public class LightModifierList extends com.intellij.psi.impl.PsiElementBase implements com.intellij.psi.PsiModifierList {
    public LightModifierList(com.intellij.psi.PsiManager manager) {}
    public LightModifierList(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language, String... modifiers) {}
    public boolean hasModifierProperty(String name) { return false; }
    public boolean hasExplicitModifier(String name) { return false; }
    public void setModifierProperty(String name, boolean value) {}
    public void checkSetModifierProperty(String name, boolean value) {}
    public com.intellij.psi.PsiAnnotation[] getAnnotations() { return new com.intellij.psi.PsiAnnotation[0]; }
    public com.intellij.psi.PsiAnnotation[] getApplicableAnnotations() { return new com.intellij.psi.PsiAnnotation[0]; }
    public com.intellij.psi.PsiAnnotation findAnnotation(String qualifiedName) { return null; }
    public com.intellij.psi.PsiAnnotation addAnnotation(String qualifiedName) { return null; }
    public boolean hasAnnotation(String qualifiedName) { return false; }
}
