package com.intellij.psi.util;

@SuppressWarnings("all")
public interface CachedValueProvider<T> {
    Result<T> compute();
    class Result<T> {
        public Result() {}
        public Result(T value, Object... dependencies) {}
        public static <T> Result<T> create(T value, Object... dependencies) { return new Result<T>(); }
        public static <T> Result<T> createSingleDependency(T value, Object dependency) { return new Result<T>(); }
        public T getValue() { return null; }
        public Object[] getDependencyItems() { return new Object[0]; }
    }
}
