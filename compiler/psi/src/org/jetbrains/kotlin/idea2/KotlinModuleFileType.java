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

package org.jetbrains.kotlin.idea2;

import consulo.application.util.NotNullLazyValue;
import consulo.localize.LocalizeValue;
import consulo.ui.image.Image;
import consulo.virtualFileSystem.VirtualFile;
import consulo.virtualFileSystem.fileType.FileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class KotlinModuleFileType implements FileType {
    public static final String EXTENSION = "kotlin_module";
    public static final KotlinModuleFileType INSTANCE = new KotlinModuleFileType();

    private final NotNullLazyValue<Image> myIcon = NotNullLazyValue.createValue(() -> KotlinIconProviderService.getInstance().getFileIcon());

    private KotlinModuleFileType() {}

    @Override
    @NotNull
    public String getName() {
        return EXTENSION;
    }

    @Override
    @NotNull
    public LocalizeValue getDescription() {
        return LocalizeValue.localizeTODO("Kotlin module info: contains package part mappings");
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return EXTENSION;
    }

    @Override
    public Image getIcon() {
        return myIcon.getValue();
    }

    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @Nullable
    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] content) {
        return null;
    }
}
