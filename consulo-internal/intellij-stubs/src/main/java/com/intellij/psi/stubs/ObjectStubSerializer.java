package com.intellij.psi.stubs;
@SuppressWarnings("all")
public interface ObjectStubSerializer<T extends Stub, P extends Stub> {
    String getExternalId();
    void serialize(T stub, StubOutputStream dataStream) throws java.io.IOException;
    T deserialize(StubInputStream dataStream, P parentStub) throws java.io.IOException;
    void indexStub(T stub, IndexSink sink);
}
