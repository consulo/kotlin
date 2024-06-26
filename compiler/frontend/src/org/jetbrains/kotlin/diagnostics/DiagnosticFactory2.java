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

import consulo.language.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class DiagnosticFactory2<E extends PsiElement, A, B> extends DiagnosticFactoryWithPsiElement<E, DiagnosticWithParameters2<E, A, B>> {

    @NotNull
    public ParametrizedDiagnostic<E> on(@NotNull E element, @NotNull A a, @NotNull B b) {
        return new DiagnosticWithParameters2<>(element, a, b, this, getSeverity());
    }

    private DiagnosticFactory2(Severity severity, PositioningStrategy<? super E> positioningStrategy) {
        super(severity, positioningStrategy);
    }

    @NotNull
    public static <T extends PsiElement, A, B> DiagnosticFactory2<T, A, B> create(Severity severity, PositioningStrategy<? super T> positioningStrategy) {
        return new DiagnosticFactory2<>(severity, positioningStrategy);
    }

    @NotNull
    public static <T extends PsiElement, A, B> DiagnosticFactory2<T, A, B> create(Severity severity) {
        return new DiagnosticFactory2<>(severity, PositioningStrategies.DEFAULT);
    }

}
