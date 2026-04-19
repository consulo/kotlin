package com.intellij.util.lang;

@SuppressWarnings("all")
public final class JavaVersion implements java.lang.Comparable<JavaVersion> {
  public final int feature;
  public final int minor;
  public final int update;
  public final int build;
  public final boolean ea;
  private JavaVersion() { this.feature = 0; this.minor = 0; this.update = 0; this.build = 0; this.ea = false; }
  public int compareTo(com.intellij.util.lang.JavaVersion p0) { return 0; }
  public boolean isAtLeast(int p0) { return false; }
  public boolean equals(java.lang.Object p0) { return false; }
  public int hashCode() { return 0; }
  public java.lang.String toFeatureString() { return null; }
  public java.lang.String toFeatureMinorUpdateString() { return null; }
  public java.lang.String toString() { return null; }
  public static com.intellij.util.lang.JavaVersion compose(int p0, int p1, int p2, int p3, boolean p4) throws java.lang.IllegalArgumentException { return null; }
  public static com.intellij.util.lang.JavaVersion compose(int p0) { return null; }
  public static com.intellij.util.lang.JavaVersion current() { return null; }
  public static com.intellij.util.lang.JavaVersion parse(java.lang.String p0) throws java.lang.IllegalArgumentException { return null; }
  public static com.intellij.util.lang.JavaVersion tryParse(java.lang.String p0) { return null; }
}
