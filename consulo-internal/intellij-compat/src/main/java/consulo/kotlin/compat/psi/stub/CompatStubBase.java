package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.StubBase;
import consulo.language.psi.stub.StubElement;

/**
 * IntelliJ {@code StubBase} of stubs whose element type is a plain {@link IElementType}: Kotlin decoupled its stub
 * element types from the stub serializers (see {@link StubRegistry}), Consulo's {@link StubBase} takes an
 * {@code IStubElementType}.
 */
public abstract class CompatStubBase<T extends PsiElement> extends StubBase<T> {
    private final IElementType myElementType;

    protected CompatStubBase(StubElement parent, IElementType elementType) {
        super(parent, null);
        myElementType = elementType;
    }

    public IElementType getElementType() {
        return myElementType;
    }
}
