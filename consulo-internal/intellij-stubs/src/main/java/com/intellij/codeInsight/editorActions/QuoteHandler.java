package com.intellij.codeInsight.editorActions;

@SuppressWarnings("all")
public interface QuoteHandler {
    boolean isClosingQuote(com.intellij.openapi.editor.highlighter.HighlighterIterator iterator, int offset);
    boolean isOpeningQuote(com.intellij.openapi.editor.highlighter.HighlighterIterator iterator, int offset);
    boolean hasNonClosedLiteral(com.intellij.openapi.editor.Editor editor, com.intellij.openapi.editor.highlighter.HighlighterIterator iterator, int offset);
    boolean isInsideLiteral(com.intellij.openapi.editor.highlighter.HighlighterIterator iterator);
}
