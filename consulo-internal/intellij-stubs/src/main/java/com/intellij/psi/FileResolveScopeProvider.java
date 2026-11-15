package com.intellij.psi;

@SuppressWarnings("all")
public interface FileResolveScopeProvider {
    com.intellij.psi.search.GlobalSearchScope getFileResolveScope();
    boolean ignoreReferencedElementAccessibility();
}
