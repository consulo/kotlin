package com.intellij.util;

@SuppressWarnings("all")
public final class SmartFMap<K, V> implements java.util.Map<K, V> {
    public static <K, V> SmartFMap<K, V> emptyMap() { return null; }
    public SmartFMap<K, V> plus(K key, V value) { return this; }
    public SmartFMap<K, V> minus(K key) { return this; }
    public int size() { return 0; }
    public boolean isEmpty() { return true; }
    public boolean containsKey(Object key) { return false; }
    public boolean containsValue(Object value) { return false; }
    public V get(Object key) { return null; }
    public V put(K key, V value) { return null; }
    public V remove(Object key) { return null; }
    public void putAll(java.util.Map<? extends K, ? extends V> m) {}
    public void clear() {}
    public java.util.Set<K> keySet() { return null; }
    public java.util.Collection<V> values() { return null; }
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
}
