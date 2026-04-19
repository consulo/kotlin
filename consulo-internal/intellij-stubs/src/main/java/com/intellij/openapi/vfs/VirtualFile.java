package com.intellij.openapi.vfs;

@SuppressWarnings("all")
public abstract class VirtualFile extends com.intellij.openapi.util.UserDataHolderBase implements com.intellij.openapi.util.ModificationTracker {
  public static final com.intellij.openapi.vfs.VirtualFile[] EMPTY_ARRAY = null;
  public static final com.intellij.util.ArrayFactory<com.intellij.openapi.vfs.VirtualFile> ARRAY_FACTORY = null;
  public static final java.lang.String PROP_NAME = null;
  public static final java.lang.String PROP_ENCODING = null;
  public static final java.lang.String PROP_WRITABLE = null;
  public static final java.lang.String PROP_HIDDEN = null;
  public static final java.lang.String PROP_SYMLINK_TARGET = null;
  public static final java.lang.String PROP_CHILDREN_CASE_SENSITIVITY = null;
  protected VirtualFile() { throw new UnsupportedOperationException("stub"); }
  public abstract java.lang.String getName();
  public java.lang.CharSequence getNameSequence() { return null; }
  public abstract com.intellij.openapi.vfs.VirtualFileSystem getFileSystem();
  public abstract java.lang.String getPath();
  public java.nio.file.Path toNioPath() { return null; }
  public java.lang.String getUrl() { return null; }
  public final java.lang.String getPresentableUrl() { return null; }
  public java.lang.String getExtension() { return null; }
  public java.lang.String getNameWithoutExtension() { return null; }
  public void rename(java.lang.Object p0, java.lang.String p1) throws java.io.IOException {}
  public abstract boolean isWritable();
  public void setWritable(boolean p0) throws java.io.IOException {}
  public abstract boolean isDirectory();
  public boolean is(com.intellij.openapi.vfs.VFileProperty p0) { return false; }
  public java.lang.String getCanonicalPath() { return null; }
  public com.intellij.openapi.vfs.VirtualFile getCanonicalFile() { return null; }
  public abstract boolean isValid();
  public abstract com.intellij.openapi.vfs.VirtualFile getParent();
  public abstract com.intellij.openapi.vfs.VirtualFile[] getChildren();
  public com.intellij.openapi.vfs.VirtualFile findChild(java.lang.String p0) { return null; }
  public com.intellij.openapi.vfs.VirtualFile findOrCreateChildData(java.lang.Object p0, java.lang.String p1) throws java.io.IOException { return null; }
  public com.intellij.openapi.fileTypes.FileType getFileType() { return null; }
  public com.intellij.openapi.vfs.VirtualFile findFileByRelativePath(java.lang.String p0) { return null; }
  public com.intellij.openapi.vfs.VirtualFile createChildDirectory(java.lang.Object p0, java.lang.String p1) throws java.io.IOException { return null; }
  public com.intellij.openapi.vfs.VirtualFile createChildData(java.lang.Object p0, java.lang.String p1) throws java.io.IOException { return null; }
  public void delete(java.lang.Object p0) throws java.io.IOException {}
  public void move(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1) throws java.io.IOException {}
  public com.intellij.openapi.vfs.VirtualFile copy(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.String p2) throws java.io.IOException { return null; }
  public java.nio.charset.Charset getCharset() { return null; }
  protected void storeCharset(java.nio.charset.Charset p0) {}
  public void setCharset(java.nio.charset.Charset p0) {}
  public void setCharset(java.nio.charset.Charset p0, java.lang.Runnable p1) {}
  public void setCharset(java.nio.charset.Charset p0, java.lang.Runnable p1, boolean p2) {}
  public boolean isCharsetSet() { return false; }
  public final void setBinaryContent(byte[] p0) throws java.io.IOException {}
  public void setBinaryContent(byte[] p0, long p1, long p2) throws java.io.IOException {}
  public void setBinaryContent(byte[] p0, long p1, long p2, java.lang.Object p3) throws java.io.IOException {}
  public final java.io.OutputStream getOutputStream(java.lang.Object p0) throws java.io.IOException { return null; }
  public abstract java.io.OutputStream getOutputStream(java.lang.Object p0, long p1, long p2) throws java.io.IOException;
  public abstract byte[] contentsToByteArray() throws java.io.IOException;
  public byte[] contentsToByteArray(boolean p0) throws java.io.IOException { return null; }
  public long getModificationStamp() { return 0; }
  public abstract long getTimeStamp();
  public abstract long getLength();
  public void refresh(boolean p0, boolean p1) {}
  public abstract void refresh(boolean p0, boolean p1, java.lang.Runnable p2);
  public java.lang.String getPresentableName() { return null; }
  public long getModificationCount() { return 0; }
  protected boolean nameEquals(java.lang.String p0) { return false; }
  public abstract java.io.InputStream getInputStream() throws java.io.IOException;
  public byte[] getBOM() { return null; }
  public void setBOM(byte[] p0) {}
  public java.lang.String toString() { return null; }
  public boolean exists() { return false; }
  public boolean isInLocalFileSystem() { return false; }
  public java.lang.String getDetectedLineSeparator() { return null; }
  public void setDetectedLineSeparator(java.lang.String p0) {}
  public <T> T computeWithPreloadedContentHint(byte[] p0, java.util.function.Supplier<? extends T> p1) { return null; }
  public boolean isRecursiveOrCircularSymlink() { return false; }
  public boolean isCaseSensitive() { return false; }
}
