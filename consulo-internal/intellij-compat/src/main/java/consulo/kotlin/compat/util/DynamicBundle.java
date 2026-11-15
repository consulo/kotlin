package consulo.kotlin.compat.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.function.Supplier;

/**
 * IntelliJ {@code com.intellij.DynamicBundle}: messages of a properties file (UTF-8) next to the bundle class, formatted
 * with {@link MessageFormat} when there are parameters.
 */
public class DynamicBundle {
    private final Class<?> myBundleClass;
    private final String myPathToBundle;
    private volatile ResourceBundle myBundle;

    public DynamicBundle(Class<?> bundleClass, String pathToBundle) {
        myBundleClass = bundleClass;
        myPathToBundle = pathToBundle;
    }

    public ResourceBundle getResourceBundle() {
        ResourceBundle bundle = myBundle;
        if (bundle == null) {
            String resource = myPathToBundle.replace('.', '/') + ".properties";
            try (InputStream stream = myBundleClass.getClassLoader().getResourceAsStream(resource)) {
                if (stream == null) {
                    throw new IllegalStateException("No bundle " + resource + " for " + myBundleClass.getName());
                }
                bundle = new PropertyResourceBundle(new InputStreamReader(stream, StandardCharsets.UTF_8));
            }
            catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            myBundle = bundle;
        }
        return bundle;
    }

    public boolean containsKey(String key) {
        return getResourceBundle().containsKey(key);
    }

    public String getMessage(String key, Object... params) {
        String value = messageOrNull(key, params);
        return value != null ? value : "!" + key + "!";
    }

    public Supplier<String> getLazyMessage(String key, Object... params) {
        return () -> getMessage(key, params);
    }

    public String messageOrNull(String key, Object... params) {
        ResourceBundle bundle = getResourceBundle();
        if (!bundle.containsKey(key)) {
            return null;
        }
        String value = bundle.getString(key);
        return params.length > 0 ? MessageFormat.format(value, params) : value;
    }

    public String messageOrDefault(String key, String defaultValue, Object... params) {
        String value = messageOrNull(key, params);
        return value != null ? value : defaultValue;
    }
}
