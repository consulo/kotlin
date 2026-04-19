package com.intellij.lang;

@SuppressWarnings("all")
public interface WhitespacesAndCommentsBinder {
  interface TokenTextGetter {
    CharSequence get(int index);
  }
  public default boolean isRecursive() { return false; }
  public abstract int getEdgePosition(java.util.List<? extends com.intellij.psi.tree.IElementType> p0, boolean p1, com.intellij.lang.WhitespacesAndCommentsBinder.TokenTextGetter p2);
}
