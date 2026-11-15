package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiModifierListOwner extends com.intellij.psi.PsiElement {
    default boolean hasAnnotation(String fqn) { return false; }
    com.intellij.psi.PsiModifierList getModifierList();
    boolean hasModifierProperty(String name);
    default com.intellij.psi.PsiAnnotation[] getAnnotations() {
        com.intellij.psi.PsiModifierList list = getModifierList();
        return list == null ? new com.intellij.psi.PsiAnnotation[0] : list.getAnnotations();
    }
}
