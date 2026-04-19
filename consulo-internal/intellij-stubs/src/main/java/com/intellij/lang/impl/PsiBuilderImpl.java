package com.intellij.lang.impl;

@SuppressWarnings("all")
public abstract class PsiBuilderImpl extends com.intellij.openapi.util.UnprotectedUserDataHolder implements com.intellij.lang.PsiBuilder {
  public static class MyTreeStructure implements com.intellij.util.diff.FlyweightCapableTreeStructure<com.intellij.lang.LighterASTNode> {
    public com.intellij.lang.LighterASTNode getRoot() { return null; }
    public com.intellij.lang.LighterASTNode getParent(com.intellij.lang.LighterASTNode node) { return null; }
    public int getChildren(com.intellij.lang.LighterASTNode parent, com.intellij.openapi.util.Ref<com.intellij.lang.LighterASTNode[]> into) { return 0; }
    public void disposeChildren(com.intellij.lang.LighterASTNode[] nodes, int count) {}
    public CharSequence toString(com.intellij.lang.LighterASTNode node) { return null; }
    public int getStartOffset(com.intellij.lang.LighterASTNode node) { return 0; }
    public int getEndOffset(com.intellij.lang.LighterASTNode node) { return 0; }
  }
  public static class StartMarker implements com.intellij.lang.PsiBuilder.Marker {
    public void done(com.intellij.psi.tree.IElementType type) {}
    public void collapse(com.intellij.psi.tree.IElementType type) {}
    public void drop() {}
    public void rollbackTo() {}
    public com.intellij.lang.PsiBuilder.Marker precede() { return null; }
    public void error(String message) {}
    public void setCustomEdgeTokenBinders(com.intellij.lang.WhitespacesAndCommentsBinder left, com.intellij.lang.WhitespacesAndCommentsBinder right) {}
    public com.intellij.psi.tree.IElementType getTokenType() { return null; }
    public int getStartOffset() { return 0; }
    public int getEndOffset() { return 0; }
  }
  public static com.intellij.lang.impl.PsiBuilderDiagnostics DIAGNOSTICS = null;
  public static final com.intellij.openapi.util.Key<com.intellij.util.TripleFunction<com.intellij.lang.ASTNode, com.intellij.lang.LighterASTNode, com.intellij.util.diff.FlyweightCapableTreeStructure<com.intellij.lang.LighterASTNode>, com.intellij.util.ThreeState>> CUSTOM_COMPARATOR = null;
  public static void registerWhitespaceToken(com.intellij.psi.tree.IElementType p0) {}
  public PsiBuilderImpl(com.intellij.openapi.project.Project p0, com.intellij.psi.PsiFile p1, com.intellij.lang.ParserDefinition p2, com.intellij.lexer.Lexer p3, com.intellij.util.CharTable p4, java.lang.CharSequence p5, com.intellij.lang.ASTNode p6, com.intellij.lang.impl.PsiBuilderImpl.MyTreeStructure p7) { throw new UnsupportedOperationException("stub"); }
  public PsiBuilderImpl(com.intellij.openapi.project.Project p0, com.intellij.lang.ParserDefinition p1, com.intellij.lexer.Lexer p2, com.intellij.lang.ASTNode p3, java.lang.CharSequence p4) { throw new UnsupportedOperationException("stub"); }
  public PsiBuilderImpl(com.intellij.openapi.project.Project p0, com.intellij.lang.ParserDefinition p1, com.intellij.lexer.Lexer p2, com.intellij.lang.LighterLazyParseableNode p3, java.lang.CharSequence p4) { throw new UnsupportedOperationException("stub"); }
  public com.intellij.openapi.project.Project getProject() { return null; }
  public void enforceCommentTokens(com.intellij.psi.tree.TokenSet p0) {}
  public com.intellij.lang.impl.PsiBuilderImpl.StartMarker getLatestDoneMarker() { return null; }
  public java.util.List<? extends com.intellij.lang.SyntaxTreeBuilder.Production> getProductions() { return null; }
  public java.lang.CharSequence getOriginalText() { return null; }
  public boolean isWhitespaceOrComment(com.intellij.psi.tree.IElementType p0) { return false; }
  public void setTokenTypeRemapper(com.intellij.lang.ITokenTypeRemapper p0) {}
  public void remapCurrentToken(com.intellij.psi.tree.IElementType p0) {}
  public com.intellij.psi.tree.IElementType lookAhead(int p0) { return null; }
  public com.intellij.psi.tree.IElementType rawLookup(int p0) { return null; }
  public int rawTokenTypeStart(int p0) { return 0; }
  public int rawTokenIndex() { return 0; }
  public void rawAdvanceLexer(int p0) {}
  public void setWhitespaceSkippedCallback(com.intellij.lang.WhitespaceSkippedCallback p0) {}
  public void advanceLexer() {}
  public int getCurrentOffset() { return 0; }
  public java.lang.String getTokenText() { return null; }
  public boolean whitespaceOrComment(com.intellij.psi.tree.IElementType p0) { return false; }
  public com.intellij.lang.PsiBuilder.Marker mark() { return null; }
  public final boolean eof() { return false; }
  public boolean hasErrorsAfter(com.intellij.lang.PsiBuilder.Marker p0) { return false; }
  public void error(java.lang.String p0) {}
  public com.intellij.lang.ASTNode getTreeBuilt() { return null; }
  public com.intellij.util.diff.FlyweightCapableTreeStructure<com.intellij.lang.LighterASTNode> getLightTree() { return null; }
  public static java.lang.String getErrorMessage(com.intellij.lang.LighterASTNode p0) { return null; }
  public void setDebugMode(boolean p0) {}
  public int getLexemeCount() { return 0; }
  public com.intellij.lexer.Lexer getLexer() { return null; }
  protected com.intellij.psi.impl.source.tree.TreeElement createLeaf(com.intellij.psi.tree.IElementType p0, int p1, int p2) { return null; }
  protected java.lang.CharSequence getInternedText(int p0, int p1) { return null; }
  public <T> T getUserData(com.intellij.openapi.util.Key<T> p0) { return null; }
  public <T> void putUserData(com.intellij.openapi.util.Key<T> p0, T p1) {}
  public long getLexingTimeNs() { return 0; }
}
