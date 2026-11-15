package consulo.kotlin.compat.extensions;

import com.intellij.java.language.psi.PsiElementFinder;
import consulo.component.ComponentManager;
import consulo.logging.Logger;

/** IntelliJ extension area access, on {@link ExtensionPointRegistry}. Calls are redirected here by remap.xml. */
public final class ExtensionsCompat {
    static final Logger LOG = Logger.getInstance(ExtensionsCompat.class);

    private static final ProjectExtensionPointName<PsiElementFinder> PSI_ELEMENT_FINDER =
        new ProjectExtensionPointName<>("com.intellij.java.elementFinder");

    private ExtensionsCompat() {
    }

    /** {@code AreaInstance.getExtensionArea()} of a project or the application */
    public static ExtensionsArea getExtensionArea(ComponentManager area) {
        return new ExtensionsArea() {
            @Override
            public boolean hasExtensionPoint(String name) {
                return true;
            }

            @Override
            public <T> ExtensionPoint<T> getExtensionPoint(ExtensionPointName<T> name) {
                return new NamedExtensionPoint<>(name.getName(), area);
            }

            @Override
            public <T> ExtensionPoint<T> getExtensionPoint(String name) {
                return new NamedExtensionPoint<>(name, area);
            }
        };
    }

    /** {@code PsiElementFinder.EP} */
    public static ProjectExtensionPointName<PsiElementFinder> psiElementFinderEp() {
        return PSI_ELEMENT_FINDER;
    }

    private static final ExtensionPointName<Object> SHORT_NAMES_CACHE = ExtensionPointName.create("com.intellij.java.shortNamesCache");

    /** IntelliJ {@code PsiShortNamesCache.EP_NAME} (see ExtensionPointRegistry). */
    public static ExtensionPointName<Object> shortNamesCacheEp() {
        return SHORT_NAMES_CACHE;
    }

    private static final ExtensionPointName<Object> OVERRIDING_METHODS_SEARCH = ExtensionPointName.create("com.intellij.overridingMethodsSearch");
    private static final ExtensionPointName<Object> DIRECT_CLASS_INHERITORS_SEARCH = ExtensionPointName.create("com.intellij.directClassInheritorsSearch");

    /** IntelliJ {@code OverridingMethodsSearch.EP_NAME}: Consulo's OverridingMethodsSearchExecutor extensions. */
    public static ExtensionPointName<Object> overridingMethodsSearchEp() {
        return OVERRIDING_METHODS_SEARCH;
    }

    /** IntelliJ {@code DirectClassInheritorsSearch.EP_NAME}: Consulo's DirectClassInheritorsSearchExecutor extensions. */
    public static ExtensionPointName<Object> directClassInheritorsSearchEp() {
        return DIRECT_CLASS_INHERITORS_SEARCH;
    }
}
