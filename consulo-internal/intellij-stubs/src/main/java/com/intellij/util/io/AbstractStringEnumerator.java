package com.intellij.util.io;

@SuppressWarnings("all")
public interface AbstractStringEnumerator {
    int enumerate(String value) throws java.io.IOException;
    String valueOf(int idx) throws java.io.IOException;
}
