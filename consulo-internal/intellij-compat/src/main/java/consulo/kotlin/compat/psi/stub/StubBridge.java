package consulo.kotlin.compat.psi.stub;

import consulo.application.Application;
import consulo.language.ast.IElementType;
import consulo.language.ast.IFileElementType;
import consulo.language.psi.stub.ObjectStubSerializer;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Connects IntelliJ's decoupled stub API (element types are plain {@link IElementType}s; factories and serializers are
 * registered in a {@link StubRegistry} by {@link StubRegistryExtension}s) to Consulo's, where the element type of a stub
 * is an {@code IStubElementType} that creates and serializes it. For every registered element type there is a
 * {@link StubElementTypeAdapter}; the file element type is a {@link StubFileElementTypeAdapter}.
 */
public final class StubBridge implements StubRegistry {
    private static volatile StubBridge ourInstance;

    private final Map<IElementType, ObjectStubSerializer<?, ?>> mySerializers = new LinkedHashMap<>();
    private final Map<IElementType, StubElementFactory<?, ?>> myFactories = new LinkedHashMap<>();
    private final Map<IElementType, StubElementTypeAdapter> myAdapters = new LinkedHashMap<>();

    private StubBridge() {
    }

    public static StubBridge getInstance() {
        StubBridge bridge = ourInstance;
        if (bridge == null) {
            synchronized (StubBridge.class) {
                bridge = ourInstance;
                if (bridge == null) {
                    bridge = new StubBridge();
                    for (StubRegistryExtension extension : Application.get().getExtensionList(StubRegistryExtension.class)) {
                        extension.register(bridge);
                    }
                    bridge.createAdapters();
                    ourInstance = bridge;
                }
            }
        }
        return bridge;
    }

    @Override
    public void registerStubSerializer(IElementType type, ObjectStubSerializer<?, ?> serializer) {
        mySerializers.put(type, serializer);
    }

    @Override
    public void registerStubFactory(IElementType type, StubElementFactory<?, ?> factory) {
        myFactories.put(type, factory);
    }

    @Override
    public void registerStubSerializingFactory(IElementType type, StubSerializingElementFactory<?, ?> factory) {
        mySerializers.put(type, factory);
        myFactories.put(type, factory);
    }

    private void createAdapters() {
        for (Map.Entry<IElementType, StubElementFactory<?, ?>> entry : myFactories.entrySet()) {
            ObjectStubSerializer<?, ?> serializer = mySerializers.get(entry.getKey());
            if (serializer != null && !(entry.getKey() instanceof IFileElementType)) {
                myAdapters.put(entry.getKey(), new StubElementTypeAdapter(entry.getKey(), entry.getValue(), serializer));
            }
        }
    }

    /** The Consulo stub element type of a registered element type, or null. */
    public StubElementTypeAdapter getStubElementType(IElementType type) {
        return myAdapters.get(type);
    }

    public StubElementFactory<?, ?> getFactory(IElementType type) {
        return myFactories.get(type);
    }

    public ObjectStubSerializer<?, ?> getSerializer(IElementType type) {
        return mySerializers.get(type);
    }

    public List<StubElementTypeAdapter> getStubElementTypes() {
        return List.copyOf(myAdapters.values());
    }

    /** The registered element types that serialize file stubs (Kotlin's {@code KtNodeTypes.FILE}). */
    public List<IElementType> getFileTypes() {
        return mySerializers.keySet().stream().filter(type -> type instanceof IFileElementType).toList();
    }

    /**
     * remap.xml redirects {@code KotlinElementTypeProvider.getFileType()} here, so {@code KtNodeTypes.FILE} is a Consulo
     * stub file element type: Consulo builds stubs only for files whose parser definition's file node type is one.
     */
    public static IFileElementType fileType(Object provider) {
        try {
            Method getter = provider.getClass().getMethod("getFileType");
            return new StubFileElementTypeAdapter((IFileElementType) getter.invoke(provider));
        }
        catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Cannot read the file element type of " + provider, e);
        }
    }
}
