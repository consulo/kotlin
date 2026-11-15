package com.intellij.psi.impl;

@SuppressWarnings("all")
public interface PsiTreeChangePreprocessor {
    void treeChanged(com.intellij.psi.impl.PsiTreeChangeEventImpl event);
}
