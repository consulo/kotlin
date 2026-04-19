package com.intellij.psi.impl.source.tree;

@SuppressWarnings("all")
public abstract class TreeElement extends com.intellij.psi.impl.ElementBase implements com.intellij.lang.ASTNode,com.intellij.psi.impl.ReparseableASTNode,java.lang.Cloneable,com.intellij.lang.LighterASTNode {
  public static final com.intellij.psi.impl.source.tree.TreeElement[] EMPTY_ARRAY = null;
  public TreeElement(com.intellij.psi.tree.IElementType p0) { throw new UnsupportedOperationException("stub"); }
  public java.lang.Object clone() { return null; }
  public com.intellij.lang.ASTNode copyElement() { return null; }
  public com.intellij.psi.impl.PsiManagerEx getManager() { return null; }
  public abstract com.intellij.psi.impl.source.tree.LeafElement findLeafElementAt(int p0);
  public abstract char[] textToCharArray();
  public abstract com.intellij.psi.impl.source.tree.TreeElement getFirstChildNode();
  public abstract com.intellij.psi.impl.source.tree.TreeElement getLastChildNode();
  public abstract int getCachedLength();
  public com.intellij.openapi.util.TextRange getTextRange() { return null; }
  public int getStartOffset() { return 0; }
  public final int getStartOffsetInParent() { return 0; }
  public abstract int getTextLength();
  public com.intellij.psi.tree.IElementType getTokenType() { return null; }
  public int getEndOffset() { return 0; }
  public int getTextOffset() { return 0; }
  public boolean textMatches(java.lang.CharSequence p0, int p1, int p2) { return false; }
  protected abstract int textMatches(java.lang.CharSequence p0, int p1);
  public boolean textMatches(java.lang.CharSequence p0) { return false; }
  public boolean textMatches(com.intellij.psi.PsiElement p0) { return false; }
  public java.lang.String toString() { return null; }
  public final com.intellij.psi.impl.source.tree.CompositeElement getTreeParent() { return null; }
  public final com.intellij.psi.impl.source.tree.TreeElement getTreePrev() { return null; }
  public final com.intellij.psi.impl.source.tree.TreeElement getTreeNext() { return null; }
  public void clearCaches() {}
  public final boolean equals(java.lang.Object p0) { return false; }
  public abstract int hc();
  public abstract void acceptTree(com.intellij.psi.impl.source.tree.TreeElementVisitor p0);
  protected void onInvalidated() {}
  public final void applyReplaceOnReparse(com.intellij.lang.ASTNode p0) {}
  public void rawInsertBeforeMe(com.intellij.psi.impl.source.tree.TreeElement p0) {}
  public void rawInsertAfterMe(com.intellij.psi.impl.source.tree.TreeElement p0) {}
  public void rawRemove() {}
  public void rawReplaceWithList(com.intellij.psi.impl.source.tree.TreeElement p0) {}
  protected void invalidate() {}
  public void rawRemoveUpToLast() {}
  public void rawRemoveUpTo(com.intellij.psi.impl.source.tree.TreeElement p0) {}
  public com.intellij.psi.tree.IElementType getElementType() { return null; }
}
