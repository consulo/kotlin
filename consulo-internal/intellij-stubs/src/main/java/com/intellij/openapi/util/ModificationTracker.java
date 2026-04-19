package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface ModificationTracker {
  public abstract long getModificationCount();
}
