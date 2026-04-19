package com.intellij.openapi.components;

@SuppressWarnings("all")
public interface ComponentManager extends com.intellij.openapi.util.UserDataHolder,com.intellij.openapi.Disposable,com.intellij.openapi.extensions.AreaInstance {
  public default com.intellij.openapi.components.BaseComponent getComponent(java.lang.String p0) { return null; }
  public abstract <T> T getComponent(java.lang.Class<T> p0);
  public abstract boolean hasComponent(java.lang.Class<?> p0);
  public abstract boolean isInjectionForExtensionSupported();
  public abstract com.intellij.util.messages.MessageBus getMessageBus();
  public abstract boolean isDisposed();
  public abstract com.intellij.openapi.util.Condition<?> getDisposed();
  public abstract <T> T getService(java.lang.Class<T> p0);
  public default <T> T getServiceIfCreated(java.lang.Class<T> p0) { return null; }
  public abstract com.intellij.openapi.extensions.ExtensionsArea getExtensionArea();
  public abstract <T> T instantiateClass(java.lang.Class<T> p0, com.intellij.openapi.extensions.PluginId p1);
  public abstract <T> T instantiateClassWithConstructorInjection(java.lang.Class<T> p0, java.lang.Object p1, com.intellij.openapi.extensions.PluginId p2);
  public default void logError(java.lang.Throwable p0, com.intellij.openapi.extensions.PluginId p1) {}
  public abstract java.lang.RuntimeException createError(java.lang.Throwable p0, com.intellij.openapi.extensions.PluginId p1);
  public abstract java.lang.RuntimeException createError(java.lang.String p0, com.intellij.openapi.extensions.PluginId p1);
  public abstract java.lang.RuntimeException createError(java.lang.String p0, java.lang.Throwable p1, com.intellij.openapi.extensions.PluginId p2, java.util.Map<java.lang.String, java.lang.String> p3);
  public abstract <T> java.lang.Class<T> loadClass(java.lang.String p0, com.intellij.openapi.extensions.PluginDescriptor p1) throws java.lang.ClassNotFoundException;
  public abstract <T> T instantiateClass(java.lang.String p0, com.intellij.openapi.extensions.PluginDescriptor p1);
}
