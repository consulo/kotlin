package com.intellij.util.containers;

@SuppressWarnings("all")
public interface IntObjectMap<V> {
    V get(int key);
    V put(int key, V value);
    V remove(int key);
    boolean containsKey(int key);
    int size();
}
