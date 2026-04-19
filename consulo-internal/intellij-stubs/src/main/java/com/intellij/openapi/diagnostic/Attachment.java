package com.intellij.openapi.diagnostic;

@SuppressWarnings("all")
public final class Attachment {
  public static final com.intellij.openapi.diagnostic.Attachment[] EMPTY_ARRAY = null;
  public Attachment(java.lang.String p0, java.lang.Throwable p1) { throw new UnsupportedOperationException("stub"); }
  public Attachment(java.lang.String p0, java.lang.String p1) { throw new UnsupportedOperationException("stub"); }
  public Attachment(java.lang.String p0, byte[] p1, java.lang.String p2) { throw new UnsupportedOperationException("stub"); }
  public Attachment(java.lang.String p0, java.nio.file.Path p1, java.lang.String p2) { throw new UnsupportedOperationException("stub"); }
  public Attachment(java.lang.String p0, java.io.File p1, java.lang.String p2) { throw new UnsupportedOperationException("stub"); }
  public java.lang.String getDisplayText() { return null; }
  public java.lang.String getPath() { return null; }
  public java.lang.String getName() { return null; }
  public java.lang.String getEncodedBytes() { return null; }
  public byte[] getBytes() { return null; }
  public java.io.InputStream openContentStream() { return null; }
  public boolean isIncluded() { return false; }
  public void setIncluded(boolean p0) {}
  public java.lang.String toString() { return null; }
}
