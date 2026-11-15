package com.intellij.lexer;

@SuppressWarnings("all")
public class DelegateLexer extends Lexer {
    public DelegateLexer(Lexer p0) {}
    public final Lexer getDelegate() { return null; }
    public void start(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public int getState() { return 0; }
    public com.intellij.psi.tree.IElementType getTokenType() { return null; }
    public int getTokenStart() { return 0; }
    public int getTokenEnd() { return 0; }
    public void advance() {}
    public com.intellij.lexer.LexerPosition getCurrentPosition() { return null; }
    public void restore(com.intellij.lexer.LexerPosition p0) {}
    public java.lang.CharSequence getBufferSequence() { return null; }
    public int getBufferEnd() { return 0; }
}
