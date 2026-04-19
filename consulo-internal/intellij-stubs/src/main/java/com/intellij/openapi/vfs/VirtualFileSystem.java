package com.intellij.openapi.vfs;

@SuppressWarnings("all")
public abstract class VirtualFileSystem {
  public static final com.intellij.openapi.extensions.ExtensionPointName<com.intellij.util.KeyedLazyInstance<com.intellij.openapi.vfs.VirtualFileSystem>> EP_NAME = null;
  protected VirtualFileSystem() { throw new UnsupportedOperationException("stub"); }
  public abstract java.lang.String getProtocol();
  public abstract com.intellij.openapi.vfs.VirtualFile findFileByPath(java.lang.String p0);
  public java.lang.String extractPresentableUrl(java.lang.String p0) { return null; }
  public abstract void refresh(boolean p0);
  public abstract com.intellij.openapi.vfs.VirtualFile refreshAndFindFileByPath(java.lang.String p0);
  public abstract void addVirtualFileListener(com.intellij.openapi.vfs.VirtualFileListener p0);
  public final void addVirtualFileListener(com.intellij.openapi.vfs.VirtualFileListener p0, com.intellij.openapi.Disposable p1) {}
  public abstract void removeVirtualFileListener(com.intellij.openapi.vfs.VirtualFileListener p0);
  protected abstract void deleteFile(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1) throws java.io.IOException;
  protected abstract void moveFile(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, com.intellij.openapi.vfs.VirtualFile p2) throws java.io.IOException;
  protected abstract void renameFile(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.String p2) throws java.io.IOException;
  protected abstract com.intellij.openapi.vfs.VirtualFile createChildFile(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.String p2) throws java.io.IOException;
  protected abstract com.intellij.openapi.vfs.VirtualFile createChildDirectory(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.String p2) throws java.io.IOException;
  protected abstract com.intellij.openapi.vfs.VirtualFile copyFile(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, com.intellij.openapi.vfs.VirtualFile p2, java.lang.String p3) throws java.io.IOException;
  public abstract boolean isReadOnly();
  public boolean isCaseSensitive() { return false; }
  public boolean isValidName(java.lang.String p0) { return false; }
  public java.nio.file.Path getNioPath(com.intellij.openapi.vfs.VirtualFile p0) { return null; }
}
