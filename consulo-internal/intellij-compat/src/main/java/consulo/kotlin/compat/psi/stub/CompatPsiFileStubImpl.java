package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.IElementType;
import consulo.language.ast.TokenSet;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.psi.stub.IStubFileElementType;
import consulo.language.psi.stub.PsiFileStubImpl;

import java.util.function.IntFunction;

/**
 * Remap target of {@code com.intellij.psi.stubs.PsiFileStubImpl}: IntelliJ's file stubs name their element type with
 * {@link #getFileElementType()}, Consulo serializes a file stub by {@link #getType()}.
 */
public class CompatPsiFileStubImpl<T extends PsiFile> extends PsiFileStubImpl<T> {
    public CompatPsiFileStubImpl(T file) {
        super(file);
    }

    /** IntelliJ {@code PsiFileStub.getFileElementType()}: the default file stub type. */
    public IElementType getFileElementType() {
        return TYPE;
    }

    @Override
    public IStubFileElementType getType() {
        return getFileElementType() instanceof IStubFileElementType type ? type : super.getType();
    }

    // children by the plain element type, see StubChildren
    @Override
    public <E extends PsiElement> E[] getChildrenByType(IElementType elementType, E[] array) {
        return StubChildren.byType(this, elementType, array);
    }

    @Override
    public <E extends PsiElement> E[] getChildrenByType(TokenSet filter, E[] array) {
        return StubChildren.byType(this, filter, array);
    }

    @Override
    public <E extends PsiElement> E[] getChildrenByType(IElementType elementType, IntFunction<E[]> f) {
        return StubChildren.byType(this, elementType, f);
    }

    @Override
    public <E extends PsiElement> E[] getChildrenByType(TokenSet filter, IntFunction<E[]> f) {
        return StubChildren.byType(this, filter, f);
    }
}
