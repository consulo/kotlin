package com.intellij.lexer;

@SuppressWarnings("all")
public abstract class Lexer {
  public Lexer() { throw new UnsupportedOperationException("stub"); }
  public abstract void start(java.lang.CharSequence p0, int p1, int p2, int p3);
  public final void start(java.lang.CharSequence p0, int p1, int p2) {}
  public final void start(java.lang.CharSequence p0) {}
  public java.lang.CharSequence getTokenSequence() { return null; }
  public java.lang.String getTokenText() { return null; }
  public abstract int getState();
  public abstract com.intellij.psi.tree.IElementType getTokenType();
  public abstract int getTokenStart();
  public abstract int getTokenEnd();
  public abstract void advance();
  public abstract com.intellij.lexer.LexerPosition getCurrentPosition();
  public abstract void restore(com.intellij.lexer.LexerPosition p0);
  public abstract java.lang.CharSequence getBufferSequence();
  public abstract int getBufferEnd();
}
