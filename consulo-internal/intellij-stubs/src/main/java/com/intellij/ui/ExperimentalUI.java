package com.intellij.ui;

// remap.xml redirects isNewUI to consulo.kotlin.compat.util.UtilCompat
@SuppressWarnings("all")
public abstract class ExperimentalUI {
    public static boolean isNewUI() { return true; }
}
