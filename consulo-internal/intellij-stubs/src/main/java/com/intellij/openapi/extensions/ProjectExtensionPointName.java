package com.intellij.openapi.extensions;

@SuppressWarnings("all")
public final class ProjectExtensionPointName<T> {
    public ProjectExtensionPointName(String name) {}
    public java.util.List<T> getExtensions(com.intellij.openapi.project.Project project) { return java.util.Collections.<T>emptyList(); }
    public java.util.List<T> getExtensionList(com.intellij.openapi.project.Project project) { return java.util.Collections.<T>emptyList(); }
    public ExtensionPoint<T> getPoint(AreaInstance areaInstance) { return null; }
    public String getName() { return null; }
}
