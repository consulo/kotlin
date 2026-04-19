package com.intellij.lang;

@SuppressWarnings("all")
public abstract class PsiBuilderFactory {
  public PsiBuilderFactory() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.lang.PsiBuilderFactory getInstance() { return null; }
  public abstract com.intellij.lang.PsiBuilder createBuilder(com.intellij.openapi.project.Project p0, com.intellij.lang.ASTNode p1);
  public abstract com.intellij.lang.PsiBuilder createBuilder(com.intellij.openapi.project.Project p0, com.intellij.lang.LighterLazyParseableNode p1);
  public com.intellij.lang.PsiBuilder createBuilder(com.intellij.openapi.project.Project p0, com.intellij.lexer.Lexer p1, com.intellij.lang.ASTNode p2) { return null; }
  public abstract com.intellij.lang.PsiBuilder createBuilder(com.intellij.openapi.project.Project p0, com.intellij.lang.ASTNode p1, com.intellij.lexer.Lexer p2, com.intellij.lang.Language p3, java.lang.CharSequence p4);
  public abstract com.intellij.lang.PsiBuilder createBuilder(com.intellij.openapi.project.Project p0, com.intellij.lang.LighterLazyParseableNode p1, com.intellij.lexer.Lexer p2, com.intellij.lang.Language p3, java.lang.CharSequence p4);
  public abstract com.intellij.lang.PsiBuilder createBuilder(com.intellij.lang.ParserDefinition p0, com.intellij.lexer.Lexer p1, java.lang.CharSequence p2);
}
