package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiFile extends PsiFileSystemItem {
  public abstract com.intellij.openapi.vfs.VirtualFile getVirtualFile();
  public abstract com.intellij.psi.PsiDirectory getContainingDirectory();
  public abstract com.intellij.psi.PsiDirectory getParent();
  public abstract long getModificationStamp();
  public abstract com.intellij.psi.PsiFile getOriginalFile();
  public abstract com.intellij.openapi.fileTypes.FileType getFileType();
  public abstract com.intellij.psi.PsiFile[] getPsiRoots();
  public abstract com.intellij.psi.FileViewProvider getViewProvider();
  public default com.intellij.openapi.editor.Document getFileDocument() { return null; }
  public abstract com.intellij.lang.FileASTNode getNode();
  public abstract void subtreeChanged();
  public default void clearCaches() {}
  public default com.intellij.psi.tree.IFileElementType getFileElementType() { return null; }
}
