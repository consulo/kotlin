package com.intellij.util.containers;

@SuppressWarnings("all")
public class MultiMap<K, V> implements java.io.Serializable {
  protected final java.util.Map<K, java.util.Collection<V>> myMap;
  public MultiMap() { throw new UnsupportedOperationException("stub"); }
  public MultiMap(java.util.Map<K, java.util.Collection<V>> p0) { throw new UnsupportedOperationException("stub"); }
  public MultiMap(int p0) { throw new UnsupportedOperationException("stub"); }
  public MultiMap(com.intellij.util.containers.MultiMap<? extends K, ? extends V> p0) { throw new UnsupportedOperationException("stub"); }
  public com.intellij.util.containers.MultiMap<K, V> copy() { return null; }
  public MultiMap(int p0, float p1) { throw new UnsupportedOperationException("stub"); }
  protected java.util.Collection<V> createCollection() { return null; }
  protected java.util.Collection<V> createEmptyCollection() { return null; }
  public final void putAllValues(com.intellij.util.containers.MultiMap<? extends K, ? extends V> p0) {}
  public final java.util.Map<K, java.util.Collection<V>> toHashMap() { return null; }
  public final void putAllValues(java.util.Map<? extends K, ? extends V> p0) {}
  public final void putValues(K p0, java.util.Collection<? extends V> p1) {}
  public final void putValue(K p0, V p1) {}
  public final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> entrySet() { return null; }
  public final java.util.Map<K, java.util.Collection<V>> freezeValues() { return null; }
  public final boolean isEmpty() { return false; }
  public final boolean containsKey(K p0) { return false; }
  public final boolean containsScalarValue(V p0) { return false; }
  public final java.util.Collection<V> get(K p0) { return null; }
  public final java.util.Collection<V> getOrPut(K p0, java.util.function.Supplier<? extends V> p1) { return null; }
  public final java.util.Collection<V> getModifiable(K p0) { return null; }
  public final java.util.Set<K> keySet() { return null; }
  public final int size() { return 0; }
  public final void put(K p0, java.util.Collection<V> p1) {}
  public final void removeValue(K p0, V p1) {}
  public boolean remove(K p0, V p1) { return false; }
  public final java.util.Collection<V> values() { return null; }
  public final void clear() {}
  public final java.util.Collection<V> remove(K p0) { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> create() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createIdentity() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createLinked() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createLinkedSet() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createOrderedSet() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createConcurrent() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createConcurrentSet() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createSet() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createSet(java.util.Map<K, java.util.Collection<V>> p0) { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> createWeakKey() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> create(int p0, float p1) { return null; }
  public final boolean equals(java.lang.Object p0) { return false; }
  public final int hashCode() { return 0; }
  public final java.lang.String toString() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> empty() { return null; }
}
