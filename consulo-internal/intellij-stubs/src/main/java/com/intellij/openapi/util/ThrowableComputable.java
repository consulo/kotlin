package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface ThrowableComputable<T, E extends Throwable> extends com.intellij.openapi.util.text.function.ThrowableSupplier<T, E> {
    T compute() throws E;
    default T get() throws E { return compute(); }
}
