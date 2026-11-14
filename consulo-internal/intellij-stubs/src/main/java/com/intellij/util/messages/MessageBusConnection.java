package com.intellij.util.messages;

@SuppressWarnings("all")
public interface MessageBusConnection extends com.intellij.openapi.Disposable {
    <L> void subscribe(Topic<L> topic, L handler);
    <L> void subscribe(Topic<L> topic);
    void setDefaultHandler(MessageHandler handler);
    void deliverImmediately();
    void disconnect();
    interface MessageHandler {
        void handle(Topic<?> topic, Object... params);
    }
}
