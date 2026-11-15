package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiTypeParameter extends com.intellij.psi.PsiClass, com.intellij.psi.PsiAnnotationOwner, com.intellij.lang.jvm.JvmTypeParameter {
    default boolean hasAnnotation(String fqn) { return false; }
    PsiTypeParameter[] EMPTY_ARRAY = new PsiTypeParameter[0];
    String getName();
    int getIndex();
    com.intellij.psi.PsiTypeParameterListOwner getOwner();
    com.intellij.psi.PsiReferenceList getExtendsList();
    com.intellij.psi.PsiClassType[] getExtendsListTypes();
    default com.intellij.psi.PsiClassType[] getBounds() { return getExtendsListTypes(); }
    default com.intellij.psi.PsiAnnotation[] getAnnotations() { return null; }
    default com.intellij.psi.PsiAnnotationOwner getAnnotationOwnerPsi() { return null; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiTypeParameter
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiTypeParameter> ARRAY_FACTORY = null;
}
