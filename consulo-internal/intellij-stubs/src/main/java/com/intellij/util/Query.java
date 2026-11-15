package com.intellij.util;

@SuppressWarnings("all")
public interface Query<R> extends Iterable<R> {
    java.util.Collection<R> findAll();
    R findFirst();
    // Consulo: a Predicate (Processor is one)
    boolean forEach(java.util.function.Predicate<? super R> consumer);
    java.util.Iterator<R> iterator();
}
