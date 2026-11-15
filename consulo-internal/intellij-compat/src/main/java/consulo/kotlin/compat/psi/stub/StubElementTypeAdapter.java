package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.IStubElementType;
import consulo.language.psi.stub.IndexSink;
import consulo.language.psi.stub.ObjectStubSerializer;
import consulo.language.psi.stub.StubElement;
import consulo.language.psi.stub.StubInputStream;
import consulo.language.psi.stub.StubOutputStream;

import java.io.IOException;

/** The Consulo stub element type of a plain element type: its registered factory and serializer (see {@link StubBridge}). */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class StubElementTypeAdapter extends IStubElementType<StubElement, PsiElement> {
    private final IElementType myElementType;
    private final StubElementFactory myFactory;
    private final ObjectStubSerializer mySerializer;

    StubElementTypeAdapter(IElementType elementType, StubElementFactory<?, ?> factory, ObjectStubSerializer<?, ?> serializer) {
        super(elementType.toString(), elementType.getLanguage());
        myElementType = elementType;
        myFactory = factory;
        mySerializer = serializer;
    }

    /** The plain element type (of the AST and the PSI). */
    public IElementType getElementType() {
        return myElementType;
    }

    @Override
    public PsiElement createPsi(StubElement stub) {
        return myFactory.createPsi(stub);
    }

    @Override
    public StubElement createStub(PsiElement psi, StubElement parentStub) {
        return myFactory.createStub(psi, parentStub);
    }

    @Override
    public boolean shouldCreateStub(ASTNode node) {
        return myFactory.shouldCreateStub(node);
    }

    @Override
    public String getExternalId() {
        return mySerializer.getExternalId();
    }

    @Override
    public void serialize(StubElement stub, StubOutputStream dataStream) throws IOException {
        mySerializer.serialize(stub, dataStream);
    }

    @Override
    public StubElement deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
        return (StubElement) mySerializer.deserialize(dataStream, parentStub);
    }

    @Override
    public void indexStub(StubElement stub, IndexSink sink) {
        mySerializer.indexStub(stub, sink);
    }
}
