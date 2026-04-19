package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface Computable<T> extends java.util.function.Supplier<T> {
  public abstract T compute();
  public default T get() { return null; }
}
