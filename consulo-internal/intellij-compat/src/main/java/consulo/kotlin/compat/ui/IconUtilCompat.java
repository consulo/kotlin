package consulo.kotlin.compat.ui;

import consulo.platform.base.icon.PlatformIconGroup;
import consulo.ui.image.Image;

/** Icons of IntelliJ's IconUtil that Consulo's lacks. */
public final class IconUtilCompat {
    private IconUtilCompat() {
    }

    public static Image getAddPackageIcon() {
        return PlatformIconGroup.nodesPackage();
    }
}
