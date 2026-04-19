package com.intellij.openapi.extensions;

@SuppressWarnings("all")
public interface PluginDescriptor {
    PluginId getPluginId();
    String getName();
}
