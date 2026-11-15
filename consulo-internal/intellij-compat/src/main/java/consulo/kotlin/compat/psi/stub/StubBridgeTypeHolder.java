package consulo.kotlin.compat.psi.stub;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.ast.IElementType;
import consulo.language.psi.stub.ObjectStubSerializer;
import consulo.language.psi.stub.ObjectStubSerializerProvider;
import consulo.language.psi.stub.StubElementTypeHolder;

import java.util.ArrayList;
import java.util.List;

/** Hands the stub element types of {@link StubBridge} (and its file element types) to Consulo's SerializationManager. */
@ExtensionImpl
public final class StubBridgeTypeHolder extends StubElementTypeHolder<Object> {
    @Override
    public String getExternalIdPrefix() {
        return "kotlin.";
    }

    @Override
    public List<ObjectStubSerializerProvider> loadSerializers() {
        StubBridge bridge = StubBridge.getInstance();
        List<ObjectStubSerializerProvider> providers = new ArrayList<>();
        for (StubElementTypeAdapter type : bridge.getStubElementTypes()) {
            providers.add(provider(type));
        }
        for (IElementType fileType : bridge.getFileTypes()) {
            if (fileType instanceof ObjectStubSerializer<?, ?> serializer) {
                providers.add(provider(serializer));
            }
        }
        return providers;
    }

    private static ObjectStubSerializerProvider provider(ObjectStubSerializer<?, ?> serializer) {
        return new ObjectStubSerializerProvider() {
            @Override
            public String getExternalId() {
                return serializer.getExternalId();
            }

            @Override
            public boolean isLazy() {
                return false;
            }

            @Override
            public ObjectStubSerializer getObjectStubSerializer() {
                return serializer;
            }
        };
    }
}
