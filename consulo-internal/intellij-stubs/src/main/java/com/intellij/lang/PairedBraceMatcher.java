package com.intellij.lang;

@SuppressWarnings("all")
public interface PairedBraceMatcher {
    BracePair[] getPairs();
    boolean isPairedBracesAllowedBeforeType(com.intellij.psi.tree.IElementType p0, com.intellij.psi.tree.IElementType p1);
    int getCodeConstructStart(com.intellij.psi.PsiFile p0, int p1);
}
