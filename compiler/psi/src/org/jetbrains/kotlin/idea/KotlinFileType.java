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

package org.jetbrains.kotlin.idea;

import consulo.application.util.NotNullLazyValue;
import consulo.language.file.LanguageFileType;
import consulo.localize.LocalizeValue;
import consulo.ui.image.Image;
import org.jetbrains.annotations.NotNull;

public class KotlinFileType extends LanguageFileType {
    public static final String EXTENSION = "kt";
    public static final String DOT_DEFAULT_EXTENSION = "." + EXTENSION;
    public static final KotlinFileType INSTANCE = new KotlinFileType();

    private final NotNullLazyValue<Image> myIcon = NotNullLazyValue.createValue(() -> KotlinIconProviderService.getInstance().getFileIcon());

    private KotlinFileType() {
        super(KotlinLanguage.INSTANCE);
    }

    @Override
    @NotNull
    public String getName() {
        return KotlinLanguage.NAME;
    }

    @Override
    @NotNull
    public LocalizeValue getDescription() {
        return LocalizeValue.localizeTODO("Kotlin files");
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
}
