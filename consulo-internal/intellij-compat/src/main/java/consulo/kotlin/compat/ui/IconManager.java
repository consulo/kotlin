package consulo.kotlin.compat.ui;

import consulo.logging.Logger;
import consulo.ui.image.Image;

import java.net.URL;

/**
 * IntelliJ {@code com.intellij.ui.IconManager}: platform icons and icons loaded from the plugin's resources. Upstream
 * icon classes load their SVGs by path; Consulo loads the same files as images.
 */
public final class IconManager {
    private static final Logger LOG = Logger.getInstance(IconManager.class);
    private static final IconManager INSTANCE = new IconManager();

    private IconManager() {
    }

    public static IconManager getInstance() {
        return INSTANCE;
    }

    public Image getPlatformIcon(PlatformIcons icon) {
        return icon.getImage();
    }

    public Image loadRasterizedIcon(String path, ClassLoader classLoader, int cacheKey, int flags) {
        return getIcon(path, classLoader);
    }

    /** {@code path} is the classic UI icon, {@code expUIPath} the new (experimental) UI one, which Consulo uses. */
    public Image loadRasterizedIcon(String path, String expUIPath, ClassLoader classLoader, int cacheKey, int flags) {
        return getIcon(expUIPath != null ? expUIPath : path, classLoader);
    }

    public Image getIcon(String path, ClassLoader classLoader) {
        String resource = path.startsWith("/") ? path.substring(1) : path;
        URL url = classLoader.getResource(resource);
        if (url == null) {
            LOG.warn("Icon not found: " + path);
            return Image.empty(Image.DEFAULT_ICON_SIZE);
        }
        try {
            return Image.fromUrl(url);
        }
        catch (Exception e) {
            LOG.warn("Icon not loaded: " + path, e);
            return Image.empty(Image.DEFAULT_ICON_SIZE);
        }
    }

    public Image getIcon(String path, Class<?> aClass) {
        return getIcon(path, aClass.getClassLoader());
    }

    public Image createRowIcon(Image... icons) {
        return new RowIcon(icons);
    }

    public Image createLayered(Image... icons) {
        return new LayeredIcon(icons);
    }

    public Image createEmptyIcon(Image icon) {
        return Image.empty(icon.getWidth(), icon.getHeight());
    }
}
