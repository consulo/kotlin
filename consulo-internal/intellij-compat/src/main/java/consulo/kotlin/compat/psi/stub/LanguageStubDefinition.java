package consulo.kotlin.compat.psi.stub;

import consulo.language.psi.stub.StubBuilder;
import consulo.virtualFileSystem.VirtualFile;

/** IntelliJ {@code com.intellij.psi.stubs.LanguageStubDefinition}: stub version and builder of a language. */
public interface LanguageStubDefinition {
    int getStubVersion();

    StubBuilder getBuilder();

    default boolean shouldBuildStubFor(VirtualFile file) {
        return true;
    }
}
