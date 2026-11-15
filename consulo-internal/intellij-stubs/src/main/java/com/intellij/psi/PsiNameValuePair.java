package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiNameValuePair extends com.intellij.psi.PsiElement, com.intellij.lang.jvm.annotation.JvmAnnotationAttribute {
    PsiNameValuePair[] EMPTY_ARRAY = new PsiNameValuePair[0];
    String getName();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    String getLiteralValue();
    com.intellij.psi.PsiAnnotationMemberValue getValue();
    com.intellij.psi.PsiAnnotationMemberValue setValue(com.intellij.psi.PsiAnnotationMemberValue v);
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiNameValuePair
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiNameValuePair> ARRAY_FACTORY = null;
    public default com.intellij.psi.PsiAnnotationMemberValue getDetachedValue() { return null; }
    public default java.lang.String getAttributeName() { return null; }
    public default com.intellij.lang.jvm.annotation.JvmAnnotationAttributeValue getAttributeValue() { return null; }
}
