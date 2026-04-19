package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface UserDataHolderEx extends UserDataHolder {
    <T> T putUserDataIfAbsent(Key<T> key, T value);
    <T> boolean replace(Key<T> key, T oldValue, T newValue);
}
