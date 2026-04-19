package com.intellij.lexer;

@SuppressWarnings("all")
public abstract class LexerBase extends Lexer {
    public LexerBase() { super(); }
    public LexerPosition getCurrentPosition() { return null; }
    public void restore(LexerPosition position) {}
}
