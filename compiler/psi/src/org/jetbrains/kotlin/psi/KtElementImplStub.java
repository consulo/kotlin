/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi;

import consulo.language.Language;
import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.PsiFileImpl;
import consulo.language.impl.psi.stub.StubBasedPsiElementBase;
import consulo.language.psi.*;
import consulo.language.psi.stub.IStubElementType;
import consulo.language.psi.stub.StubElement;
import consulo.language.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.idea2.KotlinLanguage;
import org.jetbrains.kotlin.psi.psiUtil.KtPsiUtilKt;
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementType;

import java.util.Arrays;
import java.util.List;

public class KtElementImplStub<T extends StubElement<?>> extends StubBasedPsiElementBase<T>
        implements KtElement, StubBasedPsiElement<T> {
    public KtElementImplStub(@NotNull T stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
    }

    public KtElementImplStub(@NotNull ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public Language getLanguage() {
        return KotlinLanguage.INSTANCE;
    }

    @Override
    public String toString() {
        return getElementType().toString();
    }

    @Override
    @SuppressWarnings("unchecked")
    public final void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof KtVisitor) {
            accept((KtVisitor) visitor, null);
        }
        else {
            visitor.visitElement(this);
        }
    }

    @NotNull
    @Override
    public KtFile getContainingKtFile() {
        PsiFile file = getContainingFile();
        if (!(file instanceof KtFile)) {
            // KtElementImpl.copy() might be the reason for this exception
            String fileString = "";
            if (file.isValid()) {
                try {
                    fileString = " " + file.getText();
                }
                catch (Exception e) {
                    // ignore when failed to get file text
                }
            }
            // getNode() will fail if getContainingFile() returns not PsiFileImpl instance
            String nodeString = (file instanceof PsiFileImpl ? (" node = " + getNode()) : "");

            throw new IllegalStateException("KtElement not inside KtFile: " +
                                            file + fileString + " of type " + file.getClass() +
                                            " for element " + this + " of type " + this.getClass() + nodeString);
        }
        return (KtFile) file;
    }

    @Override
    public <D> void acceptChildren(@NotNull KtVisitor<Void, D> visitor, D data) {
        PsiElement child = getFirstChild();
        while (child != null) {
            if (child instanceof KtElement) {
                ((KtElement) child).accept(visitor, data);
            }
            child = child.getNextSibling();
        }
    }

    @Override
    public <R, D> R accept(@NotNull KtVisitor<R, D> visitor, D data) {
        return visitor.visitKtElement(this, data);
    }

    @Override
    public void delete() throws IncorrectOperationException {
        KtElementUtilsKt.deleteSemicolon(this);
        super.delete();
    }

    @Override
    @SuppressWarnings("deprecation")
    public PsiReference getReference() {
        PsiReference[] references = getReferences();
        return (references.length > 0) ? references[0] : null;
    }

    @NotNull
    @Override
    public PsiReference[] getReferences() {
        return KotlinReferenceProvidersService.getReferencesFromProviders(this);
    }

    @NotNull
    protected <PsiT extends KtElementImplStub<?>, StubT extends StubElement<?>> List<PsiT> getStubOrPsiChildrenAsList(
            @NotNull KtStubElementType<StubT, PsiT> elementType
    ) {
        return Arrays.asList(getStubOrPsiChildren(elementType, elementType.getArrayFactory()));
    }

    @NotNull
    @Override
    public KtElement getPsiOrParent() {
        return this;
    }

    @Override
    public PsiElement getParent() {
        PsiElement substitute = KtPsiUtilKt.getParentSubstitute(this);
        return substitute != null ? substitute : super.getParent();
    }
}
