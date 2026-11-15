package consulo.kotlin.compat.ui;

import consulo.ui.image.Image;
import consulo.ui.image.ImageEffects;

/** IntelliJ {@code com.intellij.ui.LayeredIcon}: icons painted over each other (e.g. a declaration and a marker). */
public class LayeredIcon extends CompositeImage {
    public LayeredIcon(int layerCount) {
        super(layerCount);
    }

    public LayeredIcon(Image... icons) {
        super(icons);
    }

    /** IntelliJ shifts a layer by (hShift, vShift); layers are drawn at the origin here. */
    public void setIcon(Image icon, int layer, int hShift, int vShift) {
        setIcon(icon, layer);
    }

    @Override
    protected Image compose(Image[] icons) {
        return ImageEffects.layered(icons);
    }
}
