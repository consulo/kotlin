/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea;

import consulo.application.ApplicationManager;
import consulo.ui.image.Image;

public abstract class KotlinIconProviderService {
    public abstract Image getFileIcon();
    public abstract Image getBuiltInFileIcon();

    public static class CompilerKotlinFileIconProviderService extends KotlinIconProviderService {
        @Override
        public Image getFileIcon() {
            return null;
        }

        @Override
        public Image getBuiltInFileIcon() {
            return null;
        }
    }

    public static KotlinIconProviderService getInstance() {
        KotlinIconProviderService service = ApplicationManager.getApplication().getInstance(KotlinIconProviderService.class);
        return service != null ? service : new CompilerKotlinFileIconProviderService();
    }
}
