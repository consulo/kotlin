package com.intellij.psi.search;

@SuppressWarnings("all")
public abstract class SearchScope {
  public SearchScope() { throw new UnsupportedOperationException("stub"); }
  public int hashCode() { return 0; }
  protected int calcHashCode() { return 0; }
  public java.lang.String getDisplayName() { return null; }
  public javax.swing.Icon getIcon() { return null; }
  public abstract com.intellij.psi.search.SearchScope intersectWith(com.intellij.psi.search.SearchScope p0);
  public abstract com.intellij.psi.search.SearchScope union(com.intellij.psi.search.SearchScope p0);
  public abstract boolean contains(com.intellij.openapi.vfs.VirtualFile p0);
  public static boolean isEmptyScope(com.intellij.psi.search.SearchScope p0) { return false; }
}
