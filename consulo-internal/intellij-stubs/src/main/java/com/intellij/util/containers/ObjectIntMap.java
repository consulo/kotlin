package com.intellij.util.containers;

@SuppressWarnings("all")
public interface ObjectIntMap<K> {
    int get(K key);
    int put(K key, int value);
    int remove(K key);
    boolean containsKey(K key);
    int size();
}
