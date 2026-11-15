package com.intellij.openapi.application;
@SuppressWarnings("all")
public interface ApplicationListener extends java.util.EventListener {
    default void writeActionFinished(Object action) {}
    default void afterWriteActionFinished(Object action) {}
}
