package com.intellij.psi;
@SuppressWarnings("all")
public interface ResolveResult {
    PsiElement getElement();
    boolean isValidResult();
}
