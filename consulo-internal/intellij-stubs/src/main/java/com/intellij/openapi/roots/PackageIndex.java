package com.intellij.openapi.roots;

@SuppressWarnings("all")
public abstract class PackageIndex {
    public static PackageIndex getInstance(com.intellij.openapi.project.Project p) { return null; }
    public abstract com.intellij.openapi.vfs.VirtualFile[] getDirectoriesByPackageName(String packageName, boolean includeLibrarySources);
    public abstract com.intellij.util.Query<com.intellij.openapi.vfs.VirtualFile> getDirsByPackageName(String packageName, boolean includeLibrarySources);
}
