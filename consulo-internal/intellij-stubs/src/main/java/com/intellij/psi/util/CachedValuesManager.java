package com.intellij.psi.util;

@SuppressWarnings("all")
public class CachedValuesManager {
    public static CachedValuesManager getManager(com.intellij.openapi.project.Project p0) { return null; }
    public static <T, D extends com.intellij.psi.PsiElement> T getCachedValue(D element, com.intellij.openapi.util.Key<com.intellij.psi.util.CachedValue<T>> key, com.intellij.psi.util.CachedValueProvider<T> provider) { return null; }
    public static <T, D extends com.intellij.psi.PsiElement> T getCachedValue(D element, com.intellij.psi.util.CachedValueProvider<T> provider) { return null; }
    public <T> com.intellij.psi.util.CachedValue<T> createCachedValue(com.intellij.psi.util.CachedValueProvider<T> provider, boolean trackValue) { return null; }
    public <T> com.intellij.psi.util.CachedValue<T> createCachedValue(com.intellij.psi.util.CachedValueProvider<T> provider) { return null; }
    // Added by consulo-internal/remap/genstub.py from consulo.application.util.CachedValuesManager
    public CachedValuesManager() { }
    public static com.intellij.psi.util.CachedValuesManager getManager(com.intellij.openapi.components.ComponentManager p0) { return null; }
    public <T extends java.lang.Object, P extends java.lang.Object> com.intellij.openapi.application.util.ParameterizedCachedValue<T, P> createParameterizedCachedValue(com.intellij.openapi.application.util.ParameterizedCachedValueProvider<T, P> p0, boolean p1) { return null; }
    public <T extends java.lang.Object, P extends java.lang.Object> T getParameterizedCachedValue(com.intellij.openapi.util.UserDataHolder p0, com.intellij.openapi.util.Key<com.intellij.openapi.application.util.ParameterizedCachedValue<T, P>> p1, com.intellij.openapi.application.util.ParameterizedCachedValueProvider<T, P> p2, boolean p3, P p4) { return null; }
    protected void trackKeyHolder(com.intellij.openapi.util.UserDataHolder p0, com.intellij.openapi.util.Key<?> p1) { }
    public <T extends java.lang.Object> T getCachedValue(com.intellij.openapi.util.UserDataHolder p0, com.intellij.openapi.util.Key<com.intellij.psi.util.CachedValue<T>> p1, com.intellij.psi.util.CachedValueProvider<T> p2, boolean p3) { return null; }
    public <T extends java.lang.Object> T getCachedValue(com.intellij.openapi.util.UserDataHolder p0, com.intellij.psi.util.CachedValueProvider<T> p1) { return null; }
    public <T extends java.lang.Object> com.intellij.openapi.util.Key<com.intellij.psi.util.CachedValue<T>> getKeyForClass(java.lang.Class<?> p0) { return null; }
}
