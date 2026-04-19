package com.intellij.psi;

@SuppressWarnings("all")
public interface FileViewProvider extends java.lang.Cloneable,com.intellij.openapi.util.UserDataHolderEx {
  public abstract com.intellij.psi.PsiManager getManager();
  public abstract com.intellij.openapi.editor.Document getDocument();
  public abstract java.lang.CharSequence getContents();
  public abstract com.intellij.openapi.vfs.VirtualFile getVirtualFile();
  public abstract com.intellij.lang.Language getBaseLanguage();
  public abstract java.util.Set<com.intellij.lang.Language> getLanguages();
  public default boolean hasLanguage(com.intellij.lang.Language p0) { return false; }
  public abstract com.intellij.psi.PsiFile getPsi(com.intellij.lang.Language p0);
  public abstract java.util.List<com.intellij.psi.PsiFile> getAllFiles();
  public abstract boolean isEventSystemEnabled();
  public abstract boolean isPhysical();
  public abstract long getModificationStamp();
  public abstract boolean supportsIncrementalReparse(com.intellij.lang.Language p0);
  public abstract void rootChanged(com.intellij.psi.PsiFile p0);
  public abstract void beforeContentsSynchronized();
  public abstract void contentsSynchronized();
  public abstract com.intellij.psi.PsiElement findElementAt(int p0);
  public abstract com.intellij.psi.PsiReference findReferenceAt(int p0);
  public abstract com.intellij.psi.PsiElement findElementAt(int p0, com.intellij.lang.Language p1);
  public abstract com.intellij.psi.PsiElement findElementAt(int p0, java.lang.Class<? extends com.intellij.lang.Language> p1);
  public abstract com.intellij.psi.PsiReference findReferenceAt(int p0, com.intellij.lang.Language p1);
  public abstract com.intellij.psi.FileViewProvider createCopy(com.intellij.openapi.vfs.VirtualFile p0);
  public abstract com.intellij.psi.PsiFile getStubBindingRoot();
  public abstract com.intellij.openapi.fileTypes.FileType getFileType();
  public abstract void forceCachedPsi(com.intellij.psi.PsiFile p0);
}
