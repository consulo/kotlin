package com.intellij.lang;

@SuppressWarnings("all")
public interface ParserDefinition {
  enum SpaceRequirements { MUST, MAY, MUST_NOT, MUST_LINE_BREAK }
  public abstract com.intellij.lexer.Lexer createLexer(com.intellij.openapi.project.Project p0);
  public abstract com.intellij.lang.PsiParser createParser(com.intellij.openapi.project.Project p0);
  public abstract com.intellij.psi.tree.IFileElementType getFileNodeType();
  public default com.intellij.psi.tree.TokenSet getWhitespaceTokens() { return null; }
  public abstract com.intellij.psi.tree.TokenSet getCommentTokens();
  public abstract com.intellij.psi.tree.TokenSet getStringLiteralElements();
  public abstract com.intellij.psi.PsiElement createElement(com.intellij.lang.ASTNode p0);
  public abstract com.intellij.psi.PsiFile createFile(com.intellij.psi.FileViewProvider p0);
  public default com.intellij.lang.ParserDefinition.SpaceRequirements spaceExistenceTypeBetweenTokens(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) { return null; }
  public default com.intellij.lang.ParserDefinition.SpaceRequirements spaceExistanceTypeBetweenTokens(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) { return null; }
  public default com.intellij.lang.ASTNode reparseSpace(com.intellij.lang.ASTNode p0, java.lang.CharSequence p1) { return null; }
}
