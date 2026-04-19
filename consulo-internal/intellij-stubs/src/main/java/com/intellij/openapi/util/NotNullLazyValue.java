package com.intellij.openapi.util;

@SuppressWarnings("all")
public abstract class NotNullLazyValue<T> implements java.util.function.Supplier<T> {
  protected NotNullLazyValue() { throw new UnsupportedOperationException("stub"); }
  protected abstract T compute();
  public final T get() { return null; }
  public T getValue() { return null; }
  public boolean isComputed() { return false; }
  public static <T> com.intellij.openapi.util.NotNullLazyValue<T> createConstantValue(T p0) { return null; }
  public static <T> com.intellij.openapi.util.NotNullLazyValue<T> createValue(com.intellij.openapi.util.NotNullFactory<? extends T> p0) { return null; }
  public static <T> com.intellij.openapi.util.NotNullLazyValue<T> lazy(java.util.function.Supplier<? extends T> p0) { return null; }
  public static <T> com.intellij.openapi.util.NotNullLazyValue<T> atomicLazy(java.util.function.Supplier<? extends T> p0) { return null; }
  public static <T> java.util.function.Supplier<T> softLazy(java.util.function.Supplier<? extends T> p0) { return null; }
  public static <T> com.intellij.openapi.util.NotNullLazyValue<T> volatileLazy(java.util.function.Supplier<? extends T> p0) { return null; }
}
