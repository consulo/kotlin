package com.intellij.psi.codeStyle;

@SuppressWarnings("all")
public abstract class CodeStyleManager {
  public CodeStyleManager() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.codeStyle.CodeStyleManager getInstance(com.intellij.openapi.project.Project p0) { return null; }
  public static com.intellij.psi.codeStyle.CodeStyleManager getInstance(com.intellij.psi.PsiManager p0) { return null; }
  public abstract com.intellij.openapi.project.Project getProject();
  public abstract com.intellij.psi.PsiElement reformat(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement reformat(com.intellij.psi.PsiElement p0, boolean p1) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement reformatRange(com.intellij.psi.PsiElement p0, int p1, int p2) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement reformatRange(com.intellij.psi.PsiElement p0, int p1, int p2, boolean p3) throws com.intellij.util.IncorrectOperationException;
  public abstract void reformatText(com.intellij.psi.PsiFile p0, int p1, int p2) throws com.intellij.util.IncorrectOperationException;
  public void reformatText(com.intellij.psi.PsiFile p0, java.util.Collection<? extends com.intellij.openapi.util.TextRange> p1, boolean p2) throws com.intellij.util.IncorrectOperationException {}
  public abstract void reformatText(com.intellij.psi.PsiFile p0, java.util.Collection<? extends com.intellij.openapi.util.TextRange> p1) throws com.intellij.util.IncorrectOperationException;
  public void reformatTextWithContext(com.intellij.psi.PsiFile p0, com.intellij.psi.codeStyle.ChangedRangesInfo p1) throws com.intellij.util.IncorrectOperationException {}
  public void reformatChanges(com.intellij.psi.PsiFile p0, com.intellij.psi.codeStyle.ChangedRangesInfo p1) throws com.intellij.util.IncorrectOperationException {}
  public void reformatTextWithContext(com.intellij.psi.PsiFile p0, java.util.Collection<? extends com.intellij.openapi.util.TextRange> p1) throws com.intellij.util.IncorrectOperationException {}
  public abstract void adjustLineIndent(com.intellij.psi.PsiFile p0, com.intellij.openapi.util.TextRange p1) throws com.intellij.util.IncorrectOperationException;
  public abstract int adjustLineIndent(com.intellij.psi.PsiFile p0, int p1) throws com.intellij.util.IncorrectOperationException;
  public abstract int adjustLineIndent(com.intellij.openapi.editor.Document p0, int p1);
  public void scheduleIndentAdjustment(com.intellij.openapi.editor.Document p0, int p1) {}
  public abstract boolean isLineToBeIndented(com.intellij.psi.PsiFile p0, int p1);
  public abstract java.lang.String getLineIndent(com.intellij.psi.PsiFile p0, int p1);
  public java.util.List<java.lang.String> getLineIndents(com.intellij.psi.PsiFile p0) { return null; }
  public abstract java.lang.String getLineIndent(com.intellij.openapi.editor.Document p0, int p1);
  public abstract com.intellij.psi.codeStyle.Indent getIndent(java.lang.String p0, com.intellij.openapi.fileTypes.FileType p1);
  public abstract java.lang.String fillIndent(com.intellij.psi.codeStyle.Indent p0, com.intellij.openapi.fileTypes.FileType p1);
  public abstract com.intellij.psi.codeStyle.Indent zeroIndent();
  public abstract void reformatNewlyAddedElement(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) throws com.intellij.util.IncorrectOperationException;
  public abstract boolean isSequentialProcessingAllowed();
  public abstract void performActionWithFormatterDisabled(java.lang.Runnable p0);
  public abstract <T extends java.lang.Throwable> void performActionWithFormatterDisabled(com.intellij.util.ThrowableRunnable<T> p0) throws T;
  public abstract <T> T performActionWithFormatterDisabled(com.intellij.openapi.util.Computable<T> p0);
  public int getSpacing(com.intellij.psi.PsiFile p0, int p1) { return 0; }
  public int getMinLineFeeds(com.intellij.psi.PsiFile p0, int p1) { return 0; }
  public void runWithDocCommentFormattingDisabled(com.intellij.psi.PsiFile p0, java.lang.Runnable p1) {}
  public com.intellij.psi.codeStyle.DocCommentSettings getDocCommentSettings(com.intellij.psi.PsiFile p0) { return null; }
  public void scheduleReformatWhenSettingsComputed(com.intellij.psi.PsiFile p0) {}
}
