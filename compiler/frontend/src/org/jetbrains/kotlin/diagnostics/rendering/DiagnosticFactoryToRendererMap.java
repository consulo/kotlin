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

package org.jetbrains.kotlin.diagnostics.rendering;

import consulo.language.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.config.LanguageVersion;
import org.jetbrains.kotlin.diagnostics.*;

import java.util.HashMap;
import java.util.Map;

public final class DiagnosticFactoryToRendererMap {
    private final Map<DiagnosticFactory<?>, DiagnosticRenderer<?>> map = new HashMap<>();
    private boolean immutable = false;

    // TO catch EA-75872
    private final String name;
    public DiagnosticFactoryToRendererMap(String name) {
        this.name = name;
    }
    public DiagnosticFactoryToRendererMap() {
        this("<unnamed>");
    }
    @Override
    public String toString() {
        return "DiagnosticFactory#" + name;
    }

    private void checkMutability() {
        if (immutable) {
            throw new IllegalStateException("factory to renderer map is already immutable");
        }
    }

    public <E extends PsiElement> void put(@NotNull DiagnosticFactory0<E> factory, @NotNull String message) {
        checkMutability();
        map.put(factory, new SimpleDiagnosticRenderer(message));
    }

    public <E extends PsiElement, A> void put(@NotNull DiagnosticFactory1<E, A> factory, @NotNull String message, @Nullable DiagnosticParameterRenderer<? super A> rendererA) {
        checkMutability();
        map.put(factory, new DiagnosticWithParameters1Renderer<A>(message, rendererA));
    }

    public <E extends PsiElement, A> void put(@NotNull DiagnosticFactory1<E, A> factory, @NotNull String message, @NotNull MultiRenderer<? super A> rendererA) {
        checkMutability();
        map.put(factory, new DiagnosticWithParametersMultiRenderer<A>(message, rendererA));
    }

    public <E extends PsiElement, A, B> void put(@NotNull DiagnosticFactory2<E, A, B> factory,
            @NotNull String message,
            @Nullable DiagnosticParameterRenderer<? super A> rendererA,
            @Nullable DiagnosticParameterRenderer<? super B> rendererB) {
        checkMutability();
        map.put(factory, new DiagnosticWithParameters2Renderer<A, B>(message, rendererA, rendererB));
    }

    public <E extends PsiElement, A, B, C> void put(@NotNull DiagnosticFactory3<E, A, B, C> factory,
            @NotNull String message,
            @Nullable DiagnosticParameterRenderer<? super A> rendererA,
            @Nullable DiagnosticParameterRenderer<? super B> rendererB,
            @Nullable  DiagnosticParameterRenderer<? super C> rendererC) {
        checkMutability();
        map.put(factory, new DiagnosticWithParameters3Renderer<A, B, C>(message, rendererA, rendererB, rendererC));
    }

    public <E extends PsiElement, A, B, C, D> void put(@NotNull DiagnosticFactory4<E, A, B, C, D> factory,
            @NotNull String message,
            @Nullable DiagnosticParameterRenderer<? super A> rendererA,
            @Nullable DiagnosticParameterRenderer<? super B> rendererB,
            @Nullable  DiagnosticParameterRenderer<? super C> rendererC,
            @Nullable  DiagnosticParameterRenderer<? super D> rendererD) {
        checkMutability();
        map.put(factory, new DiagnosticWithParameters4Renderer<A, B, C, D>(message, rendererA, rendererB, rendererC, rendererD));
    }

    public void put(@NotNull DiagnosticFactory<?> factory, @NotNull DiagnosticRenderer<?> renderer) {
        checkMutability();
        map.put(factory, renderer);
    }

    public <E extends PsiElement> void put(@NotNull DiagnosticFactoryForDeprecation0<E> factory, @NotNull String message) {
        checkMutability();
        map.put(factory.getErrorFactory(), new SimpleDiagnosticRenderer(message));
        map.put(factory.getWarningFactory(), new SimpleDiagnosticRenderer(deprecationMessage(factory, message)));
    }

