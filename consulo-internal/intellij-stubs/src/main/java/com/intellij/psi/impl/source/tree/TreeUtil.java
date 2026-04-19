package com.intellij.psi.impl.source.tree;

@SuppressWarnings("all")
public final class TreeUtil {
  public static class CommonParentState {}
  public static final com.intellij.openapi.util.Key<com.intellij.psi.impl.source.tree.FileElement> CONTAINING_FILE_KEY_AFTER_REPARSE = null;
  public TreeUtil() { throw new UnsupportedOperationException("stub"); }
  public static void ensureParsed(com.intellij.lang.ASTNode p0) {}
  public static boolean isCollapsedChameleon(com.intellij.lang.ASTNode p0) { return false; }
  public static com.intellij.lang.ASTNode findChildBackward(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.IElementType p1) { return null; }
  public static com.intellij.lang.ASTNode skipElements(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.TokenSet p1) { return null; }
  public static com.intellij.lang.ASTNode skipElementsBack(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.TokenSet p1) { return null; }
  public static com.intellij.lang.ASTNode findParent(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.IElementType p1) { return null; }
  public static com.intellij.lang.ASTNode findParent(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.TokenSet p1) { return null; }
  public static com.intellij.lang.ASTNode findParent(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.TokenSet p1, com.intellij.psi.tree.TokenSet p2) { return null; }
  public static com.intellij.psi.impl.source.tree.LeafElement findFirstLeaf(com.intellij.lang.ASTNode p0) { return null; }
  public static com.intellij.lang.ASTNode findFirstLeaf(com.intellij.lang.ASTNode p0, boolean p1) { return null; }
  public static com.intellij.lang.ASTNode findLastLeaf(com.intellij.lang.ASTNode p0) { return null; }
  public static com.intellij.lang.ASTNode findLastLeaf(com.intellij.lang.ASTNode p0, boolean p1) { return null; }
  public static com.intellij.lang.ASTNode findSibling(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.IElementType p1) { return null; }
  public static com.intellij.lang.ASTNode findSibling(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.TokenSet p1) { return null; }
  public static com.intellij.lang.ASTNode findSiblingBackward(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.IElementType p1) { return null; }
  public static com.intellij.lang.ASTNode findSiblingBackward(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.TokenSet p1) { return null; }
  public static com.intellij.lang.ASTNode findCommonParent(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) { return null; }
  public static com.intellij.openapi.util.Couple<com.intellij.lang.ASTNode> findTopmostSiblingParents(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) { return null; }
  public static void clearCaches(com.intellij.psi.impl.source.tree.TreeElement p0) {}
  public static com.intellij.lang.ASTNode nextLeaf(com.intellij.lang.ASTNode p0) { return null; }
  public static com.intellij.psi.impl.source.tree.LeafElement nextLeaf(com.intellij.psi.impl.source.tree.LeafElement p0) { return null; }
  public static com.intellij.psi.impl.source.tree.FileElement getFileElement(com.intellij.psi.impl.source.tree.TreeElement p0) { return null; }
  public static com.intellij.lang.FileASTNode getFileElement(com.intellij.lang.ASTNode p0) { return null; }
  public static com.intellij.lang.ASTNode prevLeaf(com.intellij.lang.ASTNode p0) { return null; }
  public static boolean isStrongWhitespaceHolder(com.intellij.psi.tree.IElementType p0) { return false; }
  public static java.lang.String getTokenText(com.intellij.lexer.Lexer p0) { return null; }
  public static com.intellij.psi.impl.source.tree.LeafElement nextLeaf(com.intellij.psi.impl.source.tree.TreeElement p0, com.intellij.psi.impl.source.tree.TreeUtil.CommonParentState p1) { return null; }
  public static com.intellij.psi.impl.source.tree.TreeElement nextLeaf(com.intellij.psi.impl.source.tree.TreeElement p0, com.intellij.psi.impl.source.tree.TreeUtil.CommonParentState p1, com.intellij.psi.tree.IElementType p2, boolean p3) { return null; }
  public static com.intellij.lang.ASTNode prevLeaf(com.intellij.psi.impl.source.tree.TreeElement p0, com.intellij.psi.impl.source.tree.TreeUtil.CommonParentState p1) { return null; }
  public static com.intellij.lang.ASTNode nextLeaf(com.intellij.lang.ASTNode p0, boolean p1) { return null; }
  public static com.intellij.lang.ASTNode prevLeaf(com.intellij.lang.ASTNode p0, boolean p1) { return null; }
  public static com.intellij.lang.ASTNode getLastChild(com.intellij.lang.ASTNode p0) { return null; }
  public static boolean containsOuterLanguageElements(com.intellij.lang.ASTNode p0) { return false; }
  public static com.intellij.lang.ASTNode skipWhitespaceAndComments(com.intellij.lang.ASTNode p0, boolean p1) { return null; }
  public static com.intellij.lang.ASTNode skipWhitespaceCommentsAndTokens(com.intellij.lang.ASTNode p0, com.intellij.psi.tree.TokenSet p1, boolean p2) { return null; }
  public static boolean isWhitespaceOrComment(com.intellij.lang.ASTNode p0) { return false; }
}
