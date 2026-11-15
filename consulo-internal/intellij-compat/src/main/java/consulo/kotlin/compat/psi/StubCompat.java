package consulo.kotlin.compat.psi;

import consulo.language.ast.IElementType;
import consulo.language.ast.TokenSet;
import consulo.language.psi.PsiElement;
import consulo.language.psi.StubBasedPsiElement;
import consulo.language.psi.stub.StubElement;
import consulo.util.collection.ArrayFactory;

import java.util.function.IntFunction;

/**
 * IntelliJ stub API that Consulo lacks. Calls are redirected here by remap.xml {@code <redirects>}.
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class StubCompat {
    private StubCompat() {
    }

    /** IntelliJ {@code StubElement.getElementType()}; Consulo calls it {@code getStubType()}. */
    public static IElementType getElementType(StubElement stub) {
        return stub.getStubType();
    }

    /** IntelliJ {@code StubElement.findChildStubByElementType(IElementType)}. */
    public static StubElement findChildStubByElementType(StubElement stub, IElementType elementType) {
        return CompatStubBasedPsiElementBase.findChildStubByElementType(stub, elementType);
    }

    /** IntelliJ {@code StubElement.getChildrenByType(TokenSet, ArrayFactory)}; Consulo takes an IntFunction. */
    public static PsiElement[] getChildrenByType(StubElement stub, TokenSet filter, ArrayFactory f) {
        return stub.getChildrenByType(filter, (IntFunction) f);
    }

    /** IntelliJ {@code StubBasedPsiElement.getIElementType()} (a default method there). */
    public static IElementType getIElementType(StubBasedPsiElement element) {
        if (element instanceof CompatStubBasedPsiElementBase compat) {
            return compat.getIElementType();
        }
        return element.getElementType();
    }
}
