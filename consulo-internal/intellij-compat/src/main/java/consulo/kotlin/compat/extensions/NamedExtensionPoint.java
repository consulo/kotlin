package consulo.kotlin.compat.extensions;

import consulo.component.ComponentManager;
import consulo.disposer.Disposable;

import java.util.List;

final class NamedExtensionPoint<T> implements ExtensionPoint<T> {
    private final String myName;
    private final ComponentManager myArea;

    NamedExtensionPoint(String name, ComponentManager area) {
        myName = name;
        myArea = area;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] getExtensions() {
        return (T[]) getExtensionList().toArray();
    }

    @Override
    public List<T> getExtensionList() {
        return ExtensionPointRegistry.getExtensions(myName, myArea);
    }

    @Override
    public void registerExtension(T extension, Disposable parentDisposable) {
        ExtensionPointRegistry.registerExtension(myName, extension, parentDisposable);
    }
}
