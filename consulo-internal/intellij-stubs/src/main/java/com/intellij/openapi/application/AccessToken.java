package com.intellij.openapi.application;
@SuppressWarnings("all")
public abstract class AccessToken implements AutoCloseable {
    public void close() {}
    public void finish() {}
}
