package com.intellij.lang;

@SuppressWarnings("all")
public abstract class LighterAST {
  public LighterAST(com.intellij.util.CharTable p0) { throw new UnsupportedOperationException("stub"); }
  public com.intellij.util.CharTable getCharTable() { return null; }
  public abstract com.intellij.lang.LighterASTNode getRoot();
  public abstract com.intellij.lang.LighterASTNode getParent(com.intellij.lang.LighterASTNode p0);
  public abstract java.util.List<com.intellij.lang.LighterASTNode> getChildren(com.intellij.lang.LighterASTNode p0);
}
