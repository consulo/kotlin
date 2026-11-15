package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.IElementType;
import consulo.language.ast.TokenSet;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.StubBase;
import consulo.language.psi.stub.StubElement;

import java.util.function.IntFunction;

/**
 * IntelliJ {@code StubBase} of stubs whose element type is a plain {@link IElementType}: Kotlin decoupled its stub
 * element types from the stub serializers (see {@link StubRegistry}), Consulo's {@link StubBase} takes an
 * {@code IStubElementType}, here the {@link StubElementTypeAdapter} of the element type.
 */
public abstract class CompatStubBase<T extends PsiElement> extends StubBase<T> {
    private final IElementType myElementType;

    protected CompatStubBase(StubElement parent, IElementType elementType) {
        // Consulo's stub type creates and serializes the stub: the adapter of the registered factory and serializer
        super(parent, StubBridge.getInstance().getStubElementType(elementType));
        myElementType = elementType;
    }

    public IElementType getElementType() {
        return myElementType;
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
