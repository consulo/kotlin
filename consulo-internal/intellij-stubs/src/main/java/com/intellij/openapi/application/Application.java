package com.intellij.openapi.application;

@SuppressWarnings("all")
public interface Application extends com.intellij.openapi.components.ComponentManager {
  public default void invokeLaterOnWriteThread(java.lang.Runnable p0) {}
  public default void invokeLaterOnWriteThread(java.lang.Runnable p0, com.intellij.openapi.application.ModalityState p1) {}
  public default void invokeLaterOnWriteThread(java.lang.Runnable p0, com.intellij.openapi.application.ModalityState p1, com.intellij.openapi.util.Condition<?> p2) {}
  public abstract void runReadAction(java.lang.Runnable p0);
  public abstract <T> T runReadAction(com.intellij.openapi.util.Computable<T> p0);
  public abstract <T, E extends java.lang.Throwable> T runReadAction(com.intellij.openapi.util.ThrowableComputable<T, E> p0) throws E;
  public abstract void runWriteAction(java.lang.Runnable p0);
  public abstract <T> T runWriteAction(com.intellij.openapi.util.Computable<T> p0);
  public abstract <T, E extends java.lang.Throwable> T runWriteAction(com.intellij.openapi.util.ThrowableComputable<T, E> p0) throws E;
  public abstract boolean hasWriteAction(java.lang.Class<?> p0);
  public default <T, E extends java.lang.Throwable> T runWriteIntentReadAction(com.intellij.openapi.util.ThrowableComputable<T, E> p0) throws E { return null; }
  public abstract void assertReadAccessAllowed();
  public abstract void assertWriteAccessAllowed();
  public abstract void assertReadAccessNotAllowed();
  public abstract void assertIsDispatchThread();
  public abstract void assertIsNonDispatchThread();
  public abstract void assertWriteIntentLockAcquired();
  public abstract void addApplicationListener(com.intellij.openapi.application.ApplicationListener p0, com.intellij.openapi.Disposable p1);
  public abstract void saveAll();
  public abstract void saveSettings();
  public abstract boolean holdsReadLock();
  public abstract void exit();
  public default void exit(boolean p0, boolean p1, boolean p2, int p3) {}
  public default void exit(boolean p0, boolean p1, boolean p2) {}
  public abstract boolean isWriteAccessAllowed();
  public abstract boolean isReadAccessAllowed();
  public abstract boolean isDispatchThread();
  public abstract boolean isWriteIntentLockAcquired();
  public abstract void invokeLater(java.lang.Runnable p0);
  public abstract void invokeLater(java.lang.Runnable p0, com.intellij.openapi.util.Condition<?> p1);
  public abstract void invokeLater(java.lang.Runnable p0, com.intellij.openapi.application.ModalityState p1);
  public abstract void invokeLater(java.lang.Runnable p0, com.intellij.openapi.application.ModalityState p1, com.intellij.openapi.util.Condition<?> p2);
  public abstract void invokeAndWait(java.lang.Runnable p0, com.intellij.openapi.application.ModalityState p1) throws com.intellij.openapi.progress.ProcessCanceledException;
  public abstract void invokeAndWait(java.lang.Runnable p0) throws com.intellij.openapi.progress.ProcessCanceledException;
  public abstract com.intellij.openapi.application.ModalityState getCurrentModalityState();
  public abstract com.intellij.openapi.application.ModalityState getModalityStateForComponent(java.awt.Component p0);
  public abstract com.intellij.openapi.application.ModalityState getDefaultModalityState();
  public abstract com.intellij.openapi.application.ModalityState getNoneModalityState();
  public abstract com.intellij.openapi.application.ModalityState getAnyModalityState();
  public abstract long getStartTime();
  public abstract long getIdleTime();
  public abstract boolean isUnitTestMode();
  public abstract boolean isHeadlessEnvironment();
  public abstract boolean isCommandLine();
  public abstract java.util.concurrent.Future<?> executeOnPooledThread(java.lang.Runnable p0);
  public abstract <T> java.util.concurrent.Future<T> executeOnPooledThread(java.util.concurrent.Callable<T> p0);
  public abstract boolean isRestartCapable();
  public abstract void restart();
  public abstract boolean isActive();
  public abstract boolean isInternal();
  public abstract boolean isEAP();
  public default boolean isExitInProgress() { return false; }
  public abstract boolean isSaveAllowed();
  public abstract void addApplicationListener(com.intellij.openapi.application.ApplicationListener p0);
  public abstract void removeApplicationListener(com.intellij.openapi.application.ApplicationListener p0);
  public default boolean isDisposeInProgress() { return false; }
  public abstract com.intellij.openapi.application.AccessToken acquireReadActionLock();
  public abstract com.intellij.openapi.application.AccessToken acquireWriteActionLock(java.lang.Class<?> p0);
  public default boolean isWriteThread() { return false; }
  public default void assertIsWriteThread() {}
  // kotlin.coroutines methods removed for stub compilation
  public default boolean isTopmostReadAccessAllowed() { return false; }
  public default java.lang.String isLockingProhibited() { return null; }
}
