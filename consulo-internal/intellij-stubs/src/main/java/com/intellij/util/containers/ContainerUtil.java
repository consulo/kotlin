package com.intellij.util.containers;

@SuppressWarnings("all")
public final class ContainerUtil {
  public static class ImmutableMapBuilder<K, V> {
    public ImmutableMapBuilder<K, V> put(K key, V value) { return this; }
    public java.util.Map<K, V> build() { return null; }
  }
  public enum MergeResult { FIRST_ONLY, SECOND_ONLY, EQUAL }
  public ContainerUtil() { throw new UnsupportedOperationException("stub"); }
  public static <T> T[] ar(T... p0) { return null; }
  public static <K, V> java.util.HashMap<K, V> newHashMap() { return null; }
  public static <K, V> java.util.Map<K, V> newHashMap(com.intellij.openapi.util.Pair<? extends K, ? extends V> p0, com.intellij.openapi.util.Pair<? extends K, ? extends V>... p1) { return null; }
  public static <K, V> java.util.Map<K, V> newHashMap(java.util.List<? extends K> p0, java.util.List<? extends V> p1) { return null; }
  public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap() { return null; }
  public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap(com.intellij.openapi.util.Pair<? extends K, ? extends V> p0, com.intellij.openapi.util.Pair<? extends K, ? extends V>... p1) { return null; }
  public static <T> java.util.LinkedList<T> newLinkedList() { return null; }
  public static <T> java.util.LinkedList<T> newLinkedList(T... p0) { return null; }
  public static <T> java.util.ArrayList<T> newArrayList() { return null; }
  public static <E> java.util.ArrayList<E> newArrayList(E... p0) { return null; }
  public static <E> java.util.ArrayList<E> newArrayList(java.util.Collection<? extends E> p0) { return null; }
  public static <E> java.util.ArrayList<E> newArrayList(java.lang.Iterable<? extends E> p0) { return null; }
  public static <T> java.util.ArrayList<T> newArrayListWithCapacity(int p0) { return null; }
  public static <T> java.util.List<T> subArrayAsList(T[] p0, int p1, int p2) { return null; }
  public static <T> java.util.List<T> newUnmodifiableList(java.util.List<? extends T> p0) { return null; }
  public static <T> java.util.List<T> unmodifiableOrEmptyList(java.util.List<? extends T> p0) { return null; }
  public static <T> java.util.Set<T> unmodifiableOrEmptySet(java.util.Set<? extends T> p0) { return null; }
  public static <K, V> java.util.Map<K, V> unmodifiableOrEmptyMap(java.util.Map<? extends K, ? extends V> p0) { return null; }
  public static <T> java.util.List<T> newSmartList() { return null; }
  public static <T> java.util.HashSet<T> newHashSet() { return null; }
  public static <T> java.util.HashSet<T> newHashSet(T... p0) { return null; }
  public static <T> java.util.HashSet<T> newHashSet(java.lang.Iterable<? extends T> p0) { return null; }
  public static <T> java.util.HashSet<T> newHashSet(java.util.Collection<? extends T> p0) { return null; }
  public static <T> java.util.HashSet<T> newHashSet(java.util.Iterator<? extends T> p0) { return null; }
  public static <T> java.util.Set<T> newHashOrEmptySet(java.lang.Iterable<? extends T> p0) { return null; }
  public static <T> java.util.LinkedHashSet<T> newLinkedHashSet() { return null; }
  public static <T> java.util.LinkedHashSet<T> newLinkedHashSet(java.lang.Iterable<? extends T> p0) { return null; }
  public static <T> java.util.LinkedHashSet<T> newLinkedHashSet(java.util.Collection<? extends T> p0) { return null; }
  public static <T> java.util.LinkedHashSet<T> newLinkedHashSet(T... p0) { return null; }
  public static <T> java.util.Set<T> newConcurrentSet() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentMap() { return null; }
  public static <E> java.util.List<E> reverse(java.util.List<? extends E> p0) { return null; }
  public static <K, V> java.util.Map<K, V> union(java.util.Map<? extends K, ? extends V> p0, java.util.Map<? extends K, ? extends V> p1) { return null; }
  public static <T> java.util.Set<T> union(java.util.Set<? extends T> p0, java.util.Set<? extends T> p1) { return null; }
  public static <T> java.util.Set<T> union(java.util.Collection<? extends T> p0, java.util.Collection<? extends T> p1) { return null; }
  public static <E> java.util.Set<E> immutableSet(E... p0) { return null; }
  public static <E> com.intellij.util.containers.ImmutableList<E> immutableList(E... p0) { return null; }
  public static <E> java.util.List<E> immutableList() { return null; }
  public static <E> java.util.List<E> immutableList(E p0) { return null; }
  public static <E> com.intellij.util.containers.ImmutableList<E> immutableSingletonList(E p0) { return null; }
  public static <E> com.intellij.util.containers.ImmutableList<E> immutableList(java.util.List<? extends E> p0) { return null; }
  public static <K, V> com.intellij.util.containers.ContainerUtil.ImmutableMapBuilder<K, V> immutableMapBuilder() { return null; }
  public static <K, V> com.intellij.util.containers.MultiMap<K, V> groupBy(java.lang.Iterable<? extends V> p0, com.intellij.util.NullableFunction<? super V, ? extends K> p1) { return null; }
  public static <T> T getOrElse(java.util.List<? extends T> p0, int p1, T p2) { return null; }
  public static <K, V> java.util.Map<K, V> intersection(java.util.Map<? extends K, ? extends V> p0, java.util.Map<? extends K, ? extends V> p1) { return null; }
  public static <K, V> java.util.Map<K, com.intellij.openapi.util.Couple<V>> diff(java.util.Map<? extends K, ? extends V> p0, java.util.Map<? extends K, ? extends V> p1) { return null; }
  public static <T> void processSortedListsInOrder(java.util.List<? extends T> p0, java.util.List<? extends T> p1, java.util.Comparator<? super T> p2, boolean p3, com.intellij.util.PairConsumer<? super T, ? super com.intellij.util.containers.ContainerUtil.MergeResult> p4) {}
  public static <T> java.util.List<T> mergeSortedLists(java.util.List<? extends T> p0, java.util.List<? extends T> p1, java.util.Comparator<? super T> p2, boolean p3) { return null; }
  public static <T> java.util.List<T> subList(java.util.List<T> p0, int p1) { return null; }
  public static <T> void addAll(java.util.Collection<? super T> p0, java.lang.Iterable<? extends T> p1) {}
  public static <T> void addAll(java.util.Collection<? super T> p0, java.util.Iterator<? extends T> p1) {}
  public static <T> void addAllNotNull(java.util.Collection<? super T> p0, java.lang.Iterable<? extends T> p1) {}
  public static <T> void addAllNotNull(java.util.Collection<? super T> p0, java.util.Iterator<? extends T> p1) {}
  public static <K, V> java.util.Map<K, V> newMapFromKeys(java.util.Iterator<? extends K> p0, com.intellij.util.containers.Convertor<? super K, ? extends V> p1) { return null; }
  public static <K, V> java.util.Map<K, V> newMapFromValues(java.util.Iterator<? extends V> p0, com.intellij.util.containers.Convertor<? super V, ? extends K> p1) { return null; }
  public static <K, V> void fillMapWithValues(java.util.Map<? super K, ? super V> p0, java.util.Iterator<? extends V> p1, com.intellij.util.containers.Convertor<? super V, ? extends K> p2) {}
  public static <K, V> java.util.Map<K, java.util.Set<V>> classify(java.util.Iterator<? extends V> p0, com.intellij.util.containers.Convertor<? super V, ? extends K> p1) { return null; }
  public static <T> T find(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T> boolean process(java.lang.Iterable<? extends T> p0, com.intellij.util.Processor<? super T> p1) { return false; }
  public static <T> boolean process(java.util.List<? extends T> p0, com.intellij.util.Processor<? super T> p1) { return false; }
  public static <T> boolean process(T[] p0, com.intellij.util.Processor<? super T> p1) { return false; }
  public static <T> boolean process(java.util.Iterator<? extends T> p0, com.intellij.util.Processor<? super T> p1) { return false; }
  public static <T> T find(java.lang.Iterable<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T> T find(java.lang.Iterable<? extends T> p0, T p1) { return null; }
  public static <T> T find(java.util.Iterator<? extends T> p0, T p1) { return null; }
  public static <T> T find(java.util.Iterator<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T> T findLast(java.util.List<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T, K, V> java.util.Map<K, V> map2Map(T[] p0, com.intellij.util.Function<? super T, ? extends com.intellij.openapi.util.Pair<? extends K, ? extends V>> p1) { return null; }
  public static <T, K, V> java.util.Map<K, V> map2Map(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends com.intellij.openapi.util.Pair<? extends K, ? extends V>> p1) { return null; }
  public static <T, K, V> java.util.Map<K, V> map2MapNotNull(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends com.intellij.openapi.util.Pair<? extends K, ? extends V>> p1) { return null; }
  public static <T, K, V> java.util.Map<K, V> map2MapNotNull(T[] p0, com.intellij.util.Function<? super T, ? extends com.intellij.openapi.util.Pair<? extends K, ? extends V>> p1) { return null; }
  public static <K, V> java.util.Map<K, V> map2Map(java.util.Collection<? extends com.intellij.openapi.util.Pair<? extends K, ? extends V>> p0) { return null; }
  public static <T> java.lang.Object[] map2Array(T[] p0, com.intellij.util.Function<? super T, java.lang.Object> p1) { return null; }
  public static <T> java.lang.Object[] map2Array(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, java.lang.Object> p1) { return null; }
  public static <T, V> V[] map2Array(T[] p0, java.lang.Class<V> p1, com.intellij.util.Function<? super T, ? extends V> p2) { return null; }
  public static <T, V> V[] map2Array(java.util.Collection<? extends T> p0, java.lang.Class<V> p1, com.intellij.util.Function<? super T, ? extends V> p2) { return null; }
  public static <T, V> V[] map2Array(java.util.Collection<? extends T> p0, V[] p1, com.intellij.util.Function<? super T, ? extends V> p2) { return null; }
  public static <T, V> V[] map2Array(T[] p0, V[] p1, com.intellij.util.Function<? super T, ? extends V> p2) { return null; }
  public static <T> java.util.List<T> filter(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T> java.util.List<T> filterIsInstance(java.util.Collection<?> p0, java.lang.Class<? extends T> p1) { return null; }
  public static <T> java.util.List<T> filterIsInstance(java.lang.Object[] p0, java.lang.Class<? extends T> p1) { return null; }
  public static <T> java.util.List<T> filter(java.util.Collection<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <K, V> java.util.Map<K, V> filter(java.util.Map<? extends K, ? extends V> p0, com.intellij.openapi.util.Condition<? super K> p1) { return null; }
  public static <T> java.util.List<T> findAll(java.util.Collection<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T> java.util.List<T> skipNulls(java.util.Collection<? extends T> p0) { return null; }
  public static <T, V extends T> java.util.List<V> findAll(T[] p0, java.lang.Class<V> p1) { return null; }
  public static <T, V extends T> V[] findAllAsArray(T[] p0, java.lang.Class<V> p1) { return null; }
  public static <T, V extends T> V[] findAllAsArray(java.util.Collection<? extends T> p0, java.lang.Class<V> p1) { return null; }
  public static <T> T[] findAllAsArray(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T, V extends T> java.util.List<V> findAll(java.util.Collection<? extends T> p0, java.lang.Class<V> p1) { return null; }
  public static <T> java.util.List<T> findAll(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T> boolean all(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T> boolean all(java.util.Collection<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static void removeDuplicates(java.util.Collection<?> p0) {}
  public static <T> java.util.Iterator<T> iterate(T[] p0) { return null; }
  public static <T> java.util.Iterator<T> iterate(java.util.Enumeration<? extends T> p0) { return null; }
  public static <T> java.lang.Iterable<T> iterateBackward(java.util.List<? extends T> p0) { return null; }
  public static <T, E> java.lang.Iterable<com.intellij.openapi.util.Pair<T, E>> zip(java.lang.Iterable<? extends T> p0, java.lang.Iterable<? extends E> p1) { return null; }
  public static void swapElements(java.util.List<?> p0, int p1, int p2) {}
  public static <T> java.util.List<T> collect(java.util.Iterator<? extends T> p0) { return null; }
  public static <T> java.util.List<T> collect(java.util.Iterator<?> p0, com.intellij.util.containers.FilteringIterator.InstanceOf<T> p1) { return null; }
  public static <T> java.util.List<T> collect(java.util.Iterator<? extends T> p0, java.util.function.Predicate<? super T> p1) { return null; }
  public static <T> void addAll(java.util.Collection<? super T> p0, java.util.Enumeration<? extends T> p1) {}
  public static <T, C extends java.util.Collection<? super T>> C addAll(C p0, T... p1) { return null; }
  public static <T, C extends java.util.Collection<T>> C addAllNotNull(C p0, T... p1) { return null; }
  public static <T> boolean removeAll(java.util.Collection<T> p0, T... p1) { return false; }
  public static <T> boolean retainAll(java.util.Collection<T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T, U extends T> U findInstance(java.lang.Iterable<? extends T> p0, java.lang.Class<? extends U> p1) { return null; }
  public static <T, U extends T> U findInstance(java.util.Iterator<? extends T> p0, java.lang.Class<? extends U> p1) { return null; }
  public static <T, U extends T> U findInstance(T[] p0, java.lang.Class<? extends U> p1) { return null; }
  public static <T, V> java.util.List<T> concat(V[] p0, com.intellij.util.Function<? super V, ? extends java.util.Collection<? extends T>> p1) { return null; }
  public static <T> java.util.List<T> concat(java.lang.Iterable<? extends java.util.Collection<? extends T>> p0) { return null; }
  public static <T> java.util.List<T> append(java.util.List<? extends T> p0, T... p1) { return null; }
  public static <T> java.util.List<T> prepend(java.util.List<? extends T> p0, T... p1) { return null; }
  public static <T> java.util.List<T> concat(java.util.List<? extends T> p0, java.util.List<? extends T> p1) { return null; }
  public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> p0, java.lang.Iterable<? extends T> p1) { return null; }
  public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T>... p0) { return null; }
  public static <T> java.util.Iterator<T> concatIterators(java.util.Iterator<? extends T>... p0) { return null; }
  public static <T> java.util.Iterator<T> concatIterators(java.util.Collection<? extends java.util.Iterator<? extends T>> p0) { return null; }
  public static <T> java.lang.Iterable<T> concat(T[]... p0) { return null; }
  public static <T> java.util.List<T> concat(java.util.List<? extends T>... p0) { return null; }
  public static <T> java.util.List<T> concat(java.util.List<java.util.List<? extends T>> p0) { return null; }
  public static <T, V> java.util.List<V> concat(java.lang.Iterable<? extends T> p0, com.intellij.util.Function<? super T, ? extends java.util.Collection<? extends V>> p1) { return null; }
  public static <T> boolean intersects(java.util.Collection<? extends T> p0, java.util.Collection<? extends T> p1) { return false; }
  public static <T> java.util.Collection<T> intersection(java.util.Collection<? extends T> p0, java.util.Collection<? extends T> p1) { return null; }
  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> intersection(java.util.EnumSet<E> p0, java.util.EnumSet<E> p1) { return null; }
  public static <T> T getFirstItem(java.util.Collection<? extends T> p0) { return null; }
  public static <T> T getFirstItem(java.util.List<? extends T> p0) { return null; }
  public static <T> T getFirstItem(java.util.Collection<? extends T> p0, T p1) { return null; }
  public static <T> T getOnlyItem(java.util.Collection<? extends T> p0) { return null; }
  public static <T> T getOnlyItem(java.util.Collection<? extends T> p0, T p1) { return null; }
  public static <T> java.util.List<T> getFirstItems(java.util.List<T> p0, int p1) { return null; }
  public static <T> T iterateAndGetLastItem(java.lang.Iterable<? extends T> p0) { return null; }
  public static <T> T iterateAndGetLastItem(java.util.List<? extends T> p0) { return null; }
  public static <T, U> java.util.Iterator<U> mapIterator(java.util.Iterator<? extends T> p0, com.intellij.util.Function<? super T, ? extends U> p1) { return null; }
  public static <T> java.util.Iterator<T> filterIterator(java.util.Iterator<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return null; }
  public static <T> T getLastItem(java.util.List<? extends T> p0, T p1) { return null; }
  public static <T> T getLastItem(java.util.List<? extends T> p0) { return null; }
  public static <T> java.util.Collection<T> subtract(java.util.Collection<? extends T> p0, java.util.Collection<? extends T> p1) { return null; }
  public static <T> T[] toArray(java.util.Collection<T> p0, com.intellij.util.ArrayFactory<? extends T> p1) { return null; }
  public static <T> T[] toArray(java.util.Collection<? extends T> p0, java.util.Collection<? extends T> p1, com.intellij.util.ArrayFactory<? extends T> p2) { return null; }
  public static <T extends java.lang.Comparable<? super T>> void sort(java.util.List<T> p0) {}
  public static <T> void sort(java.util.List<T> p0, java.util.Comparator<? super T> p1) {}
  public static <T extends java.lang.Comparable<? super T>> void sort(T[] p0) {}
  public static <T> java.util.List<T> sorted(java.util.Collection<? extends T> p0, java.util.Comparator<? super T> p1) { return null; }
  public static <T> java.util.List<T> sorted(java.lang.Iterable<? extends T> p0, java.util.Comparator<? super T> p1) { return null; }
  public static <T extends java.lang.Comparable<? super T>> java.util.List<T> sorted(java.util.Collection<? extends T> p0) { return null; }
  public static <T> void sort(T[] p0, java.util.Comparator<? super T> p1) {}
  public static <T, V> java.util.List<V> map(java.lang.Iterable<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.List<V> map(java.util.Iterator<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.List<V> map(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.List<V> mapNotNull(T[] p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> V[] mapNotNull(T[] p0, com.intellij.util.Function<? super T, ? extends V> p1, V[] p2) { return null; }
  public static <T, V> java.util.List<V> mapNotNull(java.lang.Iterable<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.List<V> mapNotNull(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T> java.util.List<T> packNullables(T... p0) { return null; }
  public static <T, V> java.util.List<V> map(T[] p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> V[] map(T[] p0, com.intellij.util.Function<? super T, ? extends V> p1, V[] p2) { return null; }
  public static <T> java.util.Set<T> set() { return null; }
  public static <T> java.util.Set<T> set(T p0) { return null; }
  public static <T> java.util.Set<T> set(T... p0) { return null; }
  public static <K, V> void putIfNotNull(K p0, V p1, java.util.Map<? super K, ? super V> p2) {}
  public static <K, V> void putIfNotNull(K p0, java.util.Collection<? extends V> p1, com.intellij.util.containers.MultiMap<? super K, ? super V> p2) {}
  public static <K, V> void putIfNotNull(K p0, V p1, com.intellij.util.containers.MultiMap<? super K, ? super V> p2) {}
  public static <T> void add(T p0, java.util.Collection<? super T> p1, com.intellij.openapi.Disposable p2) {}
  public static <T> java.util.List<T> createMaybeSingletonList(T p0) { return null; }
  public static <T> java.util.Set<T> createMaybeSingletonSet(T p0) { return null; }
  public static <T, V> V getOrCreate(java.util.Map<T, V> p0, T p1, V p2) { return null; }
  public static <T, V> V getOrCreate(java.util.Map<T, V> p0, T p1, com.intellij.openapi.util.Factory<? extends V> p2) { return null; }
  public static <T> boolean and(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T> boolean and(java.lang.Iterable<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T> boolean exists(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T> boolean exists(java.lang.Iterable<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T> boolean or(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T> boolean or(java.lang.Iterable<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return false; }
  public static <T> int count(java.lang.Iterable<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return 0; }
  public static <T> java.util.List<T> list(T... p0) { return null; }
  public static <T> void quickSort(java.util.List<? extends T> p0, java.util.Comparator<? super T> p1) {}
  public static <E> java.util.List<E> flatten(java.util.Collection<E>[] p0) { return null; }
  public static <T> java.util.List<? extends T> removeDuplicatesFromSorted(java.util.List<? extends T> p0, java.util.Comparator<? super T> p1) { return null; }
  public static <T> java.util.List<T> flatten(java.lang.Iterable<? extends java.util.Collection<? extends T>> p0) { return null; }
  public static <T, V> java.util.List<V> flatMap(java.lang.Iterable<? extends T> p0, com.intellij.util.Function<? super T, ? extends java.util.List<? extends V>> p1) { return null; }
  public static <K, V> V[] convert(K[] p0, V[] p1, com.intellij.util.Function<? super K, ? extends V> p2) { return null; }
  public static <T> boolean containsIdentity(java.lang.Iterable<? extends T> p0, T p1) { return false; }
  public static <T> int indexOfIdentity(java.util.List<? extends T> p0, T p1) { return 0; }
  public static <T> boolean equalsIdentity(java.util.List<? extends T> p0, java.util.List<? extends T> p1) { return false; }
  public static <T> int indexOf(java.util.List<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return 0; }
  public static <T> int indexOf(T[] p0, com.intellij.openapi.util.Condition<? super T> p1) { return 0; }
  public static <T> int lastIndexOf(java.util.List<? extends T> p0, com.intellij.openapi.util.Condition<? super T> p1) { return 0; }
  public static <T, U extends T> U findLastInstance(java.util.List<? extends T> p0, java.lang.Class<? extends U> p1) { return null; }
  public static <A, B> java.util.Map<B, A> reverseMap(java.util.Map<? extends A, ? extends B> p0) { return null; }
  public static <T> java.util.List<T> trimToSize(java.util.List<T> p0) { return null; }
  public static <T> java.util.List<T> emptyList() { return null; }
  public static <T> java.util.concurrent.CopyOnWriteArrayList<T> createEmptyCOWList() { return null; }
  public static <T> java.util.List<T> createLockFreeCopyOnWriteList() { return null; }
  public static <T> java.util.List<T> createLockFreeCopyOnWriteList(java.util.Collection<? extends T> p0) { return null; }
  public static <V> com.intellij.util.containers.ConcurrentIntObjectMap<V> createConcurrentIntObjectMap() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentWeakValueMap() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentSoftKeySoftValueMap() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentWeakKeySoftValueMap() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentWeakKeyWeakValueMap() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentWeakKeyWeakValueMap(com.intellij.util.containers.HashingStrategy<? super K> p0) { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentSoftValueMap() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentSoftMap() { return null; }
  public static <K, V> java.util.concurrent.ConcurrentMap<K, V> createConcurrentWeakMap() { return null; }
  public static <T> com.intellij.util.containers.ConcurrentList<T> createConcurrentList() { return null; }
  public static <T> com.intellij.util.containers.ConcurrentList<T> createConcurrentList(java.util.Collection<? extends T> p0) { return null; }
  public static <T> void addIfNotNull(java.util.Collection<? super T> p0, T p1) {}
  public static <T, V> java.util.List<V> map2List(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.Set<V> map2Set(T[] p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.Set<V> map2Set(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.Set<V> map2LinkedSet(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T, V> java.util.Set<V> map2SetNotNull(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, ? extends V> p1) { return null; }
  public static <T> T[] toArray(java.util.List<T> p0, T[] p1) { return null; }
  public static <T> T[] toArray(java.util.Collection<? extends T> p0, T[] p1) { return null; }
  public static <T> T[] copyAndClear(java.util.Collection<T> p0, com.intellij.util.ArrayFactory<? extends T> p1, boolean p2) { return null; }
  public static <T> java.util.List<T> copyList(java.util.List<? extends T> p0) { return null; }
  public static <T> java.util.Collection<T> toCollection(java.lang.Iterable<? extends T> p0) { return null; }
  public static <T> java.util.Collection<T> toCollection(java.util.Collection<? extends T> p0) { return null; }
  public static <T> java.util.List<T> toList(java.util.Enumeration<? extends T> p0) { return null; }
  public static <T> boolean isEmpty(java.util.Collection<? extends T> p0) { return false; }
  public static boolean isEmpty(java.util.Map<?, ?> p0) { return false; }
  public static <T> java.util.List<T> notNullize(java.util.List<T> p0) { return null; }
  public static <T> java.util.Set<T> notNullize(java.util.Set<T> p0) { return null; }
  public static <K, V> java.util.Map<K, V> notNullize(java.util.Map<K, V> p0) { return null; }
  public static <T> boolean startsWith(java.util.List<? extends T> p0, java.util.List<? extends T> p1) { return false; }
  public static <C extends java.util.Collection<?>> C nullize(C p0) { return null; }
  public static <T extends java.lang.Comparable<? super T>> int compareLexicographically(java.util.List<? extends T> p0, java.util.List<? extends T> p1) { return 0; }
  public static <T> int compareLexicographically(java.util.List<? extends T> p0, java.util.List<? extends T> p1, java.util.Comparator<? super T> p2) { return 0; }
  public static <K, V> java.util.Map<K, V> createWeakKeySoftValueMap() { return null; }
  public static <K, V> java.util.Map<K, V> createWeakKeyWeakValueMap() { return null; }
  public static <K, V> java.util.Map<K, V> createSoftKeySoftValueMap() { return null; }
  public static <K, V> java.util.Map<K, V> createSoftValueMap() { return null; }
  public static <K, V> java.util.Map<K, V> createWeakValueMap() { return null; }
  public static <K, V> java.util.Map<K, V> createSoftMap() { return null; }
  public static <K, V> java.util.Map<K, V> createWeakMap() { return null; }
  public static <T> java.util.Set<T> createWeakSet() { return null; }
  public static <T> com.intellij.util.containers.IntObjectMap<T> createIntKeyWeakValueMap() { return null; }
  public static <T> com.intellij.util.containers.ObjectIntMap<T> createWeakKeyIntValueMap() { return null; }
  public static <T> T reduce(java.util.List<? extends T> p0, T p1, java.util.function.BinaryOperator<T> p2) { return null; }
  public static <T> java.util.stream.Stream<java.util.List<? extends T>> splitListToChunks(java.util.List<? extends T> p0, int p1) { return null; }
}
