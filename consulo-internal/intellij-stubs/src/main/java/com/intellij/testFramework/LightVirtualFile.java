package com.intellij.testFramework;

@SuppressWarnings("all")
public class LightVirtualFile extends LightVirtualFileBase {
  public LightVirtualFile() { super("", null, 0); }
  public LightVirtualFile(java.lang.String p0) { super(p0, null, 0); }
  public LightVirtualFile(java.lang.String p0, java.lang.CharSequence p1) { super(p0, null, 0); }
  public LightVirtualFile(java.lang.String p0, com.intellij.openapi.fileTypes.FileType p1, java.lang.CharSequence p2) { super(p0, p1, 0); }
  public LightVirtualFile(com.intellij.openapi.vfs.VirtualFile p0, java.lang.CharSequence p1, long p2) { super("", null, p2); }
  public LightVirtualFile(java.lang.String p0, com.intellij.openapi.fileTypes.FileType p1, java.lang.CharSequence p2, long p3) { super(p0, p1, p3); }
  public LightVirtualFile(java.lang.String p0, com.intellij.openapi.fileTypes.FileType p1, java.lang.CharSequence p2, java.nio.charset.Charset p3, long p4) { super(p0, p1, p4); }
  public LightVirtualFile(java.lang.String p0, com.intellij.lang.Language p1, java.lang.CharSequence p2) { super(p0, null, 0); }
  protected void storeCharset(java.nio.charset.Charset p0) {}
  public com.intellij.lang.Language getLanguage() { return null; }
  public void setLanguage(com.intellij.lang.Language p0) {}
  public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
  public long getLength() { return 0; }
  public java.io.OutputStream getOutputStream(java.lang.Object p0, long p1, long p2) throws java.io.IOException { return null; }
  public byte[] contentsToByteArray() throws java.io.IOException { return null; }
  public void setContent(java.lang.Object p0, java.lang.CharSequence p1, boolean p2) {}
  public java.lang.CharSequence getContent() { return null; }
  public com.intellij.util.ThreeState isTooLargeForIntelligence() { return null; }
  public boolean shouldSkipEventSystem() { return false; }
  public java.lang.String toString() { return null; }
  public static boolean shouldSkipEventSystem(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
}
