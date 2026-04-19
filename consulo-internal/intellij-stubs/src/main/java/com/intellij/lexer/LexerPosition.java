package com.intellij.lexer;

@SuppressWarnings("all")
public interface LexerPosition {
    int getOffset();
    int getState();
}
