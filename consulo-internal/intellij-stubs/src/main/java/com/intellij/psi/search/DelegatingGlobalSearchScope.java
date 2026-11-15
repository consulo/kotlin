package com.intellij.psi.search;

@SuppressWarnings("all")
public class DelegatingGlobalSearchScope extends GlobalSearchScope {
    protected final GlobalSearchScope myBaseScope;
    public DelegatingGlobalSearchScope(GlobalSearchScope p0) { this.myBaseScope = p0; }
    public DelegatingGlobalSearchScope(GlobalSearchScope p0, Object... p1) { this.myBaseScope = p0; }
    public DelegatingGlobalSearchScope(com.intellij.openapi.project.Project p0, GlobalSearchScope p1) { this.myBaseScope = p1; }
    public boolean contains(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
    public boolean isSearchInLibraries() { return false; }
}
