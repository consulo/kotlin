package com.intellij.psi.util;
@SuppressWarnings("all")
public interface PsiElementFilter {
    boolean isAccepted(com.intellij.psi.PsiElement element);
}
