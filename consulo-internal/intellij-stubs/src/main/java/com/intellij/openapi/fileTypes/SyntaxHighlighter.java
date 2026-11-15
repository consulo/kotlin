package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public interface SyntaxHighlighter {
    com.intellij.lexer.Lexer getHighlightingLexer();
    com.intellij.openapi.editor.colors.TextAttributesKey[] getTokenHighlights(com.intellij.psi.tree.IElementType p0);
}
