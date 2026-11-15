package consulo.kotlin.compat.util;

import consulo.application.util.registry.Registry;

import java.util.Set;
import java.util.function.BiPredicate;

/**
 * IntelliJ {@code Registry.is(key, default)} for the Kotlin analysis. Calls are redirected here by remap.xml.
 * Analysis statistics (OpenTelemetry metrics, periodic collection) are always off in Consulo.
 */
public final class RegistryCompat {
    private static final Set<String> ALWAYS_OFF = Set.of("kotlin.analysis.statistics");

    // a method reference: remap.xml redirects direct Registry.is(String, boolean) calls here
    private static final BiPredicate<String, Boolean> REGISTRY_IS = Registry::is;

    private RegistryCompat() {
    }

    public static boolean is(String key, boolean defaultValue) {
        if (ALWAYS_OFF.contains(key)) {
            return false;
        }
        return REGISTRY_IS.test(key, defaultValue);
    }
}
