package com.intellij.psi.tree;

@SuppressWarnings("all")
public final class TokenSet {
  public static final com.intellij.psi.tree.TokenSet EMPTY = null;
  public static final com.intellij.psi.tree.TokenSet ANY = null;
  public static final com.intellij.psi.tree.TokenSet WHITE_SPACE = null;
  public boolean contains(com.intellij.psi.tree.IElementType p0) { return false; }
  public com.intellij.psi.tree.IElementType[] getTypes() { return null; }
  public java.lang.String toString() { return null; }
  public static com.intellij.psi.tree.TokenSet create(com.intellij.psi.tree.IElementType... p0) { return null; }
  public static com.intellij.psi.tree.TokenSet forAllMatching(com.intellij.psi.tree.IElementType.Predicate p0) { return null; }
  public static com.intellij.psi.tree.TokenSet orSet(com.intellij.psi.tree.TokenSet... p0) { return null; }
  public static com.intellij.psi.tree.TokenSet andSet(com.intellij.psi.tree.TokenSet p0, com.intellij.psi.tree.TokenSet p1) { return null; }
  public static com.intellij.psi.tree.TokenSet andNot(com.intellij.psi.tree.TokenSet p0, com.intellij.psi.tree.TokenSet p1) { return null; }
}
