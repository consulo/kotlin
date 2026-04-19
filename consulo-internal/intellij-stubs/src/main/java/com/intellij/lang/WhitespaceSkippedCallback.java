package com.intellij.lang;

@SuppressWarnings("all")
public interface WhitespaceSkippedCallback {
    void onSkip(com.intellij.psi.tree.IElementType type, int start, int end);
}
