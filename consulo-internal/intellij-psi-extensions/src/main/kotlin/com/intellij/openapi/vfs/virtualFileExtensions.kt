package com.intellij.openapi.vfs

/** Matches IntelliJ's VirtualFile.findFile(relativePath): a file (not a directory) below this one. */
fun VirtualFile.findFile(relativePath: String): VirtualFile? =
    findFileByRelativePath(relativePath)?.takeIf { !it.isDirectory }

/** Matches IntelliJ's VirtualFile.findDirectory(relativePath). */
fun VirtualFile.findDirectory(relativePath: String): VirtualFile? =
    findFileByRelativePath(relativePath)?.takeIf { it.isDirectory }
