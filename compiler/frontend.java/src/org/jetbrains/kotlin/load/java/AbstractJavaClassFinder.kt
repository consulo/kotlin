/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.load.java

import com.intellij.java.language.impl.JavaClassFileType
import com.intellij.java.language.impl.JavaFileType
import consulo.language.psi.scope.DelegatingGlobalSearchScope
import consulo.language.psi.scope.GlobalSearchScope
import consulo.project.Project
import consulo.virtualFileSystem.VirtualFile
import consulo.virtualFileSystem.fileType.FileTypeRegistry
import consulo.virtualFileSystem.fileType.UnknownFileType
import jakarta.inject.Inject
import org.jetbrains.kotlin.config.JvmTarget
import org.jetbrains.kotlin.config.LanguageVersionSettings
import org.jetbrains.kotlin.idea2.KotlinFileType
import org.jetbrains.kotlin.resolve.BindingTrace
import org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer
import org.jetbrains.kotlin.resolve.jvm.JvmCodeAnalyzerInitializer
import org.jetbrains.kotlin.resolve.jvm.TopPackageNamesProvider
import org.jetbrains.kotlin.resolve.lazy.KotlinCodeAnalyzer

abstract class AbstractJavaClassFinder : JavaClassFinder {
    protected lateinit var project: Project
    protected lateinit var javaSearchScope: GlobalSearchScope

    @Inject
    fun setScope(scope: GlobalSearchScope) {
        javaSearchScope =
            if (scope == GlobalSearchScope.EMPTY_SCOPE) {
                GlobalSearchScope.EMPTY_SCOPE
            } else {
                FilterOutKotlinSourceFilesScope(scope)
            }
    }

    @Inject
    open fun setProjectInstance(project: Project) {
        this.project = project
    }

    open fun initialize(
        trace: BindingTrace,
        codeAnalyzer: KotlinCodeAnalyzer,
        languageVersionSettings: LanguageVersionSettings,
        jvmTarget: JvmTarget,
    ) {
        (CodeAnalyzerInitializer.getInstance(project) as? JvmCodeAnalyzerInitializer)?.initialize(
            trace, codeAnalyzer.moduleDescriptor, codeAnalyzer, languageVersionSettings, jvmTarget
        )
    }

    inner class FilterOutKotlinSourceFilesScope(baseScope: GlobalSearchScope) : DelegatingGlobalSearchScope(baseScope),
        TopPackageNamesProvider {

        override val topPackageNames: Set<String>?
            get() = (myBaseScope as? TopPackageNamesProvider)?.topPackageNames

        override fun contains(file: VirtualFile): Boolean {
            // KTIJ-20095: optimization to avoid heavy file.fileType calculation
            val extension = file.extension
            val ktFile =
                when {
                    file.isDirectory -> false
                    extension == KotlinFileType.EXTENSION -> true
                    extension == JavaFileType.DEFAULT_EXTENSION || extension == JavaClassFileType.INSTANCE.defaultExtension -> false
                    else -> {
                        val fileTypeByFileName = FileTypeRegistry.getInstance().getFileTypeByFileName(file.name)
                        fileTypeByFileName == KotlinFileType.INSTANCE || fileTypeByFileName == UnknownFileType.INSTANCE &&
                                FileTypeRegistry.getInstance().isFileOfType(file, KotlinFileType.INSTANCE)
                    }
                }
            return !ktFile && myBaseScope.contains(file)
        }

        val base: GlobalSearchScope = myBaseScope

        //NOTE: expected by class finder to be not null
        override fun getProject(): Project = this@AbstractJavaClassFinder.project

        override fun toString() = "JCFI: $myBaseScope"

    }
}
