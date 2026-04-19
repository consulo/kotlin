package com.intellij.openapi.util.io;

@SuppressWarnings("all")
public class FileUtil {
  public static final java.lang.String ASYNC_DELETE_EXTENSION = null;
  public static final int REGEX_PATTERN_FLAGS = 0;
  public static final Object FILE_HASHING_STRATEGY = null;
  public FileUtil() { throw new UnsupportedOperationException("stub"); }
  public static java.lang.String join(java.lang.String... p0) { return null; }
  public static java.lang.String getRelativePath(java.io.File p0, java.io.File p1) { return null; }
  public static java.lang.String getRelativePath(java.lang.String p0, java.lang.String p1, char p2) { return null; }
  public static java.lang.String getRelativePath(java.lang.String p0, java.lang.String p1, char p2, boolean p3) { return null; }
  public static boolean isAbsolute(java.lang.String p0) { return false; }
  public static boolean exists(java.lang.String p0) { return false; }
  public static boolean isAncestor(java.io.File p0, java.io.File p1, boolean p2) { return false; }
  public static boolean isAncestor(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
  public static com.intellij.util.ThreeState isAncestorThreeState(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
  public static boolean startsWith(java.lang.String p0, java.lang.String p1) { return false; }
  public static boolean startsWith(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
  public static boolean startsWith(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3) { return false; }
  public static java.io.File findAncestor(java.io.File p0, java.io.File p1) { return null; }
  public static java.nio.file.Path findAncestor(java.nio.file.Path p0, java.nio.file.Path p1) { return null; }
  public static java.io.File getParentFile(java.io.File p0) { return null; }
  public static byte[] loadFileBytes(java.io.File p0) throws java.io.IOException { return null; }
  public static byte[] loadFirstAndClose(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
  public static java.lang.String loadTextAndClose(java.io.InputStream p0) throws java.io.IOException { return null; }
  public static java.lang.String loadTextAndClose(java.io.Reader p0) throws java.io.IOException { return null; }
  public static char[] adaptiveLoadText(java.io.Reader p0) throws java.io.IOException { return null; }
  public static byte[] adaptiveLoadBytes(java.io.InputStream p0) throws java.io.IOException { return null; }
  public static java.util.concurrent.Future<java.lang.Void> asyncDelete(java.io.File p0) { return null; }
  public static java.util.concurrent.Future<java.lang.Void> asyncDelete(java.util.Collection<? extends java.io.File> p0) { return null; }
  public static boolean delete(java.io.File p0) { return false; }
  public static void deleteRecursively(java.nio.file.Path p0) throws java.io.IOException {}
  public static void delete(java.nio.file.Path p0) throws java.io.IOException {}
  public static boolean createParentDirs(java.io.File p0) { return false; }
  public static boolean createDirectory(java.io.File p0) { return false; }
  public static boolean createIfDoesntExist(java.io.File p0) { return false; }
  public static boolean ensureCanCreateFile(java.io.File p0) { return false; }
  public static boolean createIfNotExists(java.io.File p0) { return false; }
  public static void copy(java.io.File p0, java.io.File p1) throws java.io.IOException {}
  public static void copyContent(java.io.File p0, java.io.File p1) throws java.io.IOException {}
  public static void copy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException {}
  public static void copy(java.io.InputStream p0, int p1, java.io.OutputStream p2) throws java.io.IOException {}
  public static void copy(java.io.InputStream p0, long p1, java.io.OutputStream p2) throws java.io.IOException {}
  public static void copyFileOrDir(java.io.File p0, java.io.File p1) throws java.io.IOException {}
  public static void copyFileOrDir(java.io.File p0, java.io.File p1, boolean p2) throws java.io.IOException {}
  public static void copyDir(java.io.File p0, java.io.File p1) throws java.io.IOException {}
  public static void copyDirContent(java.io.File p0, java.io.File p1) throws java.io.IOException {}
  public static void copyDir(java.io.File p0, java.io.File p1, boolean p2) throws java.io.IOException {}
  public static void copyDir(java.io.File p0, java.io.File p1, java.io.FileFilter p2) throws java.io.IOException {}
  public static void ensureExists(java.io.File p0) throws java.io.IOException {}
  public static java.lang.String getNameWithoutExtension(java.io.File p0) { return null; }
  public static java.lang.String getNameWithoutExtension(java.lang.String p0) { return null; }
  public static java.lang.String createSequentFileName(java.io.File p0, java.lang.String p1, java.lang.String p2) { return null; }
  public static java.lang.String createSequentFileName(java.io.File p0, java.lang.String p1, java.lang.String p2, java.util.function.Predicate<? super java.io.File> p3) { return null; }
  public static java.io.File findSequentNonexistentFile(java.io.File p0, java.lang.String p1, java.lang.String p2) { return null; }
  public static java.io.File findSequentFile(java.io.File p0, java.lang.String p1, java.lang.String p2, java.util.function.Predicate<? super java.io.File> p3) { return null; }
  public static java.lang.String toSystemDependentName(java.lang.String p0) { return null; }
  public static java.lang.String toSystemDependentName(java.lang.String p0, char p1) { return null; }
  public static java.lang.String toSystemIndependentName(java.lang.String p0) { return null; }
  public static java.lang.String toCanonicalPath(java.lang.String p0) { return null; }
  public static java.lang.String toCanonicalPath(java.lang.String p0, char p1, boolean p2) { return null; }
  public static java.lang.String toCanonicalPath(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String toCanonicalPath(java.lang.String p0, char p1) { return null; }
  public static java.lang.String toCanonicalUriPath(java.lang.String p0) { return null; }
  public static java.lang.String normalize(java.lang.String p0) { return null; }
  public static java.lang.String unquote(java.lang.String p0) { return null; }
  public static boolean rename(java.io.File p0, java.lang.String p1) throws java.io.IOException { return false; }
  public static void rename(java.io.File p0, java.io.File p1) throws java.io.IOException {}
  public static boolean filesEqual(java.io.File p0, java.io.File p1) { return false; }
  public static boolean pathsEqual(java.lang.String p0, java.lang.String p1) { return false; }
  public static boolean namesEqual(java.lang.String p0, java.lang.String p1) { return false; }
  public static int compareFiles(java.io.File p0, java.io.File p1) { return 0; }
  public static int comparePaths(java.lang.String p0, java.lang.String p1) { return 0; }
  public static int fileHashCode(java.io.File p0) { return 0; }
  public static int pathHashCode(java.lang.String p0) { return 0; }
  public static java.lang.String getExtension(java.lang.String p0) { return null; }
  public static java.lang.CharSequence getExtension(java.lang.CharSequence p0) { return null; }
  public static java.lang.CharSequence getExtension(java.lang.CharSequence p0, java.lang.String p1) { return null; }
  public static java.lang.String resolveShortWindowsName(java.lang.String p0) throws java.io.IOException { return null; }
  public static boolean containsWindowsShortName(java.lang.String p0) { return false; }
  public static java.lang.String extractRootPath(java.lang.String p0) { return null; }
  public static void collectMatchedFiles(java.io.File p0, java.util.regex.Pattern p1, java.util.List<? super java.io.File> p2) {}
  public static java.lang.String convertAntToRegexp(java.lang.String p0) { return null; }
  public static java.lang.String convertAntToRegexp(java.lang.String p0, boolean p1) { return null; }
  public static boolean moveDirWithContent(java.io.File p0, java.io.File p1) { return false; }
  public static java.lang.String sanitizeFileName(java.lang.String p0) { return null; }
  public static java.lang.String sanitizeFileName(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String sanitizeFileName(java.lang.String p0, boolean p1, java.lang.String p2) { return null; }
  public static boolean canExecute(java.io.File p0) { return false; }
  public static boolean canWrite(java.lang.String p0) { return false; }
  public static void appendToFile(java.io.File p0, java.lang.String p1) throws java.io.IOException {}
  public static void writeToFile(java.io.File p0, byte[] p1) throws java.io.IOException {}
  public static void writeToFile(java.io.File p0, java.lang.String p1) throws java.io.IOException {}
  public static void writeToFile(java.io.File p0, java.lang.String p1, java.nio.charset.Charset p2) throws java.io.IOException {}
  public static void writeToFile(java.io.File p0, java.lang.String p1, boolean p2) throws java.io.IOException {}
  public static void writeToFile(java.io.File p0, byte[] p1, int p2, int p3) throws java.io.IOException {}
  public static void writeToFile(java.io.File p0, byte[] p1, boolean p2) throws java.io.IOException {}
  public static com.intellij.util.containers.JBTreeTraverser<java.io.File> fileTraverser(java.io.File p0) { return null; }
  public static boolean processFilesRecursively(java.io.File p0, com.intellij.util.Processor<? super java.io.File> p1) { return false; }
  public static boolean processFilesRecursively(java.io.File p0, com.intellij.util.Processor<? super java.io.File> p1, com.intellij.util.Processor<? super java.io.File> p2) { return false; }
  public static java.io.File findFirstThatExist(java.lang.String... p0) { return null; }
  public static java.util.List<java.io.File> findFilesByMask(java.util.regex.Pattern p0, java.io.File p1) { return null; }
  public static java.util.List<java.io.File> findFilesOrDirsByMask(java.util.regex.Pattern p0, java.io.File p1) { return null; }
  public static java.lang.String findFileInProvidedPath(java.lang.String p0, java.lang.String... p1) { return null; }
  public static boolean isAbsolutePlatformIndependent(java.lang.String p0) { return false; }
  public static boolean isUnixAbsolutePath(java.lang.String p0) { return false; }
  public static boolean isWindowsAbsolutePath(java.lang.String p0) { return false; }
  public static java.lang.String getLocationRelativeToUserHome(java.lang.String p0) { return null; }
  public static java.lang.String getLocationRelativeToUserHome(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String expandUserHome(java.lang.String p0) { return null; }
  public static java.io.File[] notNullize(java.io.File[] p0) { return null; }
  public static java.io.File[] notNullize(java.io.File[] p0, java.io.File[] p1) { return null; }
  public static boolean isHashBangLine(java.lang.CharSequence p0, java.lang.String p1) { return false; }
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
  public static void resetCanonicalTempPathCache(java.lang.String p0) {}
  public static java.io.File generateRandomTemporaryPath() throws java.io.IOException { return null; }
  public static java.io.File generateRandomTemporaryPath(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static void setExecutable(java.io.File p0) throws java.io.IOException {}
  public static java.lang.String loadFileOrNull(java.lang.String p0) { return null; }
  public static java.lang.String loadFileOrNull(java.io.File p0) { return null; }
  public static java.lang.String loadFile(java.io.File p0) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0, boolean p1) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0, java.nio.charset.Charset p1) throws java.io.IOException { return null; }
  public static java.lang.String loadFile(java.io.File p0, java.lang.String p1, boolean p2) throws java.io.IOException { return null; }
  public static char[] loadFileText(java.io.File p0) throws java.io.IOException { return null; }
  public static char[] loadFileText(java.io.File p0, java.nio.charset.Charset p1) throws java.io.IOException { return null; }
  public static char[] loadFileText(java.io.File p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static char[] loadText(java.io.Reader p0, int p1) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.io.File p0) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.io.File p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.lang.String p0) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> loadLines(java.io.BufferedReader p0) throws java.io.IOException { return null; }
  public static byte[] loadBytes(java.io.InputStream p0) throws java.io.IOException { return null; }
  public static byte[] loadBytes(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
  public static java.util.List<java.lang.String> splitPath(java.lang.String p0) { return null; }
  public static java.util.List<java.lang.String> splitPath(java.lang.String p0, char p1) { return null; }
  public static boolean visitFiles(java.io.File p0, com.intellij.util.Processor<? super java.io.File> p1) { return false; }
  public static boolean deleteWithRenamingIfExists(java.nio.file.Path p0) { return false; }
  public static boolean deleteWithRenaming(java.nio.file.Path p0) { return false; }
  public static boolean deleteWithRenaming(java.io.File p0) { return false; }
  public static java.lang.String getUrl(java.io.File p0) { return null; }
  public static java.net.URI fileToUri(java.io.File p0) { return null; }
  public static boolean extensionEquals(java.lang.String p0, java.lang.String p1) { return false; }
  public static boolean isJarOrZip(java.io.File p0) { return false; }
}
