package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface Condition<T> extends java.util.function.Predicate<T> {
    boolean value(T t);
    default boolean test(T t) { return value(t); }
}
