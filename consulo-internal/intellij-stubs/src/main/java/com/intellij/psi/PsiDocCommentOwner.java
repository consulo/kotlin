package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiDocCommentOwner extends com.intellij.psi.PsiElement {
    com.intellij.psi.javadoc.PsiDocComment getDocComment();
    boolean isDeprecated();
}
