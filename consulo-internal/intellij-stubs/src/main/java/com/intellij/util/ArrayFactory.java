package com.intellij.util;

@SuppressWarnings("all")
public interface ArrayFactory<T> {
  public abstract T[] create(int p0);
}
