package com.intellij.testFramework;
@SuppressWarnings("all")
public abstract class LightVirtualFileBase extends com.intellij.openapi.vfs.VirtualFile {
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
}
