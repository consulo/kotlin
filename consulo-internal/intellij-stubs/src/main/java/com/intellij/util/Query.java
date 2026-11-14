package com.intellij.util;

@SuppressWarnings("all")
public interface Query<R> extends Iterable<R> {
    java.util.Collection<R> findAll();
    R findFirst();
    boolean forEach(com.intellij.util.Processor<? super R> consumer);
    java.util.Iterator<R> iterator();
}
