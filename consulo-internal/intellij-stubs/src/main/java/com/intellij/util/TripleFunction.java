package com.intellij.util;

@SuppressWarnings("all")
public interface TripleFunction<A, B, C, R> {
    R fun(A a, B b, C c);
}
