package consulo.kotlin.compat.lang;

import consulo.localize.LocalizeValue;
import consulo.ui.image.Image;
import consulo.virtualFileSystem.fileType.FileType;

/**
 * Remap target of {@code org.jetbrains.lang.manifest.ManifestFileType}: Consulo's manifest file type belongs to the
 * osmorc plugin, which the Kotlin plugin does not depend on. Not registered, so no file has this type.
 */
public final class ManifestFileType implements FileType {
    public static final ManifestFileType INSTANCE = new ManifestFileType();

    private ManifestFileType() {
    }

    @Override
    public String getId() {
        return "Manifest";
    }

    @Override
    public LocalizeValue getDescription() {
        return LocalizeValue.localizeTODO("JAR manifest");
    }

    @Override
    public Image getIcon() {
        return null;
    }

    @Override
    public boolean isBinary() {
        return false;
    }
}
