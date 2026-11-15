package consulo.kotlin.compat.lang;

import consulo.localize.LocalizeValue;
import consulo.virtualFileSystem.fileType.FileType;

/** IntelliJ file types describe themselves with a String, Consulo's with a LocalizeValue. */
public final class FileTypeCompat {
    private FileTypeCompat() {
    }

    /** The description of an IntelliJ file type of the compiler: its id (e.g. kotlin_module), not localized. */
    public static LocalizeValue description(Object fileType) {
        return LocalizeValue.of(((FileType) fileType).getId());
    }
}
