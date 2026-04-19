package com.intellij.lang;

@SuppressWarnings("all")
public interface ASTNode extends com.intellij.openapi.util.UserDataHolder {
  public abstract com.intellij.psi.tree.IElementType getElementType();
  public abstract java.lang.String getText();
  public abstract java.lang.CharSequence getChars();
  public abstract boolean textContains(char p0);
  public abstract int getStartOffset();
  public default int getStartOffsetInParent() { return 0; }
  public abstract int getTextLength();
  public abstract com.intellij.openapi.util.TextRange getTextRange();
  public abstract com.intellij.lang.ASTNode getTreeParent();
  public abstract com.intellij.lang.ASTNode getFirstChildNode();
  public abstract com.intellij.lang.ASTNode getLastChildNode();
  public abstract com.intellij.lang.ASTNode getTreeNext();
  public abstract com.intellij.lang.ASTNode getTreePrev();
  public abstract com.intellij.lang.ASTNode[] getChildren(com.intellij.psi.tree.TokenSet p0);
  public abstract void addChild(com.intellij.lang.ASTNode p0);
  public abstract void addChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1);
  public abstract void addLeaf(com.intellij.psi.tree.IElementType p0, java.lang.CharSequence p1, com.intellij.lang.ASTNode p2);
  public abstract void removeChild(com.intellij.lang.ASTNode p0);
  public abstract void removeRange(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1);
  public abstract void replaceChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1);
  public abstract void replaceAllChildrenToChildrenOf(com.intellij.lang.ASTNode p0);
  public abstract void addChildren(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2);
  public abstract java.lang.Object clone();
  public abstract com.intellij.lang.ASTNode copyElement();
  public abstract com.intellij.lang.ASTNode findLeafElementAt(int p0);
  public abstract <T> T getCopyableUserData(com.intellij.openapi.util.Key<T> p0);
  public abstract <T> void putCopyableUserData(com.intellij.openapi.util.Key<T> p0, T p1);
  public abstract com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.IElementType p0);
  public abstract com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.IElementType p0, com.intellij.lang.ASTNode p1);
  public abstract com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.TokenSet p0);
  public abstract com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.TokenSet p0, com.intellij.lang.ASTNode p1);
  public abstract com.intellij.psi.PsiElement getPsi();
  public abstract <T extends com.intellij.psi.PsiElement> T getPsi(java.lang.Class<T> p0);
}
