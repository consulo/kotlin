package com.intellij.lexer;
@SuppressWarnings("all")
public abstract class MergingLexerAdapterBase extends Lexer {
    public MergingLexerAdapterBase(Lexer p0) {}
    public abstract MergeFunction getMergeFunction();
    public void start(CharSequence p0, int p1, int p2, int p3) {}
    public int getState() { return 0; }
    public com.intellij.psi.tree.IElementType getTokenType() { return null; }
    public int getTokenStart() { return 0; }
    public int getTokenEnd() { return 0; }
    public void advance() {}
    public CharSequence getBufferSequence() { return ""; }
    public int getBufferEnd() { return 0; }
    public com.intellij.lexer.LexerPosition getCurrentPosition() { return null; }
    public void restore(com.intellij.lexer.LexerPosition p0) {}
}
