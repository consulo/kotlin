package com.intellij.openapi.vfs.newvfs;

@SuppressWarnings("all")
public interface BulkFileListener {
    default void before(java.util.List<? extends com.intellij.openapi.vfs.newvfs.events.VFileEvent> events) {}
    default void after(java.util.List<? extends com.intellij.openapi.vfs.newvfs.events.VFileEvent> events) {}
}
