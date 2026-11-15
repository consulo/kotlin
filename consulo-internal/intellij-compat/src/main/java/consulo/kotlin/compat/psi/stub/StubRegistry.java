package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.IElementType;
import consulo.language.psi.stub.ObjectStubSerializer;

/** IntelliJ {@code com.intellij.psi.stubs.StubRegistry}: associates element types with stub serializers and factories. */
public interface StubRegistry {
    void registerStubSerializer(IElementType type, ObjectStubSerializer<?, ?> serializer);

    void registerStubFactory(IElementType type, StubElementFactory<?, ?> factory);

    void registerStubSerializingFactory(IElementType type, StubSerializingElementFactory<?, ?> factory);
}
