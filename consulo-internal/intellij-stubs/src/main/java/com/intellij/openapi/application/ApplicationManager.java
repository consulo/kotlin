package com.intellij.openapi.application;

@SuppressWarnings("all")
public class ApplicationManager {
  protected static volatile com.intellij.openapi.application.Application ourApplication = null;
  public ApplicationManager() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.openapi.application.Application getApplication() { return null; }
  public static void setApplication(com.intellij.openapi.application.Application p0) {}
  public static void setApplication(com.intellij.openapi.application.Application p0, com.intellij.openapi.Disposable p1) {}
  public static void setApplication(com.intellij.openapi.application.Application p0, java.util.function.Supplier<? extends com.intellij.openapi.fileTypes.FileTypeRegistry> p1, com.intellij.openapi.Disposable p2) {}
  public static void registerCleaner(java.lang.Runnable p0) {}
}
