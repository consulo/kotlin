/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package consulo.kotlinc;

import consulo.language.psi.scope.GlobalSearchScope;
import consulo.language.psi.scope.LocalSearchScope;

public class SearchScopes {
    public static boolean isEmptyScope(consulo.content.scope.SearchScope scope) {
        return scope == GlobalSearchScope.EMPTY_SCOPE || scope == LocalSearchScope.EMPTY;
    }
}
