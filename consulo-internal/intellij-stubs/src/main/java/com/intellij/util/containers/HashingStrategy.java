package com.intellij.util.containers;

@SuppressWarnings("all")
public interface HashingStrategy<T> {
    int hashCode(T object);
    boolean equals(T o1, T o2);
    static <T> HashingStrategy<T> canonical() { return null; }
    static HashingStrategy<String> caseInsensitive() { return null; }
}
