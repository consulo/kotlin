package com.intellij.openapi.util;

@SuppressWarnings("all")
public final class Disposer {
    public static void register(com.intellij.openapi.Disposable parent, com.intellij.openapi.Disposable child) {}
    public static void dispose(com.intellij.openapi.Disposable disposable) {}
    public static com.intellij.openapi.Disposable newDisposable() { return null; }
    public static com.intellij.openapi.Disposable newDisposable(String debugName) { return null; }
    public static boolean isDisposed(com.intellij.openapi.Disposable disposable) { return false; }
}
