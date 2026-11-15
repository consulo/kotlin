package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiJavaCodeReferenceElement extends com.intellij.psi.PsiElement, com.intellij.psi.PsiQualifiedReferenceElement, com.intellij.psi.PsiJavaReference {
    PsiJavaCodeReferenceElement[] EMPTY_ARRAY = new PsiJavaCodeReferenceElement[0];
    com.intellij.psi.PsiElement getReferenceNameElement();
    String getReferenceName();
    String getQualifiedName();
    com.intellij.psi.PsiElement getQualifier();
    com.intellij.psi.PsiElement resolve();
    com.intellij.psi.PsiType[] getTypeParameters();
    boolean isQualified();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiJavaCodeReferenceElement
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiJavaCodeReferenceElement> ARRAY_FACTORY = null;
    public com.intellij.psi.PsiReferenceParameterList getParameterList();
    public default int getTypeParameterCount() { return 0; }
}
