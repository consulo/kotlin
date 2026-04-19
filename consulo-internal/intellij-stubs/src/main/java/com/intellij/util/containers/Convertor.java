package com.intellij.util.containers;

@SuppressWarnings("all")
public interface Convertor<Src, Dst> {
    Dst convert(Src o);
}
