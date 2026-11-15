package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.StubElement;

/**
 * IntelliJ {@code com.intellij.psi.stubs.StubElementFactory}: creates stubs and PSI for an element type that is not
 * a stub element type itself (Consulo's {@code IStubElementType} combines the two).
 */
public interface StubElementFactory<Stub extends StubElement, Psi extends PsiElement> {
    Stub createStub(Psi psi, StubElement parentStub);

    Psi createPsi(Stub stub);

    default boolean shouldCreateStub(ASTNode node) {
        return true;
    }
}
