package com.intellij.openapi.vfs;

@SuppressWarnings("all")
public abstract class VirtualFileManager implements com.intellij.openapi.util.ModificationTracker {
    public VirtualFileSystem getFileSystem(String protocol) { return null; }
    public static final com.intellij.util.messages.Topic<com.intellij.openapi.vfs.newvfs.BulkFileListener> VFS_CHANGES = 
        com.intellij.util.messages.Topic.create("VFS_CHANGES", com.intellij.openapi.vfs.newvfs.BulkFileListener.class);
    public static VirtualFileManager getInstance() { return null; }
    public void addVirtualFileListener(com.intellij.openapi.vfs.VirtualFileListener listener) { }
    public com.intellij.openapi.vfs.VirtualFile findFileByUrl(String url) { return null; }
    // Added by consulo-internal/remap/genstub.py from consulo.virtualFileSystem.VirtualFileManager
    public static final com.intellij.openapi.util.ModificationTracker VFS_STRUCTURE_MODIFICATIONS = null;
    public <VFS extends com.intellij.openapi.vfs.VirtualFileSystem> VFS getRequiredFileSystem(java.lang.String p0) { return null; }
    public long syncRefresh() { return 0L; }
    public long asyncRefresh(java.lang.Runnable p0) { return 0L; }
    public void refreshWithoutFileWatcher(boolean p0) { }
    public com.intellij.openapi.vfs.VirtualFile findFileByNioPath(java.nio.file.Path p0) { return null; }
    public java.lang.String getUrl(java.nio.file.Path p0) { return null; }
    public com.intellij.openapi.vfs.VirtualFile refreshAndFindFileByUrl(java.lang.String p0) { return null; }
    public com.intellij.openapi.vfs.VirtualFile refreshAndFindFileByNioPath(java.nio.file.Path p0) { return null; }
    public void addVirtualFileListener(com.intellij.openapi.vfs.VirtualFileListener p0, com.intellij.openapi.Disposable p1) { }
    public void removeVirtualFileListener(com.intellij.openapi.vfs.VirtualFileListener p0) { }
    public static java.lang.String constructUrl(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String extractProtocol(java.lang.String p0) { return null; }
    public static java.lang.String extractPath(java.lang.String p0) { return null; }
    public void addVirtualFileManagerListener(com.intellij.openapi.vfs.event.VirtualFileManagerListener p0) { }
    public void addVirtualFileManagerListener(com.intellij.openapi.vfs.event.VirtualFileManagerListener p0, com.intellij.openapi.Disposable p1) { }
    public void removeVirtualFileManagerListener(com.intellij.openapi.vfs.event.VirtualFileManagerListener p0) { }
    public void addAsyncFileListener(com.intellij.openapi.vfs.event.AsyncFileListener p0, com.intellij.openapi.Disposable p1) { }
    public void notifyPropertyChanged(com.intellij.openapi.vfs.VirtualFile p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3) { }
    public long getModificationCount() { return 0L; }
    public long getStructureModificationCount() { return 0L; }
    public com.intellij.openapi.vfs.VirtualFile findFileById(int p0) { return null; }
    public int storeName(java.lang.String p0) { return 0; }
    public java.lang.CharSequence getVFileName(int p0) { return null; }
    public javax.swing.Icon getBaseFileIcon(com.intellij.openapi.vfs.VirtualFile p0) { return null; }
    public javax.swing.Icon getFileIcon(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.components.ComponentManager p1, int p2) { return null; }
    public javax.swing.Icon getFileIconNoDefer(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.components.ComponentManager p1, int p2) { return null; }
}
