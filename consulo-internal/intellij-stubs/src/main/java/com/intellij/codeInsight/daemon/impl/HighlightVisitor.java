package com.intellij.codeInsight.daemon.impl;

// consulo.kotlin.compat.highlight.HighlightVisitor
@SuppressWarnings("all")
public interface HighlightVisitor {
    boolean suitableForFile(com.intellij.psi.PsiFile file);
    void visit(com.intellij.psi.PsiElement element);
    boolean analyze(com.intellij.psi.PsiFile file, boolean updateWholeFile, com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder holder, java.lang.Runnable action);
    HighlightVisitor clone();
}
