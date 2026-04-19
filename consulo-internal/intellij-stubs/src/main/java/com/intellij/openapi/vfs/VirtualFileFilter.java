package com.intellij.openapi.vfs;
@SuppressWarnings("all")
public interface VirtualFileFilter {
    boolean accept(VirtualFile file);
}
