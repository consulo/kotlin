/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.kotlin.resolve.lazy.declarations

import consulo.language.psi.scope.DelegatingGlobalSearchScope
import consulo.language.psi.scope.GlobalSearchScope
import consulo.project.Project
import consulo.virtualFileSystem.VirtualFile
import org.jetbrains.kotlin.analyzer.ModuleInfo
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.storage.StorageManager

abstract class DeclarationProviderFactoryService {

    abstract fun create(
        project: Project,
        storageManager: StorageManager,
        syntheticFiles: Collection<KtFile>,
        filesScope: GlobalSearchScope,
        moduleInfo: ModuleInfo
    ): DeclarationProviderFactory

    companion object {
        @JvmStatic
        fun createDeclarationProviderFactory(
            project: Project,
            storageManager: StorageManager,
            syntheticFiles: Collection<KtFile>,
            moduleContentScope: GlobalSearchScope,
            moduleInfo: ModuleInfo
        ): DeclarationProviderFactory {
            return project.getInstance(DeclarationProviderFactoryService::class.java)!!
                .create(project, storageManager, syntheticFiles, filteringScope(syntheticFiles, moduleContentScope), moduleInfo)
        }

        private fun filteringScope(syntheticFiles: Collection<KtFile>, baseScope: GlobalSearchScope): GlobalSearchScope {
            if (syntheticFiles.isEmpty() || baseScope == GlobalSearchScope.EMPTY_SCOPE) {
                return baseScope
            }
            return SyntheticFilesFilteringScope(syntheticFiles, baseScope)
        }
    }


    private class SyntheticFilesFilteringScope(syntheticFiles: Collection<KtFile>, baseScope: GlobalSearchScope) :
        DelegatingGlobalSearchScope(baseScope) {

        private val originals = syntheticFiles.mapNotNullTo(HashSet<VirtualFile>()) { it.originalFile.virtualFile }

        override fun contains(file: VirtualFile) = super.contains(file) && file !in originals

        override fun toString() = "SyntheticFilesFilteringScope($myBaseScope)"
    }
}
