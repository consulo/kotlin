package com.intellij.openapi.util.registry;

@SuppressWarnings("all")
public final class Registry {
  public static class Companion {}
  public static final com.intellij.openapi.util.registry.Registry.Companion Companion = null;
  public static final java.lang.String REGISTRY_BUNDLE = null;
  public Registry() { throw new UnsupportedOperationException("stub"); }
  public final boolean isLoaded() { return false; }
  public final com.intellij.openapi.util.registry.RegistryValueListener getValueChangeListener() { return null; }
  public final void reset() {}
  public final java.lang.String getBundleValueOrNull(java.lang.String p0) { return null; }
  public final java.lang.String getBundleValue$intellij_platform_util(java.lang.String p0, com.intellij.openapi.util.registry.RegistryKeyDescriptor p1) throws java.util.MissingResourceException { return null; }
  public final Object getState() { return null; }
  public final java.util.Map<java.lang.String, com.intellij.openapi.util.registry.ValueWithSource> getStoredProperties() { return null; }
  public final java.util.Map<java.lang.String, java.lang.String> getUserProperties() { return null; }
  public final void restoreDefaults() {}
  public final boolean isInDefaultState() { return false; }
  public final boolean isRestartNeeded() { return false; }
  public static final com.intellij.openapi.util.registry.RegistryValue get(java.lang.String p0) { return null; }
  public static final com.intellij.openapi.util.registry.RegistryValue _getWithoutStateCheck(java.lang.String p0) { return null; }
  public static final boolean is(java.lang.String p0) throws java.util.MissingResourceException { return false; }
  public static final boolean is(java.lang.String p0, boolean p1) { return false; }
  public static final int intValue(java.lang.String p0) throws java.util.MissingResourceException { return 0; }
  public static final int intValue(java.lang.String p0, int p1) { return 0; }
  public static final double doubleValue(java.lang.String p0, double p1) { return 0.0; }
  public static final double doubleValue(java.lang.String p0) throws java.util.MissingResourceException { return 0.0; }
  public static final java.lang.String stringValue(java.lang.String p0) throws java.util.MissingResourceException { return null; }
  public static final java.awt.Color getColor(java.lang.String p0, java.awt.Color p1) throws java.util.MissingResourceException { return null; }
  public static final com.intellij.openapi.util.registry.Registry getInstance() { return null; }
  public static final int intValue(java.lang.String p0, int p1, int p2, int p3) { return 0; }
  public static final void markAsLoaded() {}
  public static final java.util.List<com.intellij.openapi.util.registry.RegistryValue> getAll() { return null; }
  public static final com.intellij.openapi.util.registry.RegistryValue access$resolveValue(com.intellij.openapi.util.registry.Registry p0, java.lang.String p1) { return null; }
  public static final com.intellij.openapi.util.registry.Registry access$getRegistry$cp() { return null; }
  public static final java.lang.ref.Reference access$getBundledRegistry$cp() { return null; }
  public static final void access$setBundledRegistry$cp(java.lang.ref.Reference p0) {}
  public static final java.util.LinkedHashMap access$getUserProperties$p(com.intellij.openapi.util.registry.Registry p0) { return null; }
  public static final void access$setLoaded$p(com.intellij.openapi.util.registry.Registry p0, boolean p1) {}
  public static final java.util.concurrent.CompletableFuture access$getLoadFuture$p(com.intellij.openapi.util.registry.Registry p0) { return null; }
  public static final java.util.Map access$getContributedKeys$p(com.intellij.openapi.util.registry.Registry p0) { return null; }
  public static final void access$setContributedKeys$p(com.intellij.openapi.util.registry.Registry p0, java.util.Map p1) {}
  public static final void access$setValueChangeListener$p(com.intellij.openapi.util.registry.Registry p0, com.intellij.openapi.util.registry.RegistryValueListener p1) {}
  public static final com.intellij.openapi.util.registry.RegistryValueListener access$getEMPTY_VALUE_LISTENER$cp() { return null; }
}
