package com.intellij.openapi.progress;
@SuppressWarnings("all")
public interface ProgressIndicator {
    void start();
    void stop();
    boolean isCanceled();
    void setText(String text);
    void setText2(String text);
    void setFraction(double fraction);
    void checkCanceled();
}
