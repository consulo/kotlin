package com.intellij.openapi.util.io;

@SuppressWarnings("all")
public final class FileUtilRt {
  public interface RepeatableIOOperation<T, E extends Throwable> {
    T execute(boolean lastAttempt) throws E;
  }
  public static final int MEGABYTE = 0;
  public static final int LARGE_FOR_CONTENT_LOADING = 0;
  public static final int LARGE_FILE_PREVIEW_SIZE = 0;
  public static boolean isJarOrZip(java.io.File p0) { return false; }
  public static boolean isJarOrZip(java.io.File p0, boolean p1) { return false; }
  public static java.util.List<java.lang.String> splitPath(java.lang.String p0, char p1) { return null; }
  public static boolean isFilePathAcceptable(java.io.File p0, java.io.FileFilter p1) { return false; }
  public static java.lang.String toCanonicalPath(java.lang.String p0, char p1, boolean p2) { return null; }
  public static java.lang.String getExtension(java.lang.String p0) { return null; }
  public static java.lang.CharSequence getExtension(java.lang.CharSequence p0) { return null; }
  public static java.lang.CharSequence getExtension(java.lang.CharSequence p0, java.lang.String p1) { return null; }
  public static boolean extensionEquals(java.lang.String p0, java.lang.String p1) { return false; }
  public static boolean fileNameEquals(java.io.File p0, java.lang.String p1) { return false; }
  public static boolean fileNameEquals(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static java.lang.String toSystemDependentName(java.lang.String p0) { return null; }
  public static java.lang.String toSystemDependentName(java.lang.String p0, char p1) { return null; }
  public static java.lang.String toSystemIndependentName(java.lang.String p0) { return null; }
  public static java.lang.String getRelativePath(java.io.File p0, java.io.File p1) { return null; }
  public static java.lang.String getRelativePath(java.lang.String p0, java.lang.String p1, char p2) { return null; }
  public static java.lang.String getRelativePath(java.lang.String p0, java.lang.String p1, char p2, boolean p3) { return null; }
  public static java.lang.CharSequence getNameWithoutExtension(java.lang.CharSequence p0) { return null; }
  public static java.lang.String getNameWithoutExtension(java.lang.String p0) { return null; }
  public static java.io.File createTempDirectory(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.io.File createTempDirectory(java.lang.String p0, java.lang.String p1, boolean p2) throws java.io.IOException { return null; }
  public static java.io.File createTempDirectory(java.io.File p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException { return null; }
  public static java.io.File createTempDirectory(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3) throws java.io.IOException { return null; }
  public static java.io.File createTempFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.io.File createTempFile(java.lang.String p0, java.lang.String p1, boolean p2) throws java.io.IOException { return null; }
  public static java.io.File createTempFile(java.io.File p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException { return null; }
  public static java.io.File createTempFile(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3) throws java.io.IOException { return null; }
  public static java.io.File createTempFile(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws java.io.IOException { return null; }
  public static java.lang.String getTempDirectory() { return null; }
  public static java.io.File generateRandomTemporaryPath() throws java.io.IOException { return null; }
  public static java.io.File generateRandomTemporaryPath(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0, boolean p1) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0, java.lang.String p1, boolean p2) throws java.io.IOException { return null; }
  public static char[] loadFileText(java.io.File p0) throws java.io.IOException { return null; }
  public static char[] loadFileText(java.io.File p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static char[] loadFileText(java.io.File p0, java.nio.charset.Charset p1) throws java.io.IOException { return null; }
  public static char[] loadText(java.io.Reader p0, int p1) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.io.File p0) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.io.File p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.lang.String p0) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.io.BufferedReader p0) throws java.io.IOException { return null; }
  public static byte[] loadBytes(java.io.InputStream p0) throws java.io.IOException { return null; }
  public static boolean isTooLarge(long p0) { return false; }
  public static byte[] loadBytes(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
  public static java.io.File getParentFile(java.io.File p0) { return null; }
  public static boolean delete(java.io.File p0) { return false; }
  public static void deleteRecursively(java.nio.file.Path p0) throws java.io.IOException {}
  public static <T, E extends java.lang.Throwable> T doIOOperation(com.intellij.openapi.util.io.FileUtilRt.RepeatableIOOperation<T, E> p0) throws E { return null; }
  public static boolean ensureCanCreateFile(java.io.File p0) { return false; }
  public static boolean createIfNotExists(java.io.File p0) { return false; }
  public static boolean createParentDirs(java.io.File p0) { return false; }
  public static boolean createDirectory(java.io.File p0) { return false; }
  public static void copy(java.io.File p0, java.io.File p1) throws java.io.IOException {}
  public static void copy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException {}
  public static int getUserFileSizeLimit() { return 0; }
  public static int getUserContentLoadLimit() { return 0; }
  public static java.net.URI fileToUri(java.io.File p0) { return null; }
  public static int pathHashCode(java.lang.String p0) { return 0; }
  public static boolean filesEqual(java.io.File p0, java.io.File p1) { return false; }
  public static boolean pathsEqual(java.lang.String p0, java.lang.String p1) { return false; }
}
