package com.intellij.util.containers;

@SuppressWarnings("all")
public class FilteringIterator<T> implements java.util.Iterator<T> {
    public static class InstanceOf<T> implements com.intellij.openapi.util.Condition<Object> {
        public InstanceOf(Class<T> aClass) {}
        public boolean value(Object o) { return false; }
    }
    public FilteringIterator(java.util.Iterator<?> iterator, com.intellij.openapi.util.Condition<? super T> condition) {}
    public boolean hasNext() { return false; }
    public T next() { return null; }
}
