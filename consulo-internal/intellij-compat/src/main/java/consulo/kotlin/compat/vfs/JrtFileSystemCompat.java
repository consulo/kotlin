package consulo.kotlin.compat.vfs;

import com.intellij.java.language.vfs.jrt.JrtFileSystem;
import consulo.virtualFileSystem.VirtualFileManager;
import consulo.virtualFileSystem.VirtualFileSystem;

/**
 * IntelliJ's JrtFileSystem is the file system itself; Consulo's is a helper next to the real (implementation) file
 * system. remap.xml redirects {@code instanceof JrtFileSystem} and {@code JrtFileSystem.getInstance()} here.
 */
public final class JrtFileSystemCompat {
    private JrtFileSystemCompat() {
    }

    public static boolean isJrtFileSystem(Object fileSystem) {
        return fileSystem instanceof VirtualFileSystem system && JrtFileSystem.isJrt(system);
    }

    public static VirtualFileSystem getInstance() {
        return VirtualFileManager.getInstance().getFileSystem(JrtFileSystem.PROTOCOL);
    }
}
