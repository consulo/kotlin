package com.intellij.util.containers;

@SuppressWarnings("all")
public abstract class Interner<T> {
  public Interner() { throw new UnsupportedOperationException("stub"); }
  public static <T> com.intellij.util.containers.Interner<T> createWeakInterner() { return null; }
  public static com.intellij.util.containers.Interner<java.lang.String> createStringInterner() { return null; }
  public static <T> com.intellij.util.containers.Interner<T> createInterner() { return null; }
  public abstract T intern(T p0);
  public abstract void clear();
  public abstract java.util.Set<T> getValues();
}
