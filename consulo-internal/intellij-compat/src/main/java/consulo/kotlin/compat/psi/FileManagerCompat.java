package consulo.kotlin.compat.psi;

import consulo.language.file.FileViewProvider;
import consulo.language.impl.file.SingleRootFileViewProvider;
import consulo.language.psi.PsiManager;
import consulo.virtualFileSystem.VirtualFile;

/**
 * Remap target of {@code com.intellij.psi.impl.file.impl.FileManager}, which is internal in Consulo;
 * {@code PsiManagerEx.getFileManager()} is redirected to {@link #getFileManager}.
 */
public final class FileManagerCompat {
    private final PsiManager myManager;

    private FileManagerCompat(PsiManager manager) {
        myManager = manager;
    }

    public static FileManagerCompat getFileManager(PsiManager manager) {
        return new FileManagerCompat(manager);
    }

    public FileViewProvider createFileViewProvider(VirtualFile file, boolean eventSystemEnabled) {
        return new SingleRootFileViewProvider(myManager, file, eventSystemEnabled);
    }
}
