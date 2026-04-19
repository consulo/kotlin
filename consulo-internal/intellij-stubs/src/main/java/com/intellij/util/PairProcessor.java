package com.intellij.util;
@SuppressWarnings("all")
public interface PairProcessor<S, T> {
    boolean process(S s, T t);
}
