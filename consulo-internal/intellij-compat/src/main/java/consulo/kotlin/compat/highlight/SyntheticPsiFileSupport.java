package consulo.kotlin.compat.highlight;

import consulo.virtualFileSystem.VirtualFile;

/**
 * IntelliJ's {@code SyntheticPsiFileSupport}: files shown in the editor that belong to no project (e.g. diff sides),
 * which IntelliJ highlights anyway. Consulo has no such files.
 */
public final class SyntheticPsiFileSupport {
    private SyntheticPsiFileSupport() {
    }

    public static boolean isOutsiderFile(VirtualFile file) {
        return false;
    }
}
