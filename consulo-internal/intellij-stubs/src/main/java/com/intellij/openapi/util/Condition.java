package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface Condition<T> {
    boolean value(T t);
}
