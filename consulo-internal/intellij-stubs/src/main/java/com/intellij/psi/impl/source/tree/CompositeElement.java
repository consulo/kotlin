package com.intellij.psi.impl.source.tree;

@SuppressWarnings("all")
public class CompositeElement extends com.intellij.psi.impl.source.tree.TreeElement {
  public static final com.intellij.psi.impl.source.tree.CompositeElement[] EMPTY_ARRAY = null;
  public CompositeElement(com.intellij.psi.tree.IElementType p0) { super(p0); }
  public com.intellij.psi.impl.source.tree.CompositeElement clone() { return null; }
  public void subtreeChanged() {}
  public void clearCaches() {}
  public void acceptTree(com.intellij.psi.impl.source.tree.TreeElementVisitor p0) {}
  public com.intellij.psi.impl.source.tree.LeafElement findLeafElementAt(int p0) { return null; }
  public com.intellij.psi.PsiElement findPsiChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
  public com.intellij.psi.PsiElement findPsiChildByType(com.intellij.psi.tree.TokenSet p0) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.IElementType p0, com.intellij.lang.ASTNode p1) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.TokenSet p0) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.TokenSet p0, com.intellij.lang.ASTNode p1) { return null; }
  public java.lang.String getText() { return null; }
  public java.lang.CharSequence getChars() { return null; }
  public char[] textToCharArray() { return null; }
  public boolean textContains(char p0) { return false; }
  protected int textMatches(java.lang.CharSequence p0, int p1) { return 0; }
  public final com.intellij.psi.PsiElement findChildByRoleAsPsiElement(int p0) { return null; }
  public com.intellij.lang.ASTNode findChildByRole(int p0) { return null; }
  public int getChildRole(com.intellij.lang.ASTNode p0) { return 0; }
  protected final int getChildRole(com.intellij.lang.ASTNode p0, int p1) { return 0; }
  public com.intellij.lang.ASTNode[] getChildren(com.intellij.psi.tree.TokenSet p0) { return null; }
  public <T extends com.intellij.psi.PsiElement> T[] getChildrenAsPsiElements(com.intellij.psi.tree.TokenSet p0, com.intellij.util.ArrayFactory<? extends T> p1) { return null; }
  public <T extends com.intellij.psi.PsiElement> T[] getChildrenAsPsiElements(com.intellij.psi.tree.IElementType p0, com.intellij.util.ArrayFactory<? extends T> p1) { return null; }
  public int countChildren(com.intellij.psi.tree.TokenSet p0) { return 0; }
  public com.intellij.psi.impl.source.tree.TreeElement addInternal(com.intellij.psi.impl.source.tree.TreeElement p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2, java.lang.Boolean p3) { return null; }
  public void deleteChildInternal(com.intellij.lang.ASTNode p0) {}
  public void replaceChildInternal(com.intellij.lang.ASTNode p0, com.intellij.psi.impl.source.tree.TreeElement p1) {}
  public int getTextLength() { return 0; }
  public int hc() { return 0; }
  public int getCachedLength() { return 0; }
  public com.intellij.psi.impl.source.tree.TreeElement getFirstChildNode() { return null; }
  public com.intellij.psi.impl.source.tree.TreeElement getLastChildNode() { return null; }
  public void addChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public void addLeaf(com.intellij.psi.tree.IElementType p0, java.lang.CharSequence p1, com.intellij.lang.ASTNode p2) {}
  public void addChild(com.intellij.lang.ASTNode p0) {}
  public void removeChild(com.intellij.lang.ASTNode p0) {}
  public void removeRange(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public void replaceChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public void replaceAllChildrenToChildrenOf(com.intellij.lang.ASTNode p0) {}
  public void removeAllChildren() {}
  public void addChildren(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2) {}
  public final com.intellij.psi.PsiElement getPsi() { return null; }
  public <T extends com.intellij.psi.PsiElement> T getPsi(java.lang.Class<T> p0) { return null; }
  protected com.intellij.psi.PsiElement createPsiNoLock() { return null; }
  public void setPsi(com.intellij.psi.PsiElement p0) {}
  public final void applyInsertOnReparse(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public final void applyDeleteOnReparse(com.intellij.lang.ASTNode p0) {}
  public final void applyReplaceFileOnReparse(com.intellij.psi.PsiFile p0, com.intellij.lang.FileASTNode p1) {}
  public final void rawAddChildren(com.intellij.psi.impl.source.tree.TreeElement p0) {}
  public void rawAddChildrenWithoutNotifications(com.intellij.psi.impl.source.tree.TreeElement p0) {}
  public void rawRemoveAllChildren() {}
  public com.intellij.psi.impl.source.tree.TreeElement rawFirstChild() { return null; }
  public com.intellij.psi.impl.source.tree.TreeElement rawLastChild() { return null; }
}
