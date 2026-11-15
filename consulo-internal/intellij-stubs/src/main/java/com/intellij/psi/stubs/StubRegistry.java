package com.intellij.psi.stubs;
@SuppressWarnings("all")
public interface StubRegistry {
    void registerStubSerializer(com.intellij.psi.tree.IElementType type, ObjectStubSerializer<?, ?> serializer);
    void registerStubFactory(com.intellij.psi.tree.IElementType type, StubElementFactory<?, ?> factory);
    void registerStubSerializingFactory(com.intellij.psi.tree.IElementType type, StubSerializingElementFactory<?, ?> factory);
}
