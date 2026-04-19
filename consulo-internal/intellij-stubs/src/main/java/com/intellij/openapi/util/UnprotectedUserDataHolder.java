package com.intellij.openapi.util;

@SuppressWarnings("all")
public class UnprotectedUserDataHolder implements UserDataHolder {
    public <T> T getUserData(Key<T> key) { return null; }
    public <T> void putUserData(Key<T> key, T value) {}
    public <T> T getUserDataUnprotected(Key<T> key) { return null; }
    public <T> void putUserDataUnprotected(Key<T> key, T value) {}
}
