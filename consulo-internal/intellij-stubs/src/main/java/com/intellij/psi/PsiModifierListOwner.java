package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiModifierListOwner extends com.intellij.psi.PsiElement, com.intellij.lang.jvm.JvmModifiersOwner {
    default boolean hasAnnotation(String fqn) { return false; }
    com.intellij.psi.PsiModifierList getModifierList();
    boolean hasModifierProperty(String name);
    default com.intellij.psi.PsiAnnotation[] getAnnotations() {
        com.intellij.psi.PsiModifierList list = getModifierList();
        return list == null ? new com.intellij.psi.PsiAnnotation[0] : list.getAnnotations();
    }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiModifierListOwner
    public default boolean hasModifier(com.intellij.lang.jvm.JvmModifier p0) { return false; }
    public default com.intellij.psi.PsiAnnotation getAnnotation(java.lang.String p0) { return null; }
}
