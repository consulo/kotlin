package com.intellij.openapi.util;

@SuppressWarnings("all")
public class Pair<A, B> {
  public static class NonNull<A, B> extends Pair<A, B> {
    public NonNull(A first, B second) { super(first, second); }
  }
  public final A first;
  public final B second;
  public static <A, B> com.intellij.openapi.util.Pair<A, B> create(A p0, B p1) { return null; }
  public static <A, B> com.intellij.openapi.util.Pair.NonNull<A, B> createNonNull(A p0, B p1) { return null; }
  public static <A, B> com.intellij.openapi.util.Pair<A, B> pair(A p0, B p1) { return null; }
  public static <T> T getFirst(com.intellij.openapi.util.Pair<T, ?> p0) { return null; }
  public static <T> T getSecond(com.intellij.openapi.util.Pair<?, T> p0) { return null; }
  public static <A, B> com.intellij.openapi.util.Pair<A, B> empty() { return null; }
  public Pair(A p0, B p1) { throw new UnsupportedOperationException("stub"); }
  public final A getFirst() { return null; }
  public final B getSecond() { return null; }
  public final boolean equals(java.lang.Object p0) { return false; }
  public int hashCode() { return 0; }
  public java.lang.String toString() { return null; }
  public static <A extends java.lang.Comparable<? super A>, B> java.util.Comparator<com.intellij.openapi.util.Pair<A, B>> comparingByFirst() { return null; }
  public static <A, B extends java.lang.Comparable<? super B>> java.util.Comparator<com.intellij.openapi.util.Pair<A, B>> comparingBySecond() { return null; }
}
