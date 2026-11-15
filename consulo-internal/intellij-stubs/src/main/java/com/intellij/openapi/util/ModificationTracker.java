package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface ModificationTracker {
  ModificationTracker NEVER_CHANGED = () -> 0;
  public abstract long getModificationCount();
}
