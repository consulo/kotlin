package consulo.kotlin.compat.psi.stub;

import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.StubElement;
import consulo.language.psi.stub.StubSerializer;

/** IntelliJ {@code com.intellij.psi.stubs.StubSerializingElementFactory}. */
public interface StubSerializingElementFactory<Stub extends StubElement, Psi extends PsiElement>
    extends StubSerializer<Stub>, StubElementFactory<Stub, Psi> {
}
