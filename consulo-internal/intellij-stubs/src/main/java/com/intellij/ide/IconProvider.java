package com.intellij.ide;

// consulo.kotlin.compat.ui.IconProvider
@SuppressWarnings("all")
public abstract class IconProvider {
    public static final com.intellij.openapi.extensions.ExtensionPointName<IconProvider> EXTENSION_POINT_NAME = null;
    public abstract javax.swing.Icon getIcon(com.intellij.psi.PsiElement element, int flags);
}
