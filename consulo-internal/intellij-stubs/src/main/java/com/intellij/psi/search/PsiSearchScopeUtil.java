package com.intellij.psi.search;

@SuppressWarnings("all")
public final class PsiSearchScopeUtil {
  public static final com.intellij.openapi.util.Key<com.intellij.psi.search.SearchScope> USE_SCOPE_KEY = null;
  public PsiSearchScopeUtil() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.search.SearchScope union(com.intellij.psi.search.SearchScope p0, com.intellij.psi.search.SearchScope p1) { return null; }
  public static boolean isInScope(com.intellij.psi.search.SearchScope p0, com.intellij.psi.PsiElement p1) { return false; }
  public static boolean isInScope(com.intellij.psi.search.GlobalSearchScope p0, com.intellij.psi.PsiElement p1) { return false; }
  public static boolean isInScope(com.intellij.psi.search.LocalSearchScope p0, com.intellij.psi.PsiElement p1) { return false; }
  public static com.intellij.psi.search.SearchScope restrictScopeTo(com.intellij.psi.search.SearchScope p0, com.intellij.openapi.fileTypes.FileType... p1) { return null; }
  public static com.intellij.psi.search.SearchScope restrictScopeToFileLanguage(com.intellij.openapi.project.Project p0, com.intellij.psi.search.SearchScope p1, com.intellij.lang.LanguageMatcher p2) { return null; }
}
