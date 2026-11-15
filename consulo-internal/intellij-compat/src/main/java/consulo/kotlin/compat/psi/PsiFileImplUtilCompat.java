package consulo.kotlin.compat.psi;

import consulo.document.Document;
import consulo.document.FileDocumentManager;
import consulo.language.psi.PsiFile;
import consulo.language.psi.PsiManager;
import consulo.language.util.IncorrectOperationException;
import consulo.virtualFileSystem.VirtualFile;
import consulo.virtualFileSystem.fileType.FileType;
import consulo.virtualFileSystem.fileType.FileTypeRegistry;
import consulo.virtualFileSystem.fileType.UnknownFileType;

import java.io.IOException;

/**
 * Remap target of IntelliJ's {@code com.intellij.psi.impl.file.PsiFileImplUtil}. Consulo has the same class in a
 * package it does not export to plugins; this is its {@code setName} on public API.
 */
public final class PsiFileImplUtilCompat {
    private PsiFileImplUtilCompat() {
    }

    public static PsiFile setName(PsiFile file, String newName) throws IncorrectOperationException {
        VirtualFile vFile = file.getViewProvider().getVirtualFile();
        PsiManager manager = file.getManager();
        try {
            FileType newFileType = FileTypeRegistry.getInstance().getFileTypeByFileName(newName);
            if (UnknownFileType.INSTANCE.equals(newFileType) || newFileType.isBinary()) {
                // the file may not open in an editor any more: save it first to prevent data loss
                FileDocumentManager fdm = FileDocumentManager.getInstance();
                Document doc = fdm.getCachedDocument(vFile);
                if (doc != null) {
                    fdm.saveDocumentAsIs(doc);
                }
            }
            vFile.rename(manager, newName);
        }
        catch (IOException e) {
            throw new IncorrectOperationException(e);
        }
        return file.getViewProvider().isPhysical() ? manager.findFile(vFile) : file;
    }

    public static void checkSetName(PsiFile file, String name) throws IncorrectOperationException {
        VirtualFile vFile = file.getVirtualFile();
        VirtualFile parentFile = vFile.getParent();
        if (parentFile == null) {
            return;
        }
        VirtualFile child = parentFile.findChild(name);
        if (child != null && !child.equals(vFile)) {
            throw new IncorrectOperationException("File " + child.getPresentableUrl() + " already exists.");
        }
    }
}
