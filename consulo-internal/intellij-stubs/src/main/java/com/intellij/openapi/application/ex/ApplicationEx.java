package com.intellij.openapi.application.ex;

@SuppressWarnings("all")
public final class ApplicationEx {
    public boolean runWriteActionWithNonCancellableProgressInDispatchThread(java.lang.String title, com.intellij.openapi.project.Project project, javax.swing.JComponent parentComponent, java.util.function.Consumer<? super com.intellij.openapi.progress.ProgressIndicator> action) { return false; }
    public void addWriteActionListener(com.intellij.openapi.application.WriteActionListener listener, com.intellij.openapi.Disposable parentDisposable) {}
}
