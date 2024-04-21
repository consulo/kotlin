// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.jetbrains.kotlin.analysis.decompiler.psi

import consulo.localize.LocalizeValue
import consulo.ui.image.Image
import consulo.virtualFileSystem.VirtualFile
import consulo.virtualFileSystem.fileType.FileType
import org.jetbrains.kotlin.idea2.KotlinIconProviderService
import org.jetbrains.kotlin.serialization.deserialization.builtins.BuiltInSerializerProtocol

object KotlinBuiltInFileType : FileType {
    override fun getId() = "kotlin_builtins"

    override fun getDescription(): LocalizeValue =
        KotlinLabelProviderService.getService()?.getLabelForBuiltInFileType()
            ?: DEFAULT_DESCRIPTION

    override fun getDefaultExtension() = BuiltInSerializerProtocol.BUILTINS_FILE_EXTENSION

    override fun getIcon(): Image = KotlinIconProviderService.getInstance().builtInFileIcon

    override fun isBinary() = true

    override fun isReadOnly() = true

    override fun getCharset(file: VirtualFile, content: ByteArray): String? = null

    private val DEFAULT_DESCRIPTION = LocalizeValue.of("Kotlin built-in declarations")
}
