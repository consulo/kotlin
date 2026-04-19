package com.intellij.openapi.util;

@SuppressWarnings("all")
public class Couple<T> extends Pair<T, T> {
    public Couple(T first, T second) { super(first, second); }
    public static <T> Couple<T> of(T first, T second) { return null; }
}
