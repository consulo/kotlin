package com.intellij.openapi.application;

@SuppressWarnings("all")
public interface WriteActionListener {
    default void beforeWriteActionStart(Class<?> action) {}
    default void writeActionStarted(Class<?> action) {}
    default void writeActionFinished(Class<?> action) {}
    default void afterWriteActionFinished(Class<?> action) {}
}
