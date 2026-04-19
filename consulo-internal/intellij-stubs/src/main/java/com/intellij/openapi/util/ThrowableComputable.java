package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface ThrowableComputable<T, E extends Throwable> {
    T compute() throws E;
}
