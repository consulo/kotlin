package consulo.kotlin.compat.util;

import consulo.application.util.registry.Registry;
import consulo.logging.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiPredicate;

/**
 * IntelliJ {@code Registry.is(key)} and {@code Registry.is(key, default)} for the Kotlin plugin. Calls are redirected
 * here by remap.xml. Keys without a default take the one the plugin declares (META-INF/kotlin-registry.properties,
 * written by consulo-plugin/tools/genservices.py from the upstream registryKey declarations).
 * Analysis statistics (OpenTelemetry metrics, periodic collection) are always off in Consulo.
 */
public final class RegistryCompat {
    private static final Set<String> ALWAYS_OFF = Set.of("kotlin.analysis.statistics");
    private static final String DEFAULTS_RESOURCE = "META-INF/kotlin-registry.properties";
    private static volatile Properties ourDefaults;

    // a method reference: remap.xml redirects direct Registry.is(String, boolean) calls here
    private static final BiPredicate<String, Boolean> REGISTRY_IS = Registry::is;

    private RegistryCompat() {
    }

    public static boolean is(String key) {
        return is(key, Boolean.parseBoolean(defaults().getProperty(key, "false")));
    }

    public static int intValue(String key) {
        return Registry.intValue(key, Integer.parseInt(defaults().getProperty(key, "0").trim()));
    }

    private static Properties defaults() {
        Properties defaults = ourDefaults;
        if (defaults == null) {
            defaults = new Properties();
            try (InputStream stream = RegistryCompat.class.getClassLoader().getResourceAsStream(DEFAULTS_RESOURCE)) {
                if (stream != null) {
                    defaults.load(stream);
                }
            }
            catch (IOException e) {
                Logger.getInstance(RegistryCompat.class).warn(e);
            }
            ourDefaults = defaults;
        }
        return defaults;
    }

    public static boolean is(String key, boolean defaultValue) {
        if (ALWAYS_OFF.contains(key)) {
            return false;
        }
        return REGISTRY_IS.test(key, defaultValue);
    }
}
