package com.intellij.util;

@SuppressWarnings("all")
public interface ThrowableConsumer<T, E extends Throwable> {
    void consume(T t) throws E;
}
