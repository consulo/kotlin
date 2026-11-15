package com.intellij.openapi.vfs;

@SuppressWarnings("all")
public abstract class VirtualFileManager {
    public abstract VirtualFileSystem getFileSystem(String protocol);
    public static final com.intellij.util.messages.Topic<com.intellij.openapi.vfs.newvfs.BulkFileListener> VFS_CHANGES = 
        com.intellij.util.messages.Topic.create("VFS_CHANGES", com.intellij.openapi.vfs.newvfs.BulkFileListener.class);
    public static VirtualFileManager getInstance() { return null; }
    public abstract void addVirtualFileListener(com.intellij.openapi.vfs.VirtualFileListener listener);
    public abstract com.intellij.openapi.vfs.VirtualFile findFileByUrl(String url);
}
