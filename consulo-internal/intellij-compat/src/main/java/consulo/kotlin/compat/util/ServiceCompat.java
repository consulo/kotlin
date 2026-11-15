package consulo.kotlin.compat.util;

import consulo.annotation.component.ServiceAPI;
import consulo.component.ComponentManager;

/**
 * IntelliJ's {@code ComponentManager.getService(Class)} returns null for a service nobody registered, and Kotlin
 * code relies on that (falling back to no-op implementations). Consulo throws instead. Only {@link ServiceAPI}
 * classes can be bound in Consulo, so anything else is "not registered".
 */
public final class ServiceCompat {
    private ServiceCompat() {
    }

    public static <T> T getService(ComponentManager manager, Class<T> serviceClass) {
        if (!serviceClass.isAnnotationPresent(ServiceAPI.class)) {
            return null;
        }
        return manager.getInstance(serviceClass);
    }
}
