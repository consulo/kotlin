package consulo.kotlin.compat.extensions;

/** IntelliJ {@code com.intellij.openapi.extensions.ExtensionsArea} of a project or the application. */
public interface ExtensionsArea {
    boolean hasExtensionPoint(String name);

    <T> ExtensionPoint<T> getExtensionPoint(ExtensionPointName<T> name);

    <T> ExtensionPoint<T> getExtensionPoint(String name);
}
