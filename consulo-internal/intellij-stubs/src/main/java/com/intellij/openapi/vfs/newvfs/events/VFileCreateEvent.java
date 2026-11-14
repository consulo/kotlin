package com.intellij.openapi.vfs.newvfs.events;

@SuppressWarnings("all")
public class VFileCreateEvent extends com.intellij.openapi.vfs.newvfs.events.VFileEvent {
    public boolean isDirectory() { return false; }
    public String getChildName() { return null; }
    public com.intellij.openapi.vfs.VirtualFile getParent() { return null; }
}
