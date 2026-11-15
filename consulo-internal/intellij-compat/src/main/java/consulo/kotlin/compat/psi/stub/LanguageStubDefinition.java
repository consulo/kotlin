package consulo.kotlin.compat.psi.stub;

import consulo.annotation.component.ComponentScope;
import consulo.annotation.component.ExtensionAPI;
import consulo.language.psi.stub.StubBuilder;
import consulo.virtualFileSystem.VirtualFile;

/** IntelliJ {@code com.intellij.psi.stubs.LanguageStubDefinition}: stub version and builder of a language. */
@ExtensionAPI(ComponentScope.APPLICATION)
public interface LanguageStubDefinition {
    int getStubVersion();

    StubBuilder getBuilder();

    default boolean shouldBuildStubFor(VirtualFile file) {
        return true;
    }
}
