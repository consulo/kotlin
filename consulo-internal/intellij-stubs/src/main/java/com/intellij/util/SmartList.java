package com.intellij.util;

@SuppressWarnings("all")
public class SmartList<E> extends java.util.ArrayList<E> {
    public SmartList() {}
    public SmartList(E element) { add(element); }
    public SmartList(java.util.Collection<? extends E> c) { super(c); }
    public SmartList(E... elements) { for (E e : elements) add(e); }
}
