package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface UserDataHolder {
  public abstract <T> T getUserData(com.intellij.openapi.util.Key<T> p0);
  public abstract <T> void putUserData(com.intellij.openapi.util.Key<T> p0, T p1);
}
