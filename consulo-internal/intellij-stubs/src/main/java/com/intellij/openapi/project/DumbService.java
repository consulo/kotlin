package com.intellij.openapi.project;

@SuppressWarnings("all")
public abstract class DumbService {
    public void runReadActionInSmartMode(java.lang.Runnable runnable) { }
    public static DumbService getInstance(com.intellij.openapi.project.Project p) { return null; }
    public abstract boolean isDumb();
    public abstract void runWhenSmart(Runnable runnable);
    public abstract <T> T runReadActionInSmartMode(java.util.function.Supplier<T> runnable);
    public abstract boolean isAlternativeResolveEnabled();
    public abstract void setAlternativeResolveEnabled(boolean enabled);
    public abstract <T> java.util.List<T> filterByDumbAwareness(java.util.Collection<T> collection);
    public abstract <T> java.util.List<T> filterByDumbAwareness(java.util.List<T> collection);
}
