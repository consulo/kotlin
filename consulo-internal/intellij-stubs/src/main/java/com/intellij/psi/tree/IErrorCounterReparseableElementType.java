package com.intellij.psi.tree;

@SuppressWarnings("all")
public abstract class IErrorCounterReparseableElementType extends com.intellij.psi.tree.IReparseableElementType {
  public static final int NO_ERRORS = 0;
  public static final int FATAL_ERROR = 0;
  public IErrorCounterReparseableElementType(java.lang.String p0, com.intellij.lang.Language p1) { super(p0, p1); }
  public abstract int getErrorsCount(java.lang.CharSequence p0, com.intellij.lang.Language p1, com.intellij.openapi.project.Project p2);
  public boolean isParsable(java.lang.CharSequence p0, com.intellij.lang.Language p1, com.intellij.openapi.project.Project p2) { return false; }
  public boolean isParsable(com.intellij.lang.ASTNode p0, java.lang.CharSequence p1, com.intellij.lang.Language p2, com.intellij.openapi.project.Project p3) { return isParsable(p1, p2, p3); }
}
