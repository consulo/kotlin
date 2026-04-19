package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiManager extends com.intellij.openapi.util.UserDataHolderBase {
  public PsiManager() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.PsiManager getInstance(com.intellij.openapi.project.Project p0) { return null; }
  public abstract com.intellij.openapi.project.Project getProject();
  public abstract com.intellij.psi.PsiFile findFile(com.intellij.openapi.vfs.VirtualFile p0);
  public abstract com.intellij.psi.FileViewProvider findViewProvider(com.intellij.openapi.vfs.VirtualFile p0);
  public abstract com.intellij.psi.PsiDirectory findDirectory(com.intellij.openapi.vfs.VirtualFile p0);
  public abstract boolean areElementsEquivalent(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1);
  public abstract void reloadFromDisk(com.intellij.psi.PsiFile p0);
  public abstract void addPsiTreeChangeListener(com.intellij.psi.PsiTreeChangeListener p0);
  public abstract void addPsiTreeChangeListener(com.intellij.psi.PsiTreeChangeListener p0, com.intellij.openapi.Disposable p1);
  public abstract void removePsiTreeChangeListener(com.intellij.psi.PsiTreeChangeListener p0);
  public abstract com.intellij.psi.util.PsiModificationTracker getModificationTracker();
  public abstract void startBatchFilesProcessingMode();
  public abstract void finishBatchFilesProcessingMode();
  public abstract <T> T runInBatchFilesMode(com.intellij.openapi.util.Computable<T> p0);
  public abstract boolean isDisposed();
  public abstract void dropResolveCaches();
  public abstract void dropPsiCaches();
  public abstract boolean isInProject(com.intellij.psi.PsiElement p0);
  public abstract com.intellij.psi.FileViewProvider findCachedViewProvider(com.intellij.openapi.vfs.VirtualFile p0);
    public abstract com.intellij.psi.FileViewProvider createFileViewProvider(com.intellij.openapi.vfs.VirtualFile p0, boolean p1);
}
