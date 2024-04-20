/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package consulo.kotlinc.psi.impl;

import com.intellij.java.language.psi.PsiClass;
import com.intellij.java.language.psi.PsiJavaPackage;
import com.intellij.java.language.psi.PsiModifierList;
import consulo.language.impl.psi.FakePsiElement;
import consulo.language.psi.PsiDirectory;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.psi.scope.GlobalSearchScope;
import consulo.language.util.IncorrectOperationException;
import consulo.virtualFileSystem.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PsiJavaPackageStub extends FakePsiElement implements PsiJavaPackage {
    public static final PsiJavaPackageStub INSTANCE = new PsiJavaPackageStub();

    @Nullable
    @Override
    public PsiJavaPackage getParentPackage() {
        return null;
    }

    @NotNull
    @Override
    public PsiJavaPackage[] getSubPackages() {
        return new PsiJavaPackage[0];
    }

    @NotNull
    @Override
    public PsiJavaPackage[] getSubPackages(@NotNull GlobalSearchScope scope) {
        return new PsiJavaPackage[0];
    }

    @Override
    public void handleQualifiedNameChange(@NotNull String s) {

    }

    @NotNull
    @Override
    public PsiClass[] getClasses() {
        return new PsiClass[0];
    }

    @NotNull
    @Override
    public PsiClass[] getClasses(@NotNull GlobalSearchScope scope) {
        return new PsiClass[0];
    }

    @NotNull
    @Override
    public PsiFile[] getFiles(@NotNull GlobalSearchScope scope) {
        return new PsiFile[0];
    }

    @Nullable
    @Override
    public PsiModifierList getAnnotationList() {
        return null;
    }

    @Override
    public VirtualFile[] occursInPackagePrefixes() {
        return new VirtualFile[0];
    }

    @Override
    public boolean containsClassNamed(String s) {
        return false;
    }

    @NotNull
    @Override
    public PsiClass[] findClassByShortName(@NotNull String s, @NotNull GlobalSearchScope scope) {
        return new PsiClass[0];
    }

    @Nullable
    @Override
    public PsiModifierList getModifierList() {
        return null;
    }

    @Override
    public boolean hasModifierProperty(@NotNull String s) {
        return false;
    }

    @Override
    public void checkSetName(String s) throws IncorrectOperationException {

    }

    @NotNull
    @Override
    public PsiDirectory[] getDirectories() {
        return new PsiDirectory[0];
    }

    @NotNull
    @Override
    public PsiDirectory[] getDirectories(@NotNull GlobalSearchScope scope) {
        return new PsiDirectory[0];
    }

    @Override
    public PsiElement getParent() {
        return null;
    }

    @Nullable
    @Override
    public String getQualifiedName() {
        return null;
    }
}
