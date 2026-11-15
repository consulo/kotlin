package com.intellij.psi.search;

// consulo.kotlin.compat.search.RequestResultProcessor
@SuppressWarnings("all")
public abstract class RequestResultProcessor {
    protected RequestResultProcessor(java.lang.Object... equality) { }
    public abstract boolean processTextOccurrence(com.intellij.psi.PsiElement element, int offsetInElement, com.intellij.util.Processor<? super com.intellij.psi.PsiReference> consumer);
}
