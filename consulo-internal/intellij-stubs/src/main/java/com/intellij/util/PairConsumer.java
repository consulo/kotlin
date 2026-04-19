package com.intellij.util;

@SuppressWarnings("all")
public interface PairConsumer<S, T> {
    void consume(S s, T t);
}
