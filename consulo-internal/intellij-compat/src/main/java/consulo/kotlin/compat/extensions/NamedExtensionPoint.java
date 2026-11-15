package consulo.kotlin.compat.extensions;

import consulo.component.ComponentManager;
import consulo.disposer.Disposable;

import java.util.Iterator;
import java.util.List;

/** An extension point by name; IntelliJ's {@code ExtensionPointImpl} (a sequence of its extensions). */
public final class NamedExtensionPoint<T> implements ExtensionPoint<T>, Iterable<T>, kotlin.sequences.Sequence<T> {
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
    public Iterator<T> iterator() {
        return getExtensionList().iterator();
    }

    @Override
    public void registerExtension(T extension, Disposable parentDisposable) {
        ExtensionPointRegistry.registerExtension(myName, extension, parentDisposable);
    }
}
