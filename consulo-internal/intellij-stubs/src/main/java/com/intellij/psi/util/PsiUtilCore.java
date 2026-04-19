package com.intellij.psi.util;

@SuppressWarnings("all")
public class PsiUtilCore {
  public static final com.intellij.psi.PsiElement NULL_PSI_ELEMENT = null;
  public static final com.intellij.psi.PsiFile NULL_PSI_FILE = null;
  public PsiUtilCore() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.PsiElement[] toPsiElementArray(java.util.Collection<? extends com.intellij.psi.PsiElement> p0) { return null; }
  public static com.intellij.lang.Language getNotAnyLanguage(com.intellij.lang.ASTNode p0) { return null; }
  public static com.intellij.openapi.vfs.VirtualFile getVirtualFile(com.intellij.psi.PsiElement p0) { return null; }
  public static int compareElementsByPosition(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return 0; }
  public static boolean hasErrorElementChild(com.intellij.psi.PsiElement p0) { return false; }
  public static com.intellij.psi.PsiElement getElementAtOffset(com.intellij.psi.PsiFile p0, int p1) { return null; }
  public static com.intellij.psi.PsiFile getTemplateLanguageFile(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiFile[] toPsiFileArray(java.util.Collection<? extends com.intellij.psi.PsiFile> p0) { return null; }
  public static java.util.List<com.intellij.psi.PsiFile> toPsiFiles(com.intellij.psi.PsiManager p0, java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile> p1) { return null; }
  public static java.lang.String getName(com.intellij.psi.PsiElement p0) { return null; }
  public static java.lang.String getQualifiedNameAfterRename(java.lang.String p0, java.lang.String p1) { return null; }
  public static com.intellij.lang.Language getDialect(com.intellij.psi.PsiElement p0) { return null; }
  protected static com.intellij.lang.Language narrowLanguage(com.intellij.lang.Language p0, com.intellij.lang.Language p1) { return null; }
  public static void ensureValid(com.intellij.psi.PsiElement p0) {}
  public static com.intellij.psi.PsiFileSystemItem findFileSystemItem(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1) { return null; }
  public static com.intellij.psi.PsiFile getPsiFile(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getOriginalElement(T p0, java.lang.Class<? extends T> p1) { return null; }
  public static com.intellij.lang.Language findLanguageFromElement(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.lang.Language getLanguageAtOffset(com.intellij.psi.PsiFile p0, int p1) { return null; }
  public static com.intellij.openapi.project.Project getProjectInReadAction(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.tree.IElementType getElementType(com.intellij.lang.ASTNode p0) { return null; }
  public static com.intellij.psi.tree.IElementType getElementType(com.intellij.psi.PsiElement p0) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T notNullChild(T p0) { return p0; }
}
