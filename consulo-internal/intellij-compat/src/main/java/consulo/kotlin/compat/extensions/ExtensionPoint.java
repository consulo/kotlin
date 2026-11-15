package consulo.kotlin.compat.extensions;

import consulo.disposer.Disposable;

import java.util.List;

/** IntelliJ {@code com.intellij.openapi.extensions.ExtensionPoint}. */
public interface ExtensionPoint<T> {
    T[] getExtensions();

    List<T> getExtensionList();

    void registerExtension(T extension, Disposable parentDisposable);
}
