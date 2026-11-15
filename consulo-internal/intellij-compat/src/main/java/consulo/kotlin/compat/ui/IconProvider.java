package consulo.kotlin.compat.ui;

import consulo.language.psi.PsiElement;
import consulo.ui.image.Image;

/** IntelliJ {@code com.intellij.ide.IconProvider}: the icon of a PSI element, or null for the default one. */
public abstract class IconProvider {
    /** IntelliJ's icon providers; Consulo decorates icons with IconDescriptorUpdaters instead, so there are none. */
    public static final consulo.kotlin.compat.extensions.ExtensionPointName<IconProvider> EXTENSION_POINT_NAME =
        consulo.kotlin.compat.extensions.ExtensionPointName.create("com.intellij.iconProvider");

    public abstract Image getIcon(PsiElement element, int flags);
}
