package com.intellij.psi.compiled;

@SuppressWarnings("all")
public interface ClassFileDecompiler {
    boolean accepts(com.intellij.openapi.vfs.VirtualFile file);
}
