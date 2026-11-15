package com.intellij.openapi.progress;

@SuppressWarnings("all")
public abstract class ProgressManager {
    public void executeNonCancelableSection(Runnable runnable) {}
    public static ProgressManager getInstance() { return null; }
    public void doCheckCanceled() { }
    public static void checkCanceled() {}
    public com.intellij.openapi.progress.ProgressIndicator getProgressIndicator() { return null; }
    public <T> T runProcess(java.util.concurrent.Callable<T> task, com.intellij.openapi.progress.ProgressIndicator indicator) { return null; }
    // Added by consulo-internal/remap/genstub.py from consulo.application.progress.ProgressManager
    public boolean hasProgressIndicator() { return false; }
    public boolean hasModalProgressIndicator() { return false; }
    public boolean hasUnsafeProgressIndicator() { return false; }
    public void runProcess(java.lang.Runnable p0, com.intellij.openapi.progress.ProgressIndicator p1) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public <T extends java.lang.Object> T runProcess(java.util.function.Supplier<T> p0, com.intellij.openapi.progress.ProgressIndicator p1) throws com.intellij.openapi.progress.ProcessCanceledException { return null; }
    public static void progress(consulo.localize.LocalizeValue p0) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public static void progress2(consulo.localize.LocalizeValue p0) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public static void progress(consulo.localize.LocalizeValue p0, consulo.localize.LocalizeValue p1) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public static void progress(java.lang.String p0) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public static void progress2(java.lang.String p0) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public static void progress(java.lang.String p0, java.lang.String p1) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public boolean runProcessWithProgressSynchronously(java.lang.Runnable p0, consulo.localize.LocalizeValue p1, boolean p2, com.intellij.openapi.components.ComponentManager p3) { return false; }
    public <T extends java.lang.Object, E extends java.lang.Exception> T runProcessWithProgressSynchronously(com.intellij.openapi.util.text.function.ThrowableSupplier<T, E> p0, consulo.localize.LocalizeValue p1, boolean p2, com.intellij.openapi.components.ComponentManager p3) throws E { return null; }
    public boolean runProcessWithProgressSynchronously(java.lang.Runnable p0, consulo.localize.LocalizeValue p1, boolean p2, com.intellij.openapi.components.ComponentManager p3, javax.swing.JComponent p4) { return false; }
    public boolean runProcessWithProgressSynchronously(java.lang.Runnable p0, java.lang.String p1, boolean p2, com.intellij.openapi.components.ComponentManager p3) { return false; }
    public <T extends java.lang.Object, E extends java.lang.Exception> T runProcessWithProgressSynchronously(com.intellij.openapi.util.text.function.ThrowableSupplier<T, E> p0, java.lang.String p1, boolean p2, com.intellij.openapi.components.ComponentManager p3) throws E { return null; }
    public boolean runProcessWithProgressSynchronously(java.lang.Runnable p0, java.lang.String p1, boolean p2, com.intellij.openapi.components.ComponentManager p3, javax.swing.JComponent p4) { return false; }
    public void runProcessWithProgressAsynchronously(com.intellij.openapi.components.ComponentManager p0, java.lang.String p1, java.lang.Runnable p2, java.lang.Runnable p3, java.lang.Runnable p4) { }
    public void runProcessWithProgressAsynchronously(com.intellij.openapi.components.ComponentManager p0, java.lang.String p1, java.lang.Runnable p2, java.lang.Runnable p3, java.lang.Runnable p4, com.intellij.openapi.progress.PerformInBackgroundOption p5) { }
    public void run(com.intellij.openapi.progress.Task p0) { }
    public void runProcessWithProgressAsynchronously(com.intellij.openapi.progress.Task.Backgroundable p0, com.intellij.openapi.progress.ProgressIndicator p1) { }
    protected void indicatorCanceled(com.intellij.openapi.progress.ProgressIndicator p0) { }
    public static void canceled(com.intellij.openapi.progress.ProgressIndicator p0) { }
    public void executeProcessUnderProgress(java.lang.Runnable p0, com.intellij.openapi.progress.ProgressIndicator p1) throws com.intellij.openapi.progress.ProcessCanceledException { }
    public static void assertNotCircular(com.intellij.openapi.progress.ProgressIndicator p0) { }
    public boolean runInReadActionWithWriteActionPriority(java.lang.Runnable p0, com.intellij.openapi.progress.ProgressIndicator p1) { return false; }
    public boolean isInNonCancelableSection() { return false; }
    public <T extends java.lang.Object, E extends java.lang.Throwable> T computePrioritized(com.intellij.openapi.util.text.function.ThrowableSupplier<T, E> p0) throws E { return null; }
    public com.intellij.openapi.progress.WrappedProgressIndicator wrapProgressIndicator(com.intellij.openapi.progress.ProgressIndicator p0) { return null; }
    public com.intellij.openapi.progress.ProgressIndicator unwrapProgressIndicator(com.intellij.openapi.progress.WrappedProgressIndicator p0) { return null; }
}
