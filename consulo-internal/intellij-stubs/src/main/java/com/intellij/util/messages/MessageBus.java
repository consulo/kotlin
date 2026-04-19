package com.intellij.util.messages;

@SuppressWarnings("all")
public interface MessageBus extends com.intellij.openapi.Disposable {
    <L> L syncPublisher(Topic<L> topic);
}
