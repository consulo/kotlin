package com.intellij.util;

@SuppressWarnings("all")
public interface Query<Result> extends Iterable<Result> {
    java.util.Collection<Result> findAll();
    Result findFirst();
    // Consulo: a Predicate (Processor is one)
    boolean forEach(java.util.function.Predicate<? super Result> consumer);
    default java.util.Iterator<Result> iterator() { return null; }
    // Added by consulo-internal/remap/genstub.py from consulo.application.util.query.Query
    public default com.intellij.util.concurrent.AsyncFuture<java.lang.Boolean> forEachAsync(java.util.function.Predicate<? super Result> p0) { return null; }
    public default Result[] toArray(Result[] p0) { return null; }
    public default boolean allMatch(java.util.function.Predicate<? super Result> p0) { return false; }
    public default boolean anyMatch(java.util.function.Predicate<? super Result> p0) { return false; }
    public default <R extends java.lang.Object> com.intellij.util.Query<R> transforming(java.util.function.Function<? super Result, ? extends java.util.Collection<? extends R>> p0) { return null; }
    public default <R extends java.lang.Object> com.intellij.util.Query<R> mapping(java.util.function.Function<? super Result, ? extends R> p0) { return null; }
    public default com.intellij.util.Query<Result> filtering(java.util.function.Predicate<? super Result> p0) { return null; }
    public default <R extends java.lang.Object> com.intellij.util.Query<R> flatMapping(java.util.function.Function<? super Result, ? extends com.intellij.util.Query<? extends R>> p0) { return null; }
    public default com.intellij.util.Query<Result> allowParallelProcessing() { return null; }
}
