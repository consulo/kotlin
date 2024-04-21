/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.decompiler.psi

import consulo.application.ApplicationManager
import consulo.localize.LocalizeValue

abstract class KotlinLabelProviderService {
    abstract fun getLabelForBuiltInFileType(): LocalizeValue
    abstract fun getLabelForKlibMetaFileType(): String
    abstract fun getLabelForKotlinJavaScriptMetaFileType(): String

    companion object {
        fun getService(): KotlinLabelProviderService =
            ApplicationManager.getApplication().getInstance(KotlinLabelProviderService::class.java)
    }
}