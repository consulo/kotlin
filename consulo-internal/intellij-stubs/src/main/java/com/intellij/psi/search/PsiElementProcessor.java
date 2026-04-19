package com.intellij.psi.search;

@SuppressWarnings("all")
public interface PsiElementProcessor<T extends com.intellij.psi.PsiElement> {
    boolean execute(T element);
}
