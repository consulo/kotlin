package com.intellij.util;

@SuppressWarnings("all")
public interface KeyedLazyInstance<T> {
    String getKey();
    T getInstance();
}
