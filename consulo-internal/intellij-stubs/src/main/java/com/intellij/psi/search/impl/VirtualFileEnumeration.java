package com.intellij.psi.search.impl;

@SuppressWarnings("all")
public interface VirtualFileEnumeration {
    boolean contains(int fileId);

    int[] asArray();
}
