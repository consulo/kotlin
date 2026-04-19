package com.intellij.openapi.application;

@SuppressWarnings("all")
public final class PathManager {
  public enum OS { Windows, macOS, Linux, FreeBSD, Other }
  public static final java.lang.String PROPERTIES_FILE = null;
  public static final java.lang.String PROPERTIES_FILE_NAME = null;
  public static final java.lang.String PROPERTY_HOME_PATH = null;
  public static final java.lang.String PROPERTY_CONFIG_PATH = null;
  public static final java.lang.String PROPERTY_SYSTEM_PATH = null;
  public static final java.lang.String PROPERTY_SCRATCH_PATH = null;
  public static final java.lang.String PROPERTY_PLUGINS_PATH = null;
  public static final java.lang.String PROPERTY_LOG_PATH = null;
  public static final java.lang.String PROPERTY_LOG_CONFIG_FILE = null;
  public static final java.lang.String PROPERTY_PATHS_SELECTOR = null;
  public static final java.lang.String SYSTEM_PATHS_CUSTOMIZER = null;
  public static final java.lang.String OPTIONS_DIRECTORY = null;
  public static final java.lang.String DEFAULT_EXT = null;
  public PathManager() { throw new UnsupportedOperationException("stub"); }
  public static java.lang.String getHomePath() { return null; }
  public static java.lang.String getHomePath(boolean p0) { return null; }
  public static boolean isUnderHomeDirectory(java.lang.String p0) { return false; }
  public static boolean isUnderHomeDirectory(java.nio.file.Path p0) { return false; }
  public static java.lang.String getHomePathFor(java.lang.Class<?> p0) { return null; }
  public static java.nio.file.Path getHomeDirFor(java.lang.Class<?> p0) { return null; }
  public static java.lang.String getBinPath() { return null; }
  public static java.nio.file.Path findBinFile(java.lang.String p0) { return null; }
  public static java.nio.file.Path findBinFileWithException(java.lang.String p0) { return null; }
  public static java.lang.String getLibPath() { return null; }
  public static java.lang.String getPreInstalledPluginsPath() { return null; }
  public static java.lang.String getBundledRuntimePath() { return null; }
  public static synchronized java.nio.file.Path getCommonDataPath() { return null; }
  public static java.lang.String getPathsSelector() { return null; }
  public static void setPathSelector(java.lang.String p0) {}
  public static java.nio.file.Path getConfigDir() { return null; }
  public static java.lang.String getConfigPath() { return null; }
  public static void setExplicitConfigPath(java.lang.String p0) {}
  public static java.lang.String getScratchPath() { return null; }
  public static java.lang.String getDefaultConfigPathFor(java.lang.String p0) { return null; }
  public static java.lang.String getOptionsPath() { return null; }
  public static java.io.File getOptionsFile(java.lang.String p0) { return null; }
  public static java.nio.file.Path getPluginsDir() { return null; }
  public static java.lang.String getPluginsPath() { return null; }
  public static java.lang.String getDefaultPluginPathFor(java.lang.String p0) { return null; }
  public static java.lang.String getCustomOptionsDirectory() { return null; }
  public static java.nio.file.Path getSystemDir() { return null; }
  public static java.lang.String getSystemPath() { return null; }
  public static java.lang.String getDefaultSystemPathFor(java.lang.String p0) { return null; }
  public static com.intellij.openapi.application.PathManager.OS getLocalOS() { return null; }
  public static java.nio.file.Path getDefaultSystemPathFor(com.intellij.openapi.application.PathManager.OS p0, java.lang.String p1, java.lang.String p2) { return null; }
  public static java.lang.String getDefaultUnixSystemPath(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String getTempPath() { return null; }
  public static java.nio.file.Path getIndexRoot() { return null; }
  public static java.nio.file.Path getLogDir() { return null; }
  public static java.lang.String getLogPath() { return null; }
  public static java.lang.String getDefaultLogPathFor(java.lang.String p0) { return null; }
  public static java.nio.file.Path getStartupScriptDir() { return null; }
  public static java.lang.String getPluginTempPath() { return null; }
  public static java.lang.String getResourceRoot(java.lang.Class<?> p0, java.lang.String p1) { return null; }
  public static java.lang.String getResourceRoot(java.lang.ClassLoader p0, java.lang.String p1) { return null; }
  public static void loadProperties() {}
  public static void customizePaths(java.util.List<java.lang.String> p0) {}
  public static java.nio.file.Path getOriginalConfigDir() { return null; }
  public static java.nio.file.Path getOriginalSystemDir() { return null; }
  public static java.nio.file.Path getOriginalLogDir() { return null; }
  public static java.lang.String substituteVars(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.io.File findFileInLibDirectory(java.lang.String p0) { return null; }
  public static java.lang.String getCommunityHomePath() { return null; }
  public static java.lang.String getJarPathForClass(java.lang.Class<?> p0) { return null; }
  public static java.nio.file.Path getJarForClass(java.lang.Class<?> p0) { return null; }
  public static java.lang.String getAbsolutePath(java.lang.String p0) { return null; }
  public static java.lang.String getArchivedCompliedClassesLocation() { return null; }
  public static java.util.Map<java.lang.String, java.lang.String> getArchivedCompiledClassesMapping() { return null; }
}
