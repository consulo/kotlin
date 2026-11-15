package com.intellij.testFramework;
@SuppressWarnings("all")
public abstract class LightVirtualFileBase extends com.intellij.openapi.vfs.VirtualFile implements com.intellij.openapi.vfs.internal.VirtualFileWithAssignedFileType {
    public LightVirtualFileBase(String name, com.intellij.openapi.fileTypes.FileType fileType, long modificationStamp) { throw new UnsupportedOperationException("stub"); }
    public java.lang.String getName() { return null; }
    public java.lang.String getPath() { return null; }
    public boolean isDirectory() { return false; }
    public boolean isValid() { return true; }
    public com.intellij.openapi.vfs.VirtualFile getParent() { return null; }
    public com.intellij.openapi.vfs.VirtualFile[] getChildren() { return null; }
    public com.intellij.openapi.vfs.VirtualFileSystem getFileSystem() { return null; }
    public boolean isWritable() { return false; }
    public long getTimeStamp() { return 0; }
    public long getLength() { return 0; }
    public java.io.OutputStream getOutputStream(Object requestor, long newModificationStamp, long newTimeStamp) throws java.io.IOException { return null; }
    public byte[] contentsToByteArray() throws java.io.IOException { return null; }
    public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public void refresh(boolean asynchronous, boolean recursive, Runnable postRunnable) {}
    // Added by consulo-internal/remap/genstub.py from consulo.virtualFileSystem.light.LightVirtualFileBase
    public void setFileType(com.intellij.openapi.fileTypes.FileType p0) { }
    public com.intellij.openapi.vfs.VirtualFile getOriginalFile() { return null; }
    public void setOriginalFile(com.intellij.openapi.vfs.VirtualFile p0) { }
    public com.intellij.openapi.fileTypes.FileType getAssignedFileType() { return null; }
    public void setValid(boolean p0) { }
    public long getModificationStamp() { return 0L; }
    protected void setModificationStamp(long p0) { }
    public void setWritable(boolean p0) { }
    public void rename(java.lang.Object p0, java.lang.String p1) throws java.io.IOException { }
    protected LightVirtualFileBase() { }
}