    public <E extends PsiElement, A> void put(@NotNull DiagnosticFactoryForDeprecation1<E, A> factory, @NotNull String message, @Nullable DiagnosticParameterRenderer<? super A> rendererA) {
        checkMutability();
        map.put(factory.getErrorFactory(), new DiagnosticWithParameters1Renderer<A>(message, rendererA));
        map.put(factory.getWarningFactory(), new DiagnosticWithParameters1Renderer<A>(deprecationMessage(factory, message), rendererA));
    }

    public <E extends PsiElement, A> void put(@NotNull DiagnosticFactoryForDeprecation1<E, A> factory, @NotNull String message, @NotNull MultiRenderer<? super A> rendererA) {
        checkMutability();
        map.put(factory.getErrorFactory(), new DiagnosticWithParametersMultiRenderer<A>(message, rendererA));
        map.put(factory.getWarningFactory(), new DiagnosticWithParametersMultiRenderer<A>(deprecationMessage(factory, message), rendererA));
    }

    public <E extends PsiElement, A, B> void put(@NotNull DiagnosticFactoryForDeprecation2<E, A, B> factory,
            @NotNull String message,
            @Nullable DiagnosticParameterRenderer<? super A> rendererA,
            @Nullable DiagnosticParameterRenderer<? super B> rendererB) {
        checkMutability();
        map.put(factory.getErrorFactory(), new DiagnosticWithParameters2Renderer<A, B>(message, rendererA, rendererB));
        map.put(factory.getWarningFactory(), new DiagnosticWithParameters2Renderer<A, B>(deprecationMessage(factory, message), rendererA, rendererB));
    }

    public <E extends PsiElement, A, B, C> void put(@NotNull DiagnosticFactoryForDeprecation3<E, A, B, C> factory,
            @NotNull String message,
            @Nullable DiagnosticParameterRenderer<? super A> rendererA,
            @Nullable DiagnosticParameterRenderer<? super B> rendererB,
            @Nullable  DiagnosticParameterRenderer<? super C> rendererC) {
        checkMutability();
        map.put(factory.getErrorFactory(), new DiagnosticWithParameters3Renderer<A, B, C>(message, rendererA, rendererB, rendererC));
        map.put(factory.getWarningFactory(), new DiagnosticWithParameters3Renderer<A, B, C>(deprecationMessage(factory, message), rendererA, rendererB, rendererC));
    }

    public <E extends PsiElement, A, B, C, D> void put(@NotNull DiagnosticFactoryForDeprecation4<E, A, B, C, D> factory,
            @NotNull String message,
            @Nullable DiagnosticParameterRenderer<? super A> rendererA,
            @Nullable DiagnosticParameterRenderer<? super B> rendererB,
            @Nullable  DiagnosticParameterRenderer<? super C> rendererC,
            @Nullable  DiagnosticParameterRenderer<? super D> rendererD) {
        checkMutability();
        map.put(factory.getErrorFactory(), new DiagnosticWithParameters4Renderer<A, B, C, D>(message, rendererA, rendererB, rendererC, rendererD));
        map.put(factory.getWarningFactory(), new DiagnosticWithParameters4Renderer<A, B, C, D>(deprecationMessage(factory, message), rendererA, rendererB, rendererC, rendererD));
    }

    private static String deprecationMessage(DiagnosticFactoryForDeprecation<?, ?, ?> factory, String errorMessage) {
        LanguageVersion sinceVersion = factory.getDeprecatingFeature().getSinceVersion();
        StringBuilder builder = new StringBuilder();
        builder.append(errorMessage).append(". This will become an error");
        if (sinceVersion != null) {
            builder.append(" in Kotlin ").append(sinceVersion.getVersionString());
        } else {
            builder.append(" in a future release");
        }
        return builder.toString();
    }

    @Nullable
    public DiagnosticRenderer<?> get(@NotNull DiagnosticFactory<?> factory) {
        return map.get(factory);
    }

    public void setImmutable() {
        immutable = false;
    }
}
