package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiFileFactory {
  public static final com.intellij.openapi.util.Key<com.intellij.psi.PsiFile> ORIGINAL_FILE = null;
  public PsiFileFactory() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.PsiFileFactory getInstance(com.intellij.openapi.project.Project p0) { return null; }
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, java.lang.String p1) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, com.intellij.openapi.fileTypes.FileType p1, java.lang.CharSequence p2) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, com.intellij.openapi.fileTypes.FileType p1, java.lang.CharSequence p2, long p3, boolean p4) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, com.intellij.openapi.fileTypes.FileType p1, java.lang.CharSequence p2, long p3, boolean p4, boolean p5) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, com.intellij.lang.Language p1, java.lang.CharSequence p2) throws com.intellij.util.IncorrectOperationException;
  public com.intellij.psi.PsiFile createFileFromText(com.intellij.lang.Language p0, java.lang.CharSequence p1) throws com.intellij.util.IncorrectOperationException { return null; }
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, com.intellij.lang.Language p1, java.lang.CharSequence p2, boolean p3, boolean p4) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, com.intellij.lang.Language p1, java.lang.CharSequence p2, boolean p3, boolean p4, boolean p5) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.String p0, com.intellij.lang.Language p1, java.lang.CharSequence p2, boolean p3, boolean p4, boolean p5, com.intellij.openapi.vfs.VirtualFile p6) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(com.intellij.openapi.fileTypes.FileType p0, java.lang.String p1, java.lang.CharSequence p2, int p3, int p4) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiFile createFileFromText(java.lang.CharSequence p0, com.intellij.psi.PsiFile p1) throws com.intellij.util.IncorrectOperationException;
}
