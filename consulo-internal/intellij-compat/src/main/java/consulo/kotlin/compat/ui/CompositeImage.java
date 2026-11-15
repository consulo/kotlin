package consulo.kotlin.compat.ui;

import consulo.ui.ex.awtUnsafe.TargetAWT;
import consulo.ui.image.Image;

import javax.swing.Icon;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An icon IntelliJ composes from parts and changes in place ({@code RowIcon}, {@code LayeredIcon}). Consulo images are
 * immutable, so the parts are composed with {@code ImageEffects} when the icon is read; the desktop UI paints any image
 * that is also a Swing icon.
 */
abstract class CompositeImage implements Image, Icon {
    private final Image[] myIcons;
    private volatile Image myComposed;

    CompositeImage(int iconCount) {
        myIcons = new Image[iconCount];
    }

    CompositeImage(Image... icons) {
        myIcons = icons.clone();
    }

    /** Composes the non-null parts, at least one. */
    protected abstract Image compose(Image[] icons);

    public void setIcon(Image icon, int index) {
        myIcons[index] = icon;
        myComposed = null;
    }

    public Image getIcon(int index) {
        return myIcons[index];
    }

    public int getIconCount() {
        return myIcons.length;
    }

    public Image[] getAllIcons() {
        return myIcons.clone();
    }

    private Image composed() {
        Image composed = myComposed;
        if (composed == null) {
            List<Image> parts = new ArrayList<>(Arrays.asList(myIcons));
            parts.removeIf(java.util.Objects::isNull);
            composed = parts.isEmpty() ? Image.empty(Image.DEFAULT_ICON_SIZE) : compose(parts.toArray(Image[]::new));
            myComposed = composed;
        }
        return composed;
    }

    @Override
    public int getWidth() {
        return composed().getWidth();
    }

    @Override
    public int getHeight() {
        return composed().getHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        TargetAWT.to(composed()).paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return getWidth();
    }

    @Override
    public int getIconHeight() {
        return getHeight();
    }
}
