package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.IElementType;
import consulo.language.ast.TokenSet;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.StubElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/**
 * Child stub lookups by the plain element type: Consulo's {@code StubBase} compares {@code getStubType()}, which for a
 * Kotlin stub is its {@link StubElementTypeAdapter}, while the PSI asks for the element type it was created with.
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class StubChildren {
    private StubChildren() {
    }

    /** The element type the stub was created with: the plain one behind its adapter. */
    public static IElementType elementType(StubElement<?> stub) {
        IElementType type = stub.getStubType();
        return type instanceof StubElementTypeAdapter adapter ? adapter.getElementType() : type;
    }

    public static StubElement findChild(StubElement<?> stub, IElementType elementType) {
        for (StubElement child : stub.getChildrenStubs()) {
            if (elementType(child) == elementType) {
                return child;
            }
        }
        return null;
    }

    public static <E extends PsiElement> E[] byType(StubElement<?> stub, IElementType elementType, IntFunction<E[]> f) {
        return collect(stub, type -> type == elementType, f);
    }

    public static <E extends PsiElement> E[] byType(StubElement<?> stub, TokenSet filter, IntFunction<E[]> f) {
        return collect(stub, filter::contains, f);
    }

    public static <E extends PsiElement> E[] byType(StubElement<?> stub, IElementType elementType, E[] array) {
        return collect(stub, type -> type == elementType, array);
    }

    public static <E extends PsiElement> E[] byType(StubElement<?> stub, TokenSet filter, E[] array) {
        return collect(stub, filter::contains, array);
    }

    private static <E extends PsiElement> E[] collect(StubElement<?> stub, Predicate<IElementType> filter, IntFunction<E[]> f) {
        List<E> result = matching(stub, filter);
        return result.toArray(f.apply(result.size()));
    }

    private static <E extends PsiElement> E[] collect(StubElement<?> stub, Predicate<IElementType> filter, E[] array) {
        List<E> result = matching(stub, filter);
        return result.toArray(Arrays.copyOf(array, result.size()));
    }

    private static <E extends PsiElement> List<E> matching(StubElement<?> stub, Predicate<IElementType> filter) {
        List<E> result = new ArrayList<>();
        for (StubElement child : stub.getChildrenStubs()) {
            if (filter.test(elementType(child))) {
                result.add((E) child.getPsi());
            }
        }
        return result;
    }
}
