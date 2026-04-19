package com.intellij.psi.impl;

@SuppressWarnings("all")
public abstract class PsiManagerEx extends com.intellij.psi.PsiManager {
  public PsiManagerEx() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.impl.PsiManagerEx getInstanceEx(com.intellij.openapi.project.Project p0) { return null; }
  public abstract boolean isBatchFilesProcessingMode();
  public abstract void setAssertOnFileLoadingFilter(com.intellij.openapi.vfs.VirtualFileFilter p0, com.intellij.openapi.Disposable p1);
  public abstract boolean isAssertOnFileLoading(com.intellij.openapi.vfs.VirtualFile p0);
  public abstract com.intellij.psi.impl.file.impl.FileManager getFileManager();
  public abstract void beforeChildAddition(com.intellij.psi.impl.PsiTreeChangeEventImpl p0);
  public abstract void beforeChildRemoval(com.intellij.psi.impl.PsiTreeChangeEventImpl p0);
  public abstract void beforeChildReplacement(com.intellij.psi.impl.PsiTreeChangeEventImpl p0);
  public abstract void beforeChange(boolean p0);
  public abstract void afterChange(boolean p0);
}
