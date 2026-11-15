package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiTypeElement extends com.intellij.psi.PsiElement, com.intellij.psi.PsiAnnotationOwner {
    com.intellij.psi.PsiType getType();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiTypeElement
    public static final com.intellij.psi.PsiTypeElement[] EMPTY_ARRAY = null;
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiTypeElement> ARRAY_FACTORY = null;
    public com.intellij.psi.PsiJavaCodeReferenceElement getInnermostComponentReferenceElement();
    public default boolean isInferredType() { return false; }
    public default boolean acceptsAnnotations() { return false; }
}
