package com.intellij.navigation;

@SuppressWarnings("all")
public interface ItemPresentation {
  public abstract java.lang.String getPresentableText();
  public default java.lang.String getLocationString() { return null; }
  public abstract javax.swing.Icon getIcon(boolean p0);
}
