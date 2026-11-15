package com.intellij.util;

@SuppressWarnings("all")
public interface Processor<T> extends java.util.function.Predicate<T> {
    boolean process(T t);

    default boolean test(T t) { return process(t); }
}
