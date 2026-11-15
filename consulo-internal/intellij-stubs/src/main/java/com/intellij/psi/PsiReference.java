package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiReference {
    PsiReference[] EMPTY_ARRAY = new PsiReference[0];
    com.intellij.psi.PsiElement getElement();
    com.intellij.openapi.util.TextRange getRangeInElement();
    com.intellij.psi.PsiElement resolve();
    String getCanonicalText();
    com.intellij.psi.PsiElement handleElementRename(String newName);
    com.intellij.psi.PsiElement bindToElement(com.intellij.psi.PsiElement element);
    boolean isReferenceTo(com.intellij.psi.PsiElement element);
    default boolean isSoft() { return false; }
    // Added by consulo-internal/remap/genstub.py from consulo.language.psi.PsiReference
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiReference> ARRAY_FACTORY = null;
    public default com.intellij.openapi.util.TextRange getAbsoluteRange() { return null; }
    public default java.lang.Object[] getVariants() { return null; }
}
