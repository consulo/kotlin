package com.intellij.lang;

@SuppressWarnings("all")
public interface PsiBuilder extends com.intellij.lang.SyntaxTreeBuilder,com.intellij.openapi.util.UserDataHolder {
  interface Marker extends SyntaxTreeBuilder.Marker {
    void done(com.intellij.psi.tree.IElementType type);
    void collapse(com.intellij.psi.tree.IElementType type);
    void drop();
    void rollbackTo();
    Marker precede();
    void error(String message);
    void setCustomEdgeTokenBinders(com.intellij.lang.WhitespacesAndCommentsBinder left, com.intellij.lang.WhitespacesAndCommentsBinder right);
  }
  public abstract com.intellij.openapi.project.Project getProject();
  public abstract com.intellij.lang.ASTNode getTreeBuilt();
  public abstract com.intellij.util.diff.FlyweightCapableTreeStructure<com.intellij.lang.LighterASTNode> getLightTree();
  public abstract com.intellij.lang.PsiBuilder.Marker mark();
  public default <T> T getUserDataUnprotected(com.intellij.openapi.util.Key<T> p0) { return null; }
  public default <T> void putUserDataUnprotected(com.intellij.openapi.util.Key<T> p0, T p1) {}
  public abstract com.intellij.psi.tree.IElementType lookAhead(int p0);
  public abstract com.intellij.psi.tree.IElementType rawLookup(int p0);
  public abstract int rawTokenIndex();
  public abstract int rawTokenTypeStart(int p0);
  public default boolean isWhitespaceOrComment(com.intellij.psi.tree.IElementType p0) { return false; }
}
