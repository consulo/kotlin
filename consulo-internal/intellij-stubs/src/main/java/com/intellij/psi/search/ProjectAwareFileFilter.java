package com.intellij.psi.search;

@SuppressWarnings("all")
public interface ProjectAwareFileFilter {
    boolean accept(com.intellij.openapi.vfs.VirtualFile file);
}
