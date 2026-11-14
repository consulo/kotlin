package com.intellij.util.messages;

@SuppressWarnings("all")
public interface MessageBus {
    MessageBusConnection connect();
    MessageBusConnection connect(com.intellij.openapi.Disposable parent);
    MessageBusConnection connect(Object parent);
    <L> L syncPublisher(Topic<L> topic);
    <L> L asyncPublisher(Topic<L> topic);
    void disconnect();
    boolean isDisposed();
}
