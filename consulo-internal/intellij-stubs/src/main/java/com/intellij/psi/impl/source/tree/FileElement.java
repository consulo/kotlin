package com.intellij.psi.impl.source.tree;

@SuppressWarnings("all")
public class FileElement extends com.intellij.psi.impl.source.tree.LazyParseableElement implements com.intellij.lang.FileASTNode {
  public static final com.intellij.psi.impl.source.tree.FileElement[] EMPTY_ARRAY = null;
  protected com.intellij.psi.PsiElement createPsiNoLock() { return null; }
  public void detachFromFile() {}
  public com.intellij.util.CharTable getCharTable() { return null; }
  public com.intellij.lang.LighterAST getLighterAST() { return null; }
  public FileElement(com.intellij.psi.tree.IElementType p0, java.lang.CharSequence p1) { super(p0, p1); }
  public com.intellij.psi.impl.PsiManagerEx getManager() { return null; }
  public com.intellij.lang.ASTNode copyElement() { return null; }
  public void setCharTable(com.intellij.util.CharTable p0) {}
  public void clearCaches() {}
  public final com.intellij.psi.impl.source.tree.AstSpine getStubbedSpine() { return null; }
}
