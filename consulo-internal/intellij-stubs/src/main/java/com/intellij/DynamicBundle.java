package com.intellij;

// consulo.kotlin.compat.util.DynamicBundle
@SuppressWarnings("all")
public class DynamicBundle {
    public DynamicBundle(Class<?> bundleClass, String pathToBundle) {}
    public java.util.ResourceBundle getResourceBundle() { return null; }
    public boolean containsKey(String key) { return false; }
    public String getMessage(String key, Object... params) { return null; }
    public java.util.function.Supplier<String> getLazyMessage(String key, Object... params) { return null; }
    public String messageOrNull(String key, Object... params) { return null; }
    public String messageOrDefault(String key, String defaultValue, Object... params) { return null; }
}
