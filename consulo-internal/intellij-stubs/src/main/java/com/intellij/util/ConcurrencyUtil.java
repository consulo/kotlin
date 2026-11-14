package com.intellij.util;

@SuppressWarnings("all")
public class ConcurrencyUtil {
    public static <K,V> V cacheOrGet(java.util.concurrent.ConcurrentMap<K,V> cache, K key, V value) {
        V prev = cache.putIfAbsent(key, value);
        return prev == null ? value : prev;
    }
}
