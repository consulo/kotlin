package com.intellij.util;

@SuppressWarnings("all")
public class CommonProcessors {
    public static class CollectProcessor<T> implements com.intellij.util.Processor<T> {
        private final java.util.Collection<T> result;
        public CollectProcessor() { this.result = new java.util.ArrayList<T>(); }
        public CollectProcessor(java.util.Collection<T> result) { this.result = result; }
        public boolean process(T t) { result.add(t); return true; }
        public java.util.Collection<T> getResults() { return result; }
        public T[] toArray(T[] array) { return result.toArray(array); }
    }
    public static abstract class FindProcessor<T> implements com.intellij.util.Processor<T> {
        private T value;
        protected abstract boolean accept(T t);
        public boolean process(T t) { if (accept(t)) { value = t; return false; } return true; }
        public T getFoundValue() { return value; }
        public boolean isFound() { return value != null; }
        public void reset() { value = null; }
    }
    public static class FindFirstProcessor<T> extends FindProcessor<T> {
        protected boolean accept(T t) { return true; }
    }
}
