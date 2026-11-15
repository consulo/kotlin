package com.intellij.openapi.util;

@SuppressWarnings("all")
public interface Iconable {
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS) @interface IconFlags {}
  public abstract javax.swing.Icon getIcon(int p0);
    // Added by consulo-internal/remap/genstub.py from consulo.component.util.Iconable
    public static final int ICON_FLAG_VISIBILITY = 1;
    public static final int ICON_FLAG_READ_STATUS = 2;
}
