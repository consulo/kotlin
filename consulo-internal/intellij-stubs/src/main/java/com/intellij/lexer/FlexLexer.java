package com.intellij.lexer;

@SuppressWarnings("all")
public interface FlexLexer {
  public abstract void yybegin(int p0);
  public abstract int yystate();
  public abstract int getTokenStart();
  public abstract int getTokenEnd();
  public abstract com.intellij.psi.tree.IElementType advance() throws java.io.IOException;
  public abstract void reset(java.lang.CharSequence p0, int p1, int p2, int p3);
}
