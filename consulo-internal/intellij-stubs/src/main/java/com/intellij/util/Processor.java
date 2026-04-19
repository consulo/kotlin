package com.intellij.util;

@SuppressWarnings("all")
public interface Processor<T> {
    boolean process(T t);
}
