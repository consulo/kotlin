package com.intellij.util.containers.hash;

/** Consulo: consulo.util.collection.HashingStrategy (getHashCode -> hashCode, isEqual -> equals). */
@SuppressWarnings("all")
public interface EqualityPolicy<T> {
    int getHashCode(T value);

    boolean isEqual(T val1, T val2);
}
