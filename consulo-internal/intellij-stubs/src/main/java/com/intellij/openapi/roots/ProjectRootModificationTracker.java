package com.intellij.openapi.roots;

@SuppressWarnings("all")
public abstract class ProjectRootModificationTracker implements com.intellij.openapi.util.ModificationTracker {
    public static ProjectRootModificationTracker getInstance(com.intellij.openapi.project.Project project) { return null; }
}
