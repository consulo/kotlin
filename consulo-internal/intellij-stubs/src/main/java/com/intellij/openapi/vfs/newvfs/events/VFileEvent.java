package com.intellij.openapi.vfs.newvfs.events;

@SuppressWarnings("all")
public abstract class VFileEvent {
    public com.intellij.openapi.vfs.VirtualFile getFile() { return null; }
    public String getPath() { return null; }
}
