package com.intellij.psi.search;

@SuppressWarnings("all")
public class PackageScope extends com.intellij.psi.search.GlobalSearchScope {
  public PackageScope(com.intellij.psi.PsiPackage p0, boolean p1, boolean p2) { throw new UnsupportedOperationException("stub"); }
  public boolean contains(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
  public boolean isSearchInLibraries() { return false; }
  public java.lang.String toString() { return null; }
  public static com.intellij.psi.search.GlobalSearchScope packageScope(com.intellij.psi.PsiPackage p0, boolean p1) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope packageScope(com.intellij.psi.PsiPackage p0, boolean p1, com.intellij.psi.search.GlobalSearchScope p2) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope packageScopeWithoutLibraries(com.intellij.psi.PsiPackage p0, boolean p1) { return null; }
}
