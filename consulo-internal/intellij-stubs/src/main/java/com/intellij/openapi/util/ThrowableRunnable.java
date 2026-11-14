package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface ThrowableRunnable<E extends Throwable> {
    void run() throws E;
}
