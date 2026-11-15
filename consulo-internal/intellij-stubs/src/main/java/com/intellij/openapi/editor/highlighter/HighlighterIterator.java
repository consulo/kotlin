package com.intellij.openapi.editor.highlighter;

@SuppressWarnings("all")
public interface HighlighterIterator {
    int getStart();
    int getEnd();
    com.intellij.psi.tree.IElementType getTokenType();
    void advance();
    void retreat();
    boolean atEnd();
    com.intellij.openapi.editor.Document getDocument();
}
