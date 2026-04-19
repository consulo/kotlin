package com.intellij.util.containers;

@SuppressWarnings("all")
public interface ConcurrentList<E> extends java.util.List<E> {
    boolean addIfAbsent(E e);
}
