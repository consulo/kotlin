package com.intellij.psi.search;

@SuppressWarnings("all")
public abstract class SearchScope {
    public java.lang.String toFullString() { return null; }
  public SearchScope() { throw new UnsupportedOperationException("stub"); }
  public int hashCode() { return 0; }
  protected int calcHashCode() { return 0; }
  public java.lang.String getDisplayName() { return null; }
  public javax.swing.Icon getIcon() { return null; }
  public com.intellij.psi.search.SearchScope intersectWith(com.intellij.psi.search.SearchScope p0) { return null; }
  public com.intellij.psi.search.SearchScope union(com.intellij.psi.search.SearchScope p0) { return null; }
  public boolean contains(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
  public static boolean isEmptyScope(com.intellij.psi.search.SearchScope p0) { return false; }
    // Added by consulo-internal/remap/genstub.py from consulo.content.scope.SearchScope
    public boolean accept(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
}
