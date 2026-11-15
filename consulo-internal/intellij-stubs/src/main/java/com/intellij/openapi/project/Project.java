package com.intellij.openapi.project;

@SuppressWarnings("all")
public interface Project extends com.intellij.openapi.components.ComponentManager,com.intellij.openapi.extensions.AreaInstance, consulo.ui.WindowOwner, com.intellij.util.concurrent.coroutine.CoroutineContextOwner {
    com.intellij.util.messages.MessageBus getMessageBus();
  public abstract java.lang.String getName();
  public abstract com.intellij.openapi.vfs.VirtualFile getBaseDir();
  public abstract java.lang.String getBasePath();
  public abstract com.intellij.openapi.vfs.VirtualFile getProjectFile();
  public abstract java.lang.String getProjectFilePath();
  public default java.lang.String getPresentableUrl() { return null; }
  public abstract com.intellij.openapi.vfs.VirtualFile getWorkspaceFile();
  public abstract java.lang.String getLocationHash();
  public abstract void save();
  public default void scheduleSave() {}
  public abstract boolean isOpen();
  public abstract boolean isInitialized();
  public default boolean isDefault() { return false; }
  public default com.intellij.openapi.components.ComponentManager getActualComponentManager() { return null; }
    // Added by consulo-internal/remap/genstub.py from consulo.project.Project
    public static final java.lang.String DIRECTORY_STORE_FOLDER = ".consulo";
    public static final com.intellij.openapi.util.Key<com.intellij.openapi.project.Project> KEY = null;
    public static final com.intellij.openapi.util.Key<com.intellij.openapi.vfs.VirtualFile> PROJECT_FILE_DIRECTORY = null;
    public com.intellij.openapi.application.Application getApplication();
    public consulo.platform.Platform getPlatform();
    public default java.lang.String getPlatformTargetId() { return null; }
    public default com.intellij.util.concurrent.coroutine.Coroutine<java.lang.Object, java.lang.Object> saveAsync(consulo.ui.UIAccess p0) { return null; }
    public default boolean isModulesReady() { return false; }
    public default com.intellij.openapi.project.ProjectType getType() { return null; }
    public default consulo.ui.Window getWindow() { return null; }
    public default consulo.ui.UIAccess getUIAccess() { return null; }
}
