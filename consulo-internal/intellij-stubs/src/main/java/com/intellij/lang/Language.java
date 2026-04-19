package com.intellij.lang;

@SuppressWarnings("all")
public abstract class Language extends com.intellij.openapi.util.UserDataHolderBase {
  public static final com.intellij.lang.Language[] EMPTY_ARRAY = null;
  public static final com.intellij.lang.Language ANY = null;
  protected Language(java.lang.String p0) { throw new UnsupportedOperationException("stub"); }
  protected Language(java.lang.String p0, java.lang.String... p1) { throw new UnsupportedOperationException("stub"); }
  protected Language(com.intellij.lang.Language p0, java.lang.String p1, java.lang.String... p2) { throw new UnsupportedOperationException("stub"); }
  public static java.util.Collection<com.intellij.lang.Language> getRegisteredLanguages() { return null; }
  public static void unregisterAllLanguagesIn(java.lang.ClassLoader p0, com.intellij.openapi.extensions.PluginDescriptor p1) {}
  public void unregisterLanguage(com.intellij.openapi.extensions.PluginDescriptor p0) {}
  public void unregisterDialect(com.intellij.lang.Language p0) {}
  public static <T extends com.intellij.lang.Language> T findInstance(java.lang.Class<T> p0) { return null; }
  public static java.util.Collection<com.intellij.lang.Language> findInstancesByMimeType(java.lang.String p0) { return null; }
  public java.lang.String toString() { return null; }
  public java.lang.String[] getMimeTypes() { return null; }
  public java.lang.String getID() { return null; }
  public com.intellij.openapi.fileTypes.LanguageFileType getAssociatedFileType() { return null; }
  public com.intellij.openapi.fileTypes.LanguageFileType findMyFileType(com.intellij.openapi.fileTypes.FileType[] p0) { return null; }
  public com.intellij.lang.Language getBaseLanguage() { return null; }
  public java.lang.String getDisplayName() { return null; }
  public final boolean is(com.intellij.lang.Language p0) { return false; }
  public boolean isCaseSensitive() { return false; }
  public final boolean isKindOf(com.intellij.lang.Language p0) { return false; }
  public final boolean isKindOf(java.lang.String p0) { return false; }
  public java.util.List<com.intellij.lang.Language> getDialects() { return null; }
  public static com.intellij.lang.Language findLanguageByID(java.lang.String p0) { return null; }
  protected Language(java.lang.String p0, boolean p1) { throw new UnsupportedOperationException("stub"); }
  protected void registerDialect(com.intellij.lang.Language p0) {}
  public java.util.Collection<com.intellij.lang.Language> getTransitiveDialects() { return null; }
}
