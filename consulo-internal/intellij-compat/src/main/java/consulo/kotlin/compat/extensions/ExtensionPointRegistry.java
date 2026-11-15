package consulo.kotlin.compat.extensions;

import consulo.component.ComponentManager;
import consulo.disposer.Disposable;
import consulo.disposer.Disposer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * IntelliJ names extension points with strings; Consulo identifies them by their {@code @ExtensionAPI} interface.
 * Names registered here resolve to Consulo extensions; extensions registered at runtime (IntelliJ's
 * {@code ExtensionPoint.registerExtension}) are kept per name. An unknown name has no extensions.
 */
public final class ExtensionPointRegistry {
    private static final Map<String, Class<?>> ourApis = new ConcurrentHashMap<>();
    private static final Map<String, List<Object>> ourRegistered = new ConcurrentHashMap<>();

    static {
        register("com.intellij.java.elementFinder", com.intellij.java.language.psi.PsiElementFinder.class);
    }

    private ExtensionPointRegistry() {
    }

    public static void register(String name, Class<?> extensionApi) {
        ourApis.put(name, extensionApi);
    }

    @SuppressWarnings("unchecked")
    static <T> List<T> getExtensions(String name, ComponentManager area) {
        List<T> result = new ArrayList<>();
        Class<?> api = ourApis.get(name);
        if (api != null && area != null) {
            result.addAll((List<T>) area.getExtensionList(api));
        }
        List<Object> registered = ourRegistered.get(name);
        if (registered != null) {
            result.addAll((List<T>) registered);
        }
        return result;
    }

    static void registerExtension(String name, Object extension, Disposable parentDisposable) {
        List<Object> list = ourRegistered.computeIfAbsent(name, k -> new CopyOnWriteArrayList<>());
        list.add(extension);
        if (parentDisposable != null) {
            Disposer.register(parentDisposable, () -> list.remove(extension));
        }
    }
}
