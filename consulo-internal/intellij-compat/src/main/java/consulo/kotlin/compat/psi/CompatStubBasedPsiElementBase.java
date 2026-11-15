package consulo.kotlin.compat.psi;

import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.ast.TokenSet;
import consulo.language.impl.psi.stub.StubBasedPsiElementBase;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.IStubElementType;
import consulo.language.psi.stub.StubElement;
import consulo.util.collection.ArrayFactory;

import java.lang.reflect.Array;

/**
 * Remap target of {@code com.intellij.extapi.psi.StubBasedPsiElementBase}: adds the IntelliJ API that
 * addresses children by plain {@link IElementType} (Kotlin PSI no longer uses {@link IStubElementType}).
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class CompatStubBasedPsiElementBase<T extends StubElement> extends StubBasedPsiElementBase<T> {
    private final IElementType myCompatElementType;

    public CompatStubBasedPsiElementBase(T stub, IStubElementType nodeType) {
        super(stub, nodeType);
        myCompatElementType = nodeType;
    }

    public CompatStubBasedPsiElementBase(T stub, IElementType nodeType) {
        super(stub, nodeType, null);
        myCompatElementType = nodeType;
    }

    public CompatStubBasedPsiElementBase(T stub, IElementType nodeType, ASTNode node) {
        super(stub, nodeType, node);
        myCompatElementType = stub != null ? nodeType : node.getElementType();
    }

    public CompatStubBasedPsiElementBase(ASTNode node) {
        super(node);
        myCompatElementType = node.getElementType();
    }

    protected final IElementType getElementTypeImpl() {
        return myCompatElementType;
    }

    /** IntelliJ {@code StubBasedPsiElement.getIElementType()}. */
    public IElementType getIElementType() {
        return myCompatElementType;
    }

    public final PsiElement getStubOrPsiChild(IElementType elementType) {
        T stub = getGreenStub();
        if (stub != null) {
            StubElement element = findChildStubByElementType(stub, elementType);
            if (element != null) {
                return element.getPsi();
            }
        }
        else {
            ASTNode childNode = getNode().findChildByType(elementType);
            if (childNode != null) {
                return childNode.getPsi();
            }
        }
        return null;
    }

    public final PsiElement getRequiredStubOrPsiChild(IElementType elementType) {
        PsiElement child = getStubOrPsiChild(elementType);
        if (child == null) {
            throw new IllegalStateException("Cannot find child of " + elementType + " in " + this);
        }
        return child;
    }

    public final <Psi extends PsiElement> Psi getStubOrPsiChild(IElementType elementType, Class<Psi> psiClass) {
        return psiClass.cast(getStubOrPsiChild(elementType));
    }

    public final <Psi extends PsiElement> Psi getRequiredStubOrPsiChild(IElementType elementType, Class<Psi> psiClass) {
        return psiClass.cast(getRequiredStubOrPsiChild(elementType));
    }

    public final <Psi extends PsiElement> Psi[] getStubOrPsiChildren(IElementType elementType, ArrayFactory<? extends Psi> f) {
        T stub = getGreenStub();
        if (stub != null) {
            return (Psi[]) stub.getChildrenByType(elementType, f);
        }
        ASTNode[] nodes = getNode().getChildren(TokenSet.create(elementType));
        Psi[] psiElements = f.create(nodes.length);
        for (int i = 0; i < nodes.length; i++) {
            psiElements[i] = (Psi) nodes[i].getPsi();
        }
        return psiElements;
    }

    public final <Psi extends PsiElement> Psi[] getStubOrPsiChildren(IElementType elementType, Psi[] array) {
        T stub = getGreenStub();
        if (stub != null) {
            return (Psi[]) stub.getChildrenByType(elementType, array);
        }
        ASTNode[] nodes = getNode().getChildren(TokenSet.create(elementType));
        Psi[] psiElements = (Psi[]) Array.newInstance(array.getClass().getComponentType(), nodes.length);
        for (int i = 0; i < nodes.length; i++) {
            psiElements[i] = (Psi) nodes[i].getPsi();
        }
        return psiElements;
    }

    /** IntelliJ's {@code StubElement.findChildStubByElementType}; Consulo only matches {@link IStubElementType}. */
    public static StubElement findChildStubByElementType(StubElement<?> stub, IElementType elementType) {
        for (StubElement child : stub.getChildrenStubs()) {
            if (child.getStubType() == elementType) {
                return child;
            }
        }
        return null;
    }
}
