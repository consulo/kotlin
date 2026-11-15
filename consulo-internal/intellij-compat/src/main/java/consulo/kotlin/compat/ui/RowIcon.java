package consulo.kotlin.compat.ui;

import consulo.ui.image.Image;
import consulo.ui.image.ImageEffects;

/** IntelliJ {@code com.intellij.ui.RowIcon}: icons side by side (e.g. a declaration and its visibility). */
public class RowIcon extends CompositeImage {
    public RowIcon(int iconCount) {
        super(iconCount);
    }

    public RowIcon(Image... icons) {
        super(icons);
    }

    @Override
    protected Image compose(Image[] icons) {
        Image result = icons[0];
        for (int i = 1; i < icons.length; i++) {
            result = ImageEffects.appendRight(result, icons[i]);
        }
        return result;
    }
}
