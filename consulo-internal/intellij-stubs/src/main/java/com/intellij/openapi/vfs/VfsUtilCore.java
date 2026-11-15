package com.intellij.openapi.vfs;

@SuppressWarnings("all")
public class VfsUtilCore {
    public static java.io.File virtualToIoFile(VirtualFile file) { return null; }
    public static boolean isAncestor(VirtualFile ancestor, VirtualFile file, boolean strict) { return false; }
    public static String getRelativePath(VirtualFile file, VirtualFile ancestor) { return null; }
    public static String getRelativePath(VirtualFile file, VirtualFile ancestor, char separator) { return null; }
    // Added by consulo-internal/remap/genstub.py from consulo.virtualFileSystem.util.VirtualFileUtil
    public VfsUtilCore() { }
    public static java.lang.String getReadableUrl(com.intellij.openapi.vfs.VirtualFile p0) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile getUserHomeDir() { return null; }
    public static java.net.URL getURL(java.lang.String p0) throws java.net.MalformedURLException { return null; }
    public static com.intellij.openapi.vfs.VirtualFile findFileByURL(java.net.URL p0) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile findFileByURL(java.net.URL p0, com.intellij.openapi.vfs.VirtualFileManager p1) { return null; }
    public static java.lang.String convertFromUrl(java.net.URL p0, com.intellij.openapi.vfs.VirtualFileManager p1) { return null; }
    public static java.lang.String convertFromUrl(java.net.URL p0) { return null; }
    public static java.net.URL convertToURL(java.lang.String p0) { return null; }
    public static boolean isUnder(com.intellij.openapi.vfs.VirtualFile p0, java.util.Set<com.intellij.openapi.vfs.VirtualFile> p1) { return false; }
    public static boolean isUnder(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return false; }
    public static boolean isEqualOrAncestor(java.lang.String p0, java.lang.String p1) { return false; }
    public static java.lang.String extractFileName(java.lang.String p0) { return null; }
    public static java.lang.String urlToPath(java.lang.String p0) { return null; }
    public static void saveText(com.intellij.openapi.vfs.VirtualFile p0, java.lang.String p1) throws java.io.IOException { }
    public static java.net.URI toUri(com.intellij.openapi.vfs.VirtualFile p0) { return null; }
    public static java.net.URI toUri(java.io.File p0) { return null; }
    public static java.net.URI toUri(java.lang.String p0) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile findFileByIoFile(java.io.File p0, boolean p1) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile createDirectories(java.lang.String p0) throws java.io.IOException { return null; }
    public static com.intellij.openapi.vfs.VirtualFile createDirectoryIfMissing(com.intellij.openapi.vfs.VirtualFile p0, java.lang.String p1) throws java.io.IOException { return null; }
    public static com.intellij.openapi.vfs.VirtualFile createDirectoryIfMissing(java.lang.String p0) throws java.io.IOException { return null; }
    public static com.intellij.openapi.vfs.VirtualFile createChildSequent(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException { return null; }
    public static com.intellij.openapi.vfs.VirtualFile findRelativeFile(com.intellij.openapi.vfs.VirtualFile p0, java.lang.String... p1) { return null; }
    public static java.lang.String fixIDEAUrl(java.lang.String p0) { return null; }
    public static java.lang.String toIdeaUrl(java.lang.String p0) { return null; }
    public static java.lang.String toIdeaUrl(java.lang.String p0, boolean p1) { return null; }
    public static java.lang.String fixURLforIDEA(java.lang.String p0) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile findRelativeFile(java.lang.String p0, com.intellij.openapi.vfs.VirtualFile p1) { return null; }
    public static java.lang.String getRelativeLocation(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.VirtualFile p1) { return null; }
    public static java.lang.String getPath(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.VirtualFile p1, char p2) { return null; }
    public static boolean isBrokenLink(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
    public static boolean isInvalidLink(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
    public static com.intellij.openapi.vfs.VirtualFile copyFile(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, com.intellij.openapi.vfs.VirtualFile p2) throws java.io.IOException { return null; }
    public static com.intellij.openapi.vfs.VirtualFile copyFile(java.lang.Object p0, com.intellij.openapi.vfs.VirtualFile p1, com.intellij.openapi.vfs.VirtualFile p2, java.lang.String p3) throws java.io.IOException { return null; }
    public static com.intellij.openapi.vfs.VirtualFile[] toVirtualFileArray(java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile> p0) { return null; }
    public static java.lang.String pathToUrl(java.lang.String p0) { return null; }
    public static boolean iterateChildrenRecursively(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.VirtualFileFilter p1, java.util.function.Predicate<com.intellij.openapi.vfs.VirtualFile> p2) { return false; }
    public static boolean iterateChildrenRecursively(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.VirtualFileFilter p1, java.util.function.Predicate<com.intellij.openapi.vfs.VirtualFile> p2, com.intellij.openapi.vfs.util.VirtualFileVisitor.Option... p3) { return false; }
    public static com.intellij.openapi.vfs.util.VirtualFileVisitor.Result visitChildrenRecursively(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.util.VirtualFileVisitor<?> p1) throws com.intellij.openapi.vfs.util.VirtualFileVisitor.VisitorException { return null; }
    public static <E extends java.lang.Exception> com.intellij.openapi.vfs.util.VirtualFileVisitor.Result visitChildrenRecursively(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.util.VirtualFileVisitor p1, java.lang.Class<E> p2) throws E { return null; }
    public static java.io.InputStream byteStreamSkippingBOM(byte[] p0, com.intellij.openapi.vfs.VirtualFile p1) throws java.io.IOException { return null; }
    public static java.io.InputStream inputStreamSkippingBOM(java.io.InputStream p0, com.intellij.openapi.vfs.VirtualFile p1) throws java.io.IOException { return null; }
    public static java.io.OutputStream outputStreamAddingBOM(java.io.OutputStream p0, com.intellij.openapi.vfs.VirtualFile p1) throws java.io.IOException { return null; }
    public static void processFileRecursivelyWithoutIgnored(com.intellij.openapi.vfs.VirtualFile p0, java.util.function.Predicate<com.intellij.openapi.vfs.VirtualFile> p1) { }
    public static boolean processFilesRecursively(com.intellij.openapi.vfs.VirtualFile p0, java.util.function.Predicate<com.intellij.openapi.vfs.VirtualFile> p1) { return false; }
    public static void processFilesRecursively(com.intellij.openapi.vfs.VirtualFile p0, java.util.function.Predicate<com.intellij.openapi.vfs.VirtualFile> p1, java.util.function.Function<com.intellij.openapi.vfs.VirtualFile, java.lang.Boolean> p2) { }
    public static java.util.List<java.io.File> virtualToIoFiles(java.util.Collection<com.intellij.openapi.vfs.VirtualFile> p0) { return null; }
    public static java.util.List<com.intellij.openapi.vfs.VirtualFile> markDirty(boolean p0, boolean p1, com.intellij.openapi.vfs.VirtualFile... p2) { return null; }
    public static void markDirtyAndRefresh(boolean p0, boolean p1, boolean p2, com.intellij.openapi.vfs.VirtualFile... p3) { }
    public static java.lang.String getUrlForLibraryRoot(java.io.File p0) { return null; }
    public static java.util.List<com.intellij.openapi.vfs.VirtualFile> getChildren(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.VirtualFileFilter p1) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile[] getCommonAncestors(com.intellij.openapi.vfs.VirtualFile[] p0) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile getCommonAncestor(java.util.Collection<? extends com.intellij.openapi.vfs.VirtualFile> p0) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile getCommonAncestor(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.vfs.VirtualFile p1) { return null; }
    public static com.intellij.openapi.util.io.Url newFromVirtualFile(com.intellij.openapi.vfs.VirtualFile p0) { return null; }
    public static java.lang.String[] filterNames(java.lang.String[] p0) { return null; }
    public static boolean isBadName(java.lang.String p0) { return false; }
    public static com.intellij.openapi.vfs.VirtualFile getRootFile(com.intellij.openapi.vfs.VirtualFile p0) { return null; }
    public static com.intellij.openapi.vfs.VirtualFile findContainingDirectory(com.intellij.openapi.vfs.VirtualFile p0, java.lang.CharSequence p1) { return null; }
    public static java.lang.String loadText(com.intellij.openapi.vfs.VirtualFile p0) throws java.io.IOException { return null; }
    public static java.lang.String loadText(com.intellij.openapi.vfs.VirtualFile p0, int p1) throws java.io.IOException { return null; }
    public static byte[] loadBytes(com.intellij.openapi.vfs.VirtualFile p0) throws java.io.IOException { return null; }
    public static void refreshAndFindFileByPath(com.intellij.openapi.vfs.NewVirtualFileSystem p0, java.lang.String p1, java.util.function.Consumer<? super com.intellij.openapi.vfs.NewVirtualFile> p2) { }
}
