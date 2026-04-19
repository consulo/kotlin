package com.intellij.openapi.util;

@SuppressWarnings("all")
public class UserDataHolderBase implements UserDataHolder {
    public <T> T getUserData(Key<T> key) { return null; }
    public <T> void putUserData(Key<T> key, T value) {}
    public <T> T getCopyableUserData(Key<T> key) { return null; }
    public <T> void putCopyableUserData(Key<T> key, T value) {}
    public <T> boolean replace(Key<T> key, T oldValue, T newValue) { return false; }
    public <T> T putUserDataIfAbsent(Key<T> key, T value) { return null; }
    public void copyCopyableDataTo(UserDataHolderBase clone) {}
    public void copyUserDataTo(UserDataHolderBase other) {}
    public boolean isUserDataEmpty() { return false; }
}
