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

package org.jetbrains.kotlin.load.kotlin

import consulo.language.psi.scope.GlobalSearchScope
import consulo.project.Project
import org.jetbrains.kotlin.descriptors.ModuleDescriptor

interface VirtualFileFinderFactory : MetadataFinderFactory {
    override fun create(scope: GlobalSearchScope): VirtualFileFinder
    override fun create(project: Project, module: ModuleDescriptor): VirtualFileFinder

    companion object SERVICE {
        fun getInstance(project: Project): VirtualFileFinderFactory =
            project.getInstance(VirtualFileFinderFactory::class.java)
    }
}
