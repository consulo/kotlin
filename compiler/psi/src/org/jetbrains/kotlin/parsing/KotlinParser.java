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

package org.jetbrains.kotlin.parsing;

import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.parser.PsiBuilder;
import consulo.language.parser.PsiParser;
import consulo.language.psi.PsiFile;
import consulo.language.version.LanguageVersion;
import consulo.util.io.FileUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.idea2.KotlinFileType;

public class KotlinParser implements PsiParser {


    public KotlinParser() {
    }

    @Override
    @NotNull
    public ASTNode parse(@NotNull IElementType iElementType, @NotNull PsiBuilder psiBuilder, @NotNull LanguageVersion languageVersion) {
        throw new IllegalStateException("use another parse");
    }

    // we need this method because we need psiFile
    @NotNull
    public static ASTNode parse(PsiBuilder psiBuilder, PsiFile psiFile) {
        KotlinParsing ktParsing = KotlinParsing.createForTopLevel(new SemanticWhitespaceAwarePsiBuilderImpl(psiBuilder));
        String extension = FileUtil.getExtension(psiFile.getName());
        if (extension.isEmpty() || extension.equals(KotlinFileType.EXTENSION) || isCompiledFile(psiFile)) {
            ktParsing.parseFile();
        }
        else {
            ktParsing.parseScript();
        }
        return psiBuilder.getTreeBuilt();
    }

    @SuppressWarnings({"deprecation", "UnnecessaryFullyQualifiedName"})
    private static boolean isCompiledFile(PsiFile psiFile) {
        //avoid loading KtFile which depends on java psi, which is not available in some setup
        //e.g. remote dev https://youtrack.jetbrains.com/issue/GTW-7554
        return psiFile instanceof org.jetbrains.kotlin.psi.KtCommonFile && ((org.jetbrains.kotlin.psi.KtCommonFile) psiFile).isCompiled();
    }

    @NotNull
    public static ASTNode parseTypeCodeFragment(PsiBuilder psiBuilder) {
        KotlinParsing ktParsing = KotlinParsing.createForTopLevel(new SemanticWhitespaceAwarePsiBuilderImpl(psiBuilder));
        ktParsing.parseTypeCodeFragment();
        return psiBuilder.getTreeBuilt();
    }

    @NotNull
    public static ASTNode parseExpressionCodeFragment(PsiBuilder psiBuilder) {
        KotlinParsing ktParsing = KotlinParsing.createForTopLevel(new SemanticWhitespaceAwarePsiBuilderImpl(psiBuilder));
        ktParsing.parseExpressionCodeFragment();
        return psiBuilder.getTreeBuilt();
    }

    @NotNull
    public static ASTNode parseBlockCodeFragment(PsiBuilder psiBuilder) {
        KotlinParsing ktParsing = KotlinParsing.createForTopLevel(new SemanticWhitespaceAwarePsiBuilderImpl(psiBuilder));
        ktParsing.parseBlockCodeFragment();
        return psiBuilder.getTreeBuilt();
    }

    @NotNull
    public static ASTNode parseLambdaExpression(PsiBuilder psiBuilder) {
        KotlinParsing ktParsing = KotlinParsing.createForTopLevel(new SemanticWhitespaceAwarePsiBuilderImpl(psiBuilder));
        ktParsing.parseLambdaExpression();
        return psiBuilder.getTreeBuilt();
    }

    @NotNull
    public static ASTNode parseBlockExpression(PsiBuilder psiBuilder) {
        KotlinParsing ktParsing = KotlinParsing.createForTopLevel(new SemanticWhitespaceAwarePsiBuilderImpl(psiBuilder));
        ktParsing.parseBlockExpression();
        return psiBuilder.getTreeBuilt();
    }
}
