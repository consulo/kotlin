package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public abstract class LanguageFileType implements com.intellij.openapi.fileTypes.FileType {
  protected LanguageFileType(com.intellij.lang.Language p0) { throw new UnsupportedOperationException("stub"); }
  protected LanguageFileType(com.intellij.lang.Language p0, boolean p1) { throw new UnsupportedOperationException("stub"); }
  public final com.intellij.lang.Language getLanguage() { return null; }
  public final boolean isBinary() { return false; }
  public boolean isSecondary() { return false; }
  public boolean isJVMDebuggingSupported() { return false; }
  public java.nio.charset.Charset extractCharsetFromFileContent(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.String p2) { return null; }
  public java.nio.charset.Charset extractCharsetFromFileContent(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.CharSequence p2) { return null; }
  public java.lang.String getDisplayName() { return null; }
}
