package com.intellij.codeInsight.daemon.impl;

// consulo.kotlin.compat.highlight.Divider
@SuppressWarnings("all")
public final class Divider {
    public static final class DividedElements {
        public com.intellij.psi.PsiFile psiRoot() { return null; }
        public java.util.List<com.intellij.psi.PsiElement> inside() { return null; }
        public java.util.List<com.intellij.psi.PsiElement> outside() { return null; }
        public java.util.List<com.intellij.psi.PsiElement> parents() { return null; }
    }
    public static void divideInsideAndOutsideAllRoots(com.intellij.psi.PsiFile file, com.intellij.openapi.util.TextRange restrictRange, com.intellij.openapi.util.TextRange priorityRange, java.util.function.Predicate<? super com.intellij.psi.PsiFile> rootFilter, java.util.function.Consumer<? super com.intellij.codeInsight.daemon.impl.Divider.DividedElements> processor) { }
}
