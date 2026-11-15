package consulo.kotlin.compat.psi.stub;

import consulo.application.Application;
import consulo.language.ast.ASTNode;
import consulo.language.ast.IFileElementType;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.IStubFileElementType;
import consulo.language.psi.stub.IndexSink;
import consulo.language.psi.stub.ObjectStubSerializer;
import consulo.language.psi.stub.PsiFileStub;
import consulo.language.psi.stub.StubBuilder;
import consulo.language.psi.stub.StubElement;
import consulo.language.psi.stub.StubInputStream;
import consulo.language.psi.stub.StubOutputStream;
import consulo.virtualFileSystem.VirtualFile;

import java.io.IOException;
import java.util.List;

/**
 * A file element type of IntelliJ's decoupled stub API as a Consulo stub file element type: parsing by the original
 * type, the stub builder and version by the {@link LanguageStubDefinition}, serialization by the serializer registered
 * for this type (see {@link StubBridge}).
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class StubFileElementTypeAdapter extends IStubFileElementType<PsiFileStub> {
    private final IFileElementType myParsingType;

    StubFileElementTypeAdapter(IFileElementType parsingType) {
        super(parsingType.toString(), parsingType.getLanguage());
        myParsingType = parsingType;
    }

    @Override
    protected ASTNode doParseContents(ASTNode chameleon, PsiElement psi) {
        return myParsingType.parseContents(chameleon);
    }

    private LanguageStubDefinition definition() {
        // only Kotlin registers a definition (IntelliJ keys them by language, Consulo has no such extension point)
        List<LanguageStubDefinition> definitions = Application.get().getExtensionList(LanguageStubDefinition.class);
        if (definitions.isEmpty()) {
            throw new IllegalStateException("No LanguageStubDefinition for " + getLanguage());
        }
        return definitions.get(0);
    }

    private ObjectStubSerializer serializer() {
        ObjectStubSerializer serializer = StubBridge.getInstance().getSerializer(this);
        if (serializer == null) {
            throw new IllegalStateException("No stub serializer registered for " + this);
        }
        return serializer;
    }

    @Override
    public int getStubVersion() {
        return definition().getStubVersion();
    }

    @Override
    public StubBuilder getBuilder() {
        return definition().getBuilder();
    }

    @Override
    public boolean shouldBuildStubFor(VirtualFile file) {
        return definition().shouldBuildStubFor(file);
    }

    @Override
    public String getExternalId() {
        return toString();
    }

    @Override
    public void serialize(PsiFileStub stub, StubOutputStream dataStream) throws IOException {
        serializer().serialize(stub, dataStream);
    }

    @Override
    public PsiFileStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
        return (PsiFileStub) serializer().deserialize(dataStream, parentStub);
    }

    @Override
    public void indexStub(PsiFileStub stub, IndexSink sink) {
        serializer().indexStub(stub, sink);
    }
}
