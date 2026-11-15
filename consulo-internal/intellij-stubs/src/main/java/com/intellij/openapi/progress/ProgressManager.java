package com.intellij.openapi.progress;

@SuppressWarnings("all")
public abstract class ProgressManager {
    public void executeNonCancelableSection(Runnable runnable) {}
    public static ProgressManager getInstance() { return null; }
    public abstract void doCheckCanceled();
    public static void checkCanceled() {}
    public abstract com.intellij.openapi.progress.ProgressIndicator getProgressIndicator();
    public abstract <T> T runProcess(java.util.concurrent.Callable<T> task, com.intellij.openapi.progress.ProgressIndicator indicator);
}
