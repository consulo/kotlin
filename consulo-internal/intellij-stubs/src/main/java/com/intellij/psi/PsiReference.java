package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiReference {
    PsiReference[] EMPTY_ARRAY = new PsiReference[0];
    PsiElement getElement();
    com.intellij.openapi.util.TextRange getRangeInElement();
    PsiElement resolve();
    String getCanonicalText();
    PsiElement handleElementRename(String p0);
    PsiElement bindToElement(PsiElement p0);
    boolean isReferenceTo(PsiElement p0);
    boolean isSoft();
}
