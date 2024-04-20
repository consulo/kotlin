/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.asJava.finder;

import com.intellij.java.language.impl.psi.impl.file.PsiPackageImpl;
import consulo.java.language.module.extension.JavaModuleExtension;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiManager;
import consulo.language.psi.PsiPackageManager;
import consulo.language.psi.scope.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.asJava.KotlinAsJavaSupport;
import org.jetbrains.kotlin.name.FqName;

public class KtLightPackage extends PsiPackageImpl {

    private final FqName fqName;
    private final GlobalSearchScope scope;

    public KtLightPackage(PsiManager manager, FqName qualifiedName, GlobalSearchScope scope) {
        super(manager, PsiPackageManager.getInstance(manager.getProject()), JavaModuleExtension.class, qualifiedName.asString());
        this.fqName = qualifiedName;
        this.scope = scope;
    }

    @NotNull
    @Override
    public PsiElement copy() {
        return new KtLightPackage(getManager(), fqName, scope);
    }

    @Override
    public boolean isValid() {
        return KotlinAsJavaSupport.getInstance(getProject()).packageExists(fqName, scope);
    }
}
