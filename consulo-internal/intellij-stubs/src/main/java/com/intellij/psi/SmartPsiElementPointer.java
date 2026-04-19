package com.intellij.psi;

@SuppressWarnings("all")
  public interface SmartPsiElementPointer<E> {
  public abstract E getElement();
  public default E dereference() { return null; }
  public abstract com.intellij.psi.PsiFile getContainingFile();
  public abstract com.intellij.openapi.project.Project getProject();
  public abstract com.intellij.openapi.vfs.VirtualFile getVirtualFile();
  public abstract com.intellij.openapi.util.Segment getRange();
  public abstract com.intellij.openapi.util.Segment getPsiRange();
}
