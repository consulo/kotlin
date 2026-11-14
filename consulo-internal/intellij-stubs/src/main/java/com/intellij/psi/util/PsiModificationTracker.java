package com.intellij.psi.util;

@SuppressWarnings("all")
public interface PsiModificationTracker extends com.intellij.openapi.util.ModificationTracker {
    Object MODIFICATION_COUNT = null;
    Object JAVA_STRUCTURE_MODIFICATION_COUNT = null;
    com.intellij.util.messages.Topic<Listener> TOPIC = com.intellij.util.messages.Topic.create("MODIFICATION_COUNT_CHANGED", Listener.class);
    long getModificationCount();
    long getJavaStructureModificationCount();
    long getOutOfCodeBlockModificationCount();
    static PsiModificationTracker getInstance(com.intellij.openapi.project.Project project) { return null; }
    interface Listener { void modificationCountChanged(); }
}
