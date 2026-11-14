package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnnotation extends com.intellij.psi.PsiElement {
    PsiAnnotation[] EMPTY_ARRAY = new PsiAnnotation[0];
    String getQualifiedName();
    com.intellij.psi.PsiJavaCodeReferenceElement getNameReferenceElement();
    com.intellij.psi.PsiAnnotationParameterList getParameterList();
    com.intellij.psi.PsiAnnotationMemberValue findAttributeValue(String attributeName);
    com.intellij.psi.PsiAnnotationMemberValue findDeclaredAttributeValue(String attributeName);
    boolean hasQualifiedName(String qualifiedName);
    java.util.List<com.intellij.psi.PsiNameValuePair> getAttributes();
    com.intellij.psi.PsiAnnotationOwner getOwner();
}
