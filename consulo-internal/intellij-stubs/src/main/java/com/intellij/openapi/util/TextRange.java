package com.intellij.openapi.util;

@SuppressWarnings("all")
public class TextRange implements com.intellij.openapi.util.Segment,java.io.Serializable {
  public static final com.intellij.openapi.util.TextRange EMPTY_RANGE = null;
  public static final com.intellij.openapi.util.TextRange[] EMPTY_ARRAY = null;
  public TextRange(int p0, int p1) { throw new UnsupportedOperationException("stub"); }
  protected TextRange(int p0, int p1, boolean p2) { throw new UnsupportedOperationException("stub"); }
  public final int getStartOffset() { return 0; }
  public final int getEndOffset() { return 0; }
  public final int getLength() { return 0; }
  public boolean equals(java.lang.Object p0) { return false; }
  public int hashCode() { return 0; }
  public boolean contains(com.intellij.openapi.util.TextRange p0) { return false; }
  public boolean contains(com.intellij.openapi.util.Segment p0) { return false; }
  public boolean containsRange(int p0, int p1) { return false; }
  public static boolean containsRange(com.intellij.openapi.util.Segment p0, com.intellij.openapi.util.Segment p1) { return false; }
  public boolean containsOffset(int p0) { return false; }
  public java.lang.String toString() { return null; }
  public boolean contains(int p0) { return false; }
  public java.lang.String substring(java.lang.String p0) { return null; }
  public java.lang.CharSequence subSequence(java.lang.CharSequence p0) { return null; }
  public com.intellij.openapi.util.TextRange cutOut(com.intellij.openapi.util.TextRange p0) { return null; }
  public com.intellij.openapi.util.TextRange shiftRight(int p0) { return null; }
  public com.intellij.openapi.util.TextRange shiftLeft(int p0) { return null; }
  public com.intellij.openapi.util.TextRange grown(int p0) { return null; }
  public static com.intellij.openapi.util.TextRange from(int p0, int p1) { return null; }
  public static com.intellij.openapi.util.TextRange create(int p0, int p1) { return null; }
  public static com.intellij.openapi.util.TextRange create(com.intellij.openapi.util.Segment p0) { return null; }
  public static boolean areSegmentsEqual(com.intellij.openapi.util.Segment p0, com.intellij.openapi.util.Segment p1) { return false; }
  public java.lang.String replace(java.lang.String p0, java.lang.String p1) { return null; }
  public boolean intersects(com.intellij.openapi.util.TextRange p0) { return false; }
  public boolean intersects(com.intellij.openapi.util.Segment p0) { return false; }
  public boolean intersects(int p0, int p1) { return false; }
  public boolean intersectsStrict(com.intellij.openapi.util.TextRange p0) { return false; }
  public boolean intersectsStrict(int p0, int p1) { return false; }
  public com.intellij.openapi.util.TextRange intersection(com.intellij.openapi.util.TextRange p0) { return null; }
  public boolean isEmpty() { return false; }
  public com.intellij.openapi.util.TextRange union(com.intellij.openapi.util.TextRange p0) { return null; }
  public boolean equalsToRange(int p0, int p1) { return false; }
  public static com.intellij.openapi.util.TextRange allOf(java.lang.String p0) { return null; }
  public static void assertProperRange(com.intellij.openapi.util.Segment p0) throws java.lang.AssertionError {}
  public static void assertProperRange(com.intellij.openapi.util.Segment p0, java.lang.Object p1) throws java.lang.AssertionError {}
  public static void assertProperRange(int p0, int p1, java.lang.Object p2) {}
  public static boolean isProperRange(int p0, int p1) { return false; }
  public boolean isProperRange() { return false; }
}
