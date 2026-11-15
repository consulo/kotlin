package com.intellij.psi.search;

@SuppressWarnings("all")
public abstract class GlobalSearchScope extends com.intellij.psi.search.SearchScope implements com.intellij.psi.search.ProjectAwareFileFilter, consulo.module.content.scope.ModuleAwareSearchScope {
  public static final com.intellij.psi.search.GlobalSearchScope[] EMPTY_ARRAY = null;
  public static final com.intellij.psi.search.GlobalSearchScope EMPTY_SCOPE = null;
  protected GlobalSearchScope(com.intellij.openapi.project.Project p0) { throw new UnsupportedOperationException("stub"); }
  protected GlobalSearchScope() { throw new UnsupportedOperationException("stub"); }
  public com.intellij.openapi.project.Project getProject() { return null; }
  public int compare(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.VirtualFile p1) { return 0; }
  public final boolean accept(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
  public boolean isSearchInLibraries() { return false; }
  public boolean isForceSearchingInLibrarySources() { return false; }
  public com.intellij.psi.search.GlobalSearchScope intersectWith(com.intellij.psi.search.GlobalSearchScope p0) { return null; }
  protected final com.intellij.psi.search.GlobalSearchScope defaultIntersectWith(com.intellij.psi.search.GlobalSearchScope p0) { return null; }
  public com.intellij.psi.search.SearchScope intersectWith(com.intellij.psi.search.SearchScope p0) { return null; }
  public com.intellij.psi.search.LocalSearchScope intersectWith(com.intellij.psi.search.LocalSearchScope p0) { return null; }
  public com.intellij.psi.search.GlobalSearchScope union(com.intellij.psi.search.SearchScope p0) { return null; }
  public com.intellij.psi.search.GlobalSearchScope union(com.intellij.psi.search.LocalSearchScope p0) { return null; }
  public com.intellij.psi.search.GlobalSearchScope uniteWith(com.intellij.psi.search.GlobalSearchScope p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope union(java.util.Collection<? extends com.intellij.psi.search.GlobalSearchScope> p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope union(com.intellij.psi.search.GlobalSearchScope[] p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope allScope(com.intellij.openapi.project.Project p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope projectScope(com.intellij.openapi.project.Project p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope everythingScope(com.intellij.openapi.project.Project p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope notScope(com.intellij.psi.search.GlobalSearchScope p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope fileScope(com.intellij.psi.PsiFile p0) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope fileScope(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope fileScope(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.String p2) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope filesScope(com.intellij.openapi.project.Project p0, java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile> p1) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope filesScope(com.intellij.openapi.project.Project p0, java.util.function.Supplier<? extends java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile>> p1) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope filesWithoutLibrariesScope(com.intellij.openapi.project.Project p0, java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile> p1) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope filesWithLibrariesScope(com.intellij.openapi.project.Project p0, java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile> p1) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope filesScope(com.intellij.openapi.project.Project p0, java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile> p1, java.lang.String p2) { return null; }
  public static com.intellij.psi.search.GlobalSearchScope getScopeRestrictedByFileTypes(com.intellij.psi.search.GlobalSearchScope p0, com.intellij.openapi.fileTypes.FileType... p1) { return null; }
  public static void markFileForWeakScope(com.intellij.openapi.vfs.VirtualFile p0) {}
    // Added by consulo-internal/remap/genstub.py from consulo.language.psi.scope.GlobalSearchScope
    public boolean isSearchInModuleContent(com.intellij.openapi.module.Module p0) { return false; }
    public boolean isSearchInModuleContent(com.intellij.openapi.module.Module p0, boolean p1) { return false; }
    public java.util.Collection<consulo.module.UnloadedModuleDescription> getUnloadedModulesBelongingToScope() { return null; }
    public boolean isSearchOutsideRootModel() { return false; }
    public static com.intellij.psi.search.GlobalSearchScope moduleScope(com.intellij.openapi.module.Module p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleScope(com.intellij.openapi.module.Module p0, boolean p1) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleContentScope(com.intellij.openapi.module.Module p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleWithLibrariesScope(com.intellij.openapi.module.Module p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleWithDependenciesScope(com.intellij.openapi.module.Module p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleRuntimeScope(com.intellij.openapi.module.Module p0, boolean p1) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleWithDependenciesAndLibrariesScope(com.intellij.openapi.module.Module p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleWithDependenciesAndLibrariesScope(com.intellij.openapi.module.Module p0, boolean p1) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleWithDependentsScope(com.intellij.openapi.module.Module p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleTestsWithDependentsScope(com.intellij.openapi.module.Module p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope moduleContentWithDependenciesScope(com.intellij.openapi.module.Module p0) { return null; }
}
