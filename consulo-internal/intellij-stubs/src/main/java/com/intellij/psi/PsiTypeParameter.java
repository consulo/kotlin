package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiTypeParameter extends com.intellij.psi.PsiClass, com.intellij.psi.PsiAnnotationOwner {
    PsiTypeParameter[] EMPTY_ARRAY = new PsiTypeParameter[0];
    String getName();
    int getIndex();
    com.intellij.psi.PsiTypeParameterListOwner getOwner();
    com.intellij.psi.PsiReferenceList getExtendsList();
    com.intellij.psi.PsiClassType[] getExtendsListTypes();
    default com.intellij.psi.PsiClassType[] getBounds() { return getExtendsListTypes(); }
    com.intellij.psi.PsiAnnotation[] getAnnotations();
    com.intellij.psi.PsiAnnotationOwner getAnnotationOwnerPsi();
}
