package com.intellij.openapi.diagnostic;

@SuppressWarnings("all")
public abstract class Logger {
  public interface Factory {
    Logger getLoggerInstance(String category);
  }
  public Logger() { throw new UnsupportedOperationException("stub"); }
  public static void setFactory(java.lang.Class<? extends com.intellij.openapi.diagnostic.Logger.Factory> p0) {}
  public static void setFactory(com.intellij.openapi.diagnostic.Logger.Factory p0) {}
  public static com.intellij.openapi.diagnostic.Logger.Factory getFactory() { return null; }
  public static boolean isInitialized() { return false; }
  public static com.intellij.openapi.diagnostic.Logger getInstance(java.lang.String p0) { return null; }
  public static com.intellij.openapi.diagnostic.Logger getInstance(java.lang.Class<?> p0) { return null; }
  public abstract boolean isDebugEnabled();
  public void debug(java.lang.String p0) {}
  public void debug(java.lang.Throwable p0) {}
  public abstract void debug(java.lang.String p0, java.lang.Throwable p1);
  public void debug(java.lang.String p0, java.lang.Object... p1) {}
  public void debugValues(java.lang.String p0, java.util.Collection<?> p1) {}
  public final void infoWithDebug(java.lang.Throwable p0) {}
  public final void infoWithDebug(java.lang.String p0, java.lang.Throwable p1) {}
  public final void warnWithDebug(java.lang.Throwable p0) {}
  public final void warnWithDebug(java.lang.String p0, java.lang.Throwable p1) {}
  public boolean isTraceEnabled() { return false; }
  public void trace(java.lang.String p0) {}
  public void trace(java.lang.Throwable p0) {}
  public void info(java.lang.Throwable p0) {}
  public void info(java.lang.String p0) {}
  public abstract void info(java.lang.String p0, java.lang.Throwable p1);
  public void warn(java.lang.String p0) {}
  public void warn(java.lang.Throwable p0) {}
  public abstract void warn(java.lang.String p0, java.lang.Throwable p1);
  public void error(java.lang.String p0) {}
  public void error(java.lang.Object p0) {}
  public void error(java.lang.String p0, com.intellij.openapi.diagnostic.Attachment... p1) {}
  public void error(java.lang.String p0, java.lang.Throwable p1, com.intellij.openapi.diagnostic.Attachment... p2) {}
  public void error(java.lang.String p0, java.lang.String... p1) {}
  public void error(java.lang.String p0, java.lang.Throwable p1) {}
  public void error(java.lang.Throwable p0) {}
  public abstract void error(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2);
  public boolean assertTrue(boolean p0, java.lang.Object p1) { return false; }
  public boolean assertTrue(boolean p0) { return false; }
  public void setLevel(Object p0) {}
  public void setLevel(com.intellij.openapi.diagnostic.LogLevel p0) {}
  public static boolean shouldRethrow(java.lang.Throwable p0) { return false; }
  protected static java.lang.Throwable ensureNotControlFlow(java.lang.Throwable p0) { return null; }
  public static void setUnitTestMode() {}
  public void warnInProduction(java.lang.Throwable p0) {}
}
