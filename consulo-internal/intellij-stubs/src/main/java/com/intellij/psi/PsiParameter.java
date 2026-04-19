package com.intellij.psi;
@SuppressWarnings("all")
public interface PsiParameter extends PsiElement {
    PsiType getType();
    String getName();
}
