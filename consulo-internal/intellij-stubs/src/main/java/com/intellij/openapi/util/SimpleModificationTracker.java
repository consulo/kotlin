package com.intellij.openapi.util;

@SuppressWarnings("all")
public class SimpleModificationTracker implements com.intellij.openapi.util.ModificationTracker {
    private long counter;
    public long getModificationCount() { return counter; }
    public void incModificationCount() { counter++; }
}
