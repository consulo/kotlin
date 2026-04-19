package com.intellij.openapi.progress;

@SuppressWarnings("all")
public abstract class ProgressIndicatorProvider {
  public ProgressIndicatorProvider() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.openapi.progress.ProgressIndicatorProvider getInstance() { return null; }
  public abstract com.intellij.openapi.progress.ProgressIndicator getProgressIndicator();
  protected abstract void doCheckCanceled() throws com.intellij.openapi.progress.ProcessCanceledException;
  public static com.intellij.openapi.progress.ProgressIndicator getGlobalProgressIndicator() { return null; }
  public static void checkCanceled() throws com.intellij.openapi.progress.ProcessCanceledException {}
}
