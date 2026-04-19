package com.intellij.psi.search;

@SuppressWarnings("all")
public class LocalSearchScope extends com.intellij.psi.search.SearchScope {
  public static final com.intellij.psi.search.LocalSearchScope EMPTY = null;
  public LocalSearchScope(com.intellij.psi.PsiElement p0) { throw new UnsupportedOperationException("stub"); }
  public LocalSearchScope(com.intellij.psi.PsiElement p0, java.lang.String p1) { throw new UnsupportedOperationException("stub"); }
  public LocalSearchScope(com.intellij.psi.PsiElement[] p0) { throw new UnsupportedOperationException("stub"); }
  public LocalSearchScope(com.intellij.psi.PsiElement[] p0, java.lang.String p1) { throw new UnsupportedOperationException("stub"); }
  public LocalSearchScope(com.intellij.psi.PsiElement[] p0, java.lang.String p1, boolean p2) { throw new UnsupportedOperationException("stub"); }
  public boolean isIgnoreInjectedPsi() { return false; }
  public java.lang.String getDisplayName() { return null; }
  public com.intellij.psi.PsiElement[] getScope() { return null; }
  public com.intellij.openapi.vfs.VirtualFile[] getVirtualFiles() { return null; }
  public boolean equals(java.lang.Object p0) { return false; }
  protected int calcHashCode() { return 0; }
  public com.intellij.psi.search.LocalSearchScope intersectWith(com.intellij.psi.search.LocalSearchScope p0) { return null; }
  public com.intellij.psi.search.SearchScope intersectWith(com.intellij.psi.search.SearchScope p0) { return null; }
  public java.lang.String toString() { return null; }
  public com.intellij.psi.search.SearchScope union(com.intellij.psi.search.SearchScope p0) { return null; }
  public boolean contains(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
  public com.intellij.psi.search.SearchScope union(com.intellij.psi.search.LocalSearchScope p0) { return null; }
  public boolean isInScope(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
  public boolean containsRange(com.intellij.psi.PsiFile p0, com.intellij.openapi.util.TextRange p1) { return false; }
  public static com.intellij.psi.search.LocalSearchScope getScopeRestrictedByFileTypes(com.intellij.psi.search.LocalSearchScope p0, com.intellij.openapi.fileTypes.FileType... p1) { return null; }
}
