package com.intellij.openapi.progress;
@SuppressWarnings("all")
public interface ProgressIndicator {
    void start();
    void stop();
    boolean isCanceled();
    default void setText(String text) { }
    default void setText2(String text) { }
    void setFraction(double fraction);
    void checkCanceled();
    // Added by consulo-internal/remap/genstub.py from consulo.application.progress.ProgressIndicator
    public static final com.intellij.openapi.util.Key<com.intellij.openapi.progress.ProgressIndicator> KEY = null;
    public static com.intellij.openapi.progress.ProgressIndicator from(com.intellij.util.concurrent.coroutine.Continuation<?> p0) { return null; }
    public boolean isRunning();
    public void cancel();
    public void setText(consulo.localize.LocalizeValue p0);
    // IntelliJ texts are strings; remap.xml redirects the getters to consulo.kotlin.compat.util.UtilCompat
    public java.lang.String getText();
    public void setText2(consulo.localize.LocalizeValue p0);
    public java.lang.String getText2();
    public double getFraction();
    public void pushState();
    public void popState();
    public default void startNonCancelableSection() { }
    public default void finishNonCancelableSection() { }
    public boolean isModal();
    public com.intellij.openapi.application.ModalityState getModalityState();
    public void setModalityProgress(com.intellij.openapi.progress.ProgressIndicator p0);
    public boolean isIndeterminate();
    public void setIndeterminate(boolean p0);
    public boolean isPopupWasShown();
    public boolean isShowing();
    public default void addListener(com.intellij.openapi.progress.ProgressIndicatorListener p0) { }
}
