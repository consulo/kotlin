package com.intellij.openapi.application;
@SuppressWarnings("all")
public interface ApplicationListener extends java.util.EventListener {
    default void writeActionFinished(Object action) {}
    default void afterWriteActionFinished(Object action) {}
    // Added by consulo-internal/remap/genstub.py from consulo.application.event.ApplicationListener
    public default void applicationExiting() { }
    public default void beforeWriteActionStart(java.lang.Object p0) { }
    public default void writeActionStarted(java.lang.Object p0) { }
}
