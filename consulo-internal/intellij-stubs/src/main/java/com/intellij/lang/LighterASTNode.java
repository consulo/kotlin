package com.intellij.lang;

@SuppressWarnings("all")
public interface LighterASTNode {
  public static final LighterASTNode[] EMPTY_ARRAY = new LighterASTNode[0];
  public abstract com.intellij.psi.tree.IElementType getTokenType();
  public abstract int getStartOffset();
  public abstract int getEndOffset();
  public default int getTextLength() { return 0; }
}
