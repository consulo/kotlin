package com.intellij.lang.impl;

@SuppressWarnings("all")
public class PsiBuilderAdapter implements com.intellij.lang.PsiBuilder {
  protected final com.intellij.lang.PsiBuilder myDelegate;
  public PsiBuilderAdapter(com.intellij.lang.PsiBuilder p0) { throw new UnsupportedOperationException("stub"); }
  public com.intellij.lang.PsiBuilder getDelegate() { return null; }
  public com.intellij.openapi.project.Project getProject() { return null; }
  public java.lang.CharSequence getOriginalText() { return null; }
  public void advanceLexer() {}
  public com.intellij.psi.tree.IElementType getTokenType() { return null; }
  public void setTokenTypeRemapper(com.intellij.lang.ITokenTypeRemapper p0) {}
  public void setWhitespaceSkippedCallback(com.intellij.lang.WhitespaceSkippedCallback p0) {}
  public void remapCurrentToken(com.intellij.psi.tree.IElementType p0) {}
  public com.intellij.psi.tree.IElementType lookAhead(int p0) { return null; }
  public com.intellij.psi.tree.IElementType rawLookup(int p0) { return null; }
  public int rawTokenTypeStart(int p0) { return 0; }
  public int rawTokenIndex() { return 0; }
  public java.lang.String getTokenText() { return null; }
  public int getCurrentOffset() { return 0; }
  public com.intellij.lang.PsiBuilder.Marker mark() { return null; }
  public void error(java.lang.String p0) {}
  public boolean eof() { return false; }
  public com.intellij.lang.ASTNode getTreeBuilt() { return null; }
  public com.intellij.util.diff.FlyweightCapableTreeStructure<com.intellij.lang.LighterASTNode> getLightTree() { return null; }
  public boolean isWhitespaceOrComment(com.intellij.psi.tree.IElementType p0) { return false; }
  public void rawAdvanceLexer(int p0) {}
  public void setDebugMode(boolean p0) {}
  public void enforceCommentTokens(com.intellij.psi.tree.TokenSet p0) {}
  public com.intellij.lang.LighterASTNode getLatestDoneMarker() { return null; }
  public java.util.List<? extends com.intellij.lang.SyntaxTreeBuilder.Production> getProductions() { return null; }
  public <T> T getUserData(com.intellij.openapi.util.Key<T> p0) { return null; }
  public <T> void putUserData(com.intellij.openapi.util.Key<T> p0, T p1) {}
  public <T> T getUserDataUnprotected(com.intellij.openapi.util.Key<T> p0) { return null; }
  public <T> void putUserDataUnprotected(com.intellij.openapi.util.Key<T> p0, T p1) {}
}
