package consulo.kotlin.compat.extensions;

import consulo.application.Application;
import consulo.component.ComponentManager;

import java.util.List;
import java.util.function.Consumer;

/** IntelliJ {@code com.intellij.openapi.extensions.ExtensionPointName}, resolved through {@link ExtensionPointRegistry}. */
public class ExtensionPointName<T> {
    private final String myName;

    public ExtensionPointName(String name) {
        myName = name;
    }

    public static <T> ExtensionPointName<T> create(String name) {
        return new ExtensionPointName<>(name);
    }

    /** IntelliJ's ExtensionPointName is Kotlin: its callers may go through the companion. */
    public static final class Companion {
        private Companion() {
        }

        public static <T> ExtensionPointName<T> create(String name) {
            return new ExtensionPointName<>(name);
        }
    }

    public String getName() {
        return myName;
    }

    public List<T> getExtensionList() {
        return getPoint().getExtensionList();
    }

    public T[] getExtensions() {
        return getPoint().getExtensions();
    }

    public List<T> getExtensionList(ComponentManager area) {
        return new NamedExtensionPoint<T>(myName, area).getExtensionList();
    }

    public T[] getExtensions(ComponentManager area) {
        return new NamedExtensionPoint<T>(myName, area).getExtensions();
    }

    public ExtensionPoint<T> getPoint() {
        return new NamedExtensionPoint<>(myName, Application.get());
    }

    public void forEachExtensionSafe(Consumer<? super T> consumer) {
        for (T extension : getExtensionList()) {
            try {
                consumer.accept(extension);
            }
            catch (RuntimeException e) {
                ExtensionsCompat.LOG.error(e);
            }
        }
    }

    @Override
    public String toString() {
        return myName;
    }
}
