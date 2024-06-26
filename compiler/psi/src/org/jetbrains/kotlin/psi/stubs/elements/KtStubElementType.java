/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.stubs.elements;

import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElement;
import consulo.language.psi.stub.IStubElementType;
import consulo.language.psi.stub.IStubFileElementType;
import consulo.language.psi.stub.IndexSink;
import consulo.language.psi.stub.StubElement;
import consulo.util.collection.ArrayFactory;
import consulo.util.lang.reflect.ReflectionUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.idea2.KotlinLanguage;
import org.jetbrains.kotlin.psi.KtClassOrObject;
import org.jetbrains.kotlin.psi.KtElementImplStub;
import org.jetbrains.kotlin.psi.KtFunction;
import org.jetbrains.kotlin.psi.KtProperty;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

public abstract class KtStubElementType<StubT extends StubElement<?>, PsiT extends KtElementImplStub<?>> extends IStubElementType<StubT, PsiT> {

    @NotNull
    private final Constructor<PsiT> byNodeConstructor;
    @NotNull
    private final Constructor<PsiT> byStubConstructor;
    @NotNull
    private final PsiT[] emptyArray;
    @NotNull
    private final ArrayFactory<PsiT> arrayFactory;

    @SuppressWarnings("unchecked")
    public KtStubElementType(@NotNull @NonNls String debugName, @NotNull Class<PsiT> psiClass, @NotNull Class<?> stubClass) {
        super(debugName, KotlinLanguage.INSTANCE);
        try {
            byNodeConstructor = psiClass.getConstructor(ASTNode.class);
            byStubConstructor = psiClass.getConstructor(stubClass);
        }
        catch (NoSuchMethodException e) {
            throw new RuntimeException("Stub element type declaration for " + psiClass.getSimpleName() + " is missing required constructors",e);
        }
        emptyArray = (PsiT[]) Array.newInstance(psiClass, 0);
        arrayFactory = count -> {
            if (count == 0) {
                return emptyArray;
            }
            return (PsiT[]) Array.newInstance(psiClass, count);
        };
    }

    @NotNull
    public PsiT createPsiFromAst(@NotNull ASTNode node) {
        return ReflectionUtil.createInstance(byNodeConstructor, node);
    }

    @Override
    @NotNull
    public PsiT createPsi(@NotNull StubT stub) {
        return ReflectionUtil.createInstance(byStubConstructor, stub);
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "kotlin." + super.toString();
    }

    @Override
    public boolean shouldCreateStub(ASTNode node) {
        PsiElement psi = node.getPsi();
        if (psi instanceof KtClassOrObject || psi instanceof KtFunction) {
            return true;
        }
        if (psi instanceof KtProperty) {
            return !((KtProperty) psi).isLocal();
        }
        return createStubDependingOnParent(node);
    }

    private static boolean createStubDependingOnParent(ASTNode node) {
        ASTNode parent = node.getTreeParent();
        IElementType parentType = parent.getElementType();
        if (parentType instanceof IStubElementType) {
            return ((IStubElementType) parentType).shouldCreateStub(parent);
        }
        if (parentType instanceof IStubFileElementType) {
            return true;
        }
        return false;
    }

    @Override
    public void indexStub(@NotNull StubT stub, @NotNull IndexSink sink) {
        // do not force inheritors to implement this method
    }

    @NotNull
    public ArrayFactory<PsiT> getArrayFactory() {
        return arrayFactory;
    }
}
