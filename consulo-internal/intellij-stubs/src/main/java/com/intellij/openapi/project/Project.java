package com.intellij.openapi.project;

@SuppressWarnings("all")
public interface Project extends com.intellij.openapi.components.ComponentManager,com.intellij.openapi.extensions.AreaInstance {
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
}
