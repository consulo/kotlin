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

package org.jetbrains.kotlin.diagnostics;

import consulo.document.util.TextRange;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public abstract class AbstractDiagnostic<E extends PsiElement> implements ParametrizedDiagnostic<E> {
    private final E psiElement;
    private final DiagnosticFactoryWithPsiElement<E, ?> factory;
    private final Severity severity;

    public AbstractDiagnostic(@NotNull E psiElement,
            @NotNull DiagnosticFactoryWithPsiElement<E, ?> factory,
            @NotNull Severity severity) {
        this.psiElement = psiElement;
        this.factory = factory;
        this.severity = severity;
    }

    @NotNull
    @Override
    public DiagnosticFactoryWithPsiElement<E, ?> getFactory() {
        return factory;
    }

    @NotNull
    @Override
    public PsiFile getPsiFile() {
        return psiElement.getContainingFile();
    }

    @NotNull
    @Override
    public Severity getSeverity() {
        return severity;
    }

    @Override
    @NotNull
    public E getPsiElement() {
        return psiElement;
    }

    @Override
    @NotNull
    public List<TextRange> getTextRanges() {
        return getFactory().getTextRanges(this);
    }

    @Override
    public boolean isValid() {
        if (!getFactory().isValid(this)) return false;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDiagnostic<?> that = (AbstractDiagnostic<?>) o;
        return Objects.equals(psiElement, that.psiElement) &&
               Objects.equals(factory, that.factory) &&
               severity == that.severity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(psiElement, factory, severity);
    }
}
