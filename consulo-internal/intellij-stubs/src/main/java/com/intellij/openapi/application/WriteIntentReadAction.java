package com.intellij.openapi.application;

// consulo.kotlin.compat.application.WriteIntentReadAction
@SuppressWarnings("all")
public final class WriteIntentReadAction {
    public static void run(Runnable action) { }
    public static <T> T compute(java.util.function.Supplier<T> action) { return null; }
}
