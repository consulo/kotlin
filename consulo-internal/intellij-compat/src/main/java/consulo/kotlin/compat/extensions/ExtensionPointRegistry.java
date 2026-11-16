package consulo.kotlin.compat.extensions;

import consulo.component.ComponentManager;
import consulo.disposer.Disposable;
import consulo.disposer.Disposer;

import consulo.project.Project;
import com.intellij.java.language.psi.search.PsiShortNamesCache;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/**
 * IntelliJ names extension points with strings; Consulo identifies them by their {@code @ExtensionAPI} interface.
 * Names registered here resolve to Consulo extensions; extensions registered at runtime (IntelliJ's
 * {@code ExtensionPoint.registerExtension}) are kept per name. An unknown name has no extensions.
 */
public final class ExtensionPointRegistry {
    private static final Map<String, Class<?>> ourApis = new ConcurrentHashMap<>();
    /** Extension APIs of the remapped compiler, by class name (not visible to this module at compile time). */
    private static final Map<String, String> ourApiNames = new ConcurrentHashMap<>();
    private static final Map<String, List<Object>> ourRegistered = new ConcurrentHashMap<>();
    /** Extension points whose extensions Consulo keeps behind a service. */
    private static final Map<String, Function<ComponentManager, List<?>>> ourSuppliers = new ConcurrentHashMap<>();

    static {
        register("com.intellij.java.elementFinder", com.intellij.java.language.psi.PsiElementFinder.class);
        register("com.intellij.overridingMethodsSearch", com.intellij.java.indexing.search.searches.OverridingMethodsSearchExecutor.class);
        register("com.intellij.readWriteAccessDetector", consulo.language.editor.highlight.ReadWriteAccessDetector.class);
        register("com.intellij.directClassInheritorsSearch", com.intellij.java.indexing.search.searches.DirectClassInheritorsSearchExecutor.class);
        // Consulo unites the short name caches (PsiShortNameProvider extensions) in one project service
        ourSuppliers.put("com.intellij.java.shortNamesCache",
            area -> area instanceof Project project ? List.of(PsiShortNamesCache.getInstance(project)) : List.of());
        // @ExtensionAPI and bindings come from remap.xml (genservices.py)
        ourApiNames.put("org.jetbrains.kotlin.psiReferenceProvider", "org.jetbrains.kotlin.references.KotlinPsiReferenceProviderContributor");
    }

    private ExtensionPointRegistry() {
    }

    public static void register(String name, Class<?> extensionApi) {
        ourApis.put(name, extensionApi);
    }

    @SuppressWarnings("unchecked")
    static <T> List<T> getExtensions(String name, ComponentManager area) {
        List<T> result = new ArrayList<>();
        Function<ComponentManager, List<?>> supplier = ourSuppliers.get(name);
        if (supplier != null && area != null) {
            result.addAll((List<T>) supplier.apply(area));
        }
        Class<?> api = ourApis.computeIfAbsent(name, ExtensionPointRegistry::loadApi);
        if (api != null && area != null) {
            result.addAll((List<T>) area.getExtensionList(api));
        }
        List<Object> registered = ourRegistered.get(name);
        if (registered != null) {
            result.addAll((List<T>) registered);
        }
        return result;
    }

    /** Extension points of the Kotlin plugin (name=extension API), written by consulo-plugin/tools/genservices.py */
    private static final String PLUGIN_EXTENSION_POINTS = "META-INF/kotlin-extension-points.properties";
    private static volatile java.util.Properties ourPluginPoints;

    private static java.util.Properties pluginPoints() {
        java.util.Properties points = ourPluginPoints;
        if (points == null) {
            points = new java.util.Properties();
            try (java.io.InputStream stream = ExtensionPointRegistry.class.getClassLoader().getResourceAsStream(PLUGIN_EXTENSION_POINTS)) {
                if (stream != null) {
                    points.load(stream);
                }
            }
            catch (java.io.IOException ignored) {
            }
            ourPluginPoints = points;
        }
        return points;
    }

    private static Class<?> loadApi(String name) {
        String className = ourApiNames.get(name);
        if (className == null) {
            className = pluginPoints().getProperty(name);
        }
        if (className == null) {
            return null;
        }
        try {
            return Class.forName(className, false, ExtensionPointRegistry.class.getClassLoader());
        }
        catch (ClassNotFoundException e) {
            return null;
        }
    }

    static void registerExtension(String name, Object extension, Disposable parentDisposable) {
        List<Object> list = ourRegistered.computeIfAbsent(name, k -> new CopyOnWriteArrayList<>());
        list.add(extension);
        if (parentDisposable != null) {
            Disposer.register(parentDisposable, () -> list.remove(extension));
        }
    }
}
