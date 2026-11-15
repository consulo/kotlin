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
}
