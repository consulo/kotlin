package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public interface FileType {
  public abstract java.lang.String getName();
  public default java.lang.String getDisplayName() { return null; }
  public abstract java.lang.String getDescription();
  public abstract java.lang.String getDefaultExtension();
  public abstract javax.swing.Icon getIcon();
  public abstract boolean isBinary();
  public default boolean isReadOnly() { return false; }
  public default java.lang.String getCharset(com.intellij.openapi.vfs.VirtualFile p0, byte[] p1) { return null; }
}
