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

package org.jetbrains.kotlin.psi;

import consulo.language.ast.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.KtNodeTypes;
import org.jetbrains.kotlin.lexer.KtTokens;

public class KtIsExpression extends KtExpressionImpl implements KtOperationExpression {
    public KtIsExpression(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public <R, D> R accept(@NotNull KtVisitor<R, D> visitor, D data) {
        return visitor.visitIsExpression(this, data);
    }

    @NotNull
    public KtExpression getLeftHandSide() {
        return findChildByClass(KtExpression.class);
    }

    @Nullable @IfNotParsed
    public KtTypeReference getTypeReference() {
        return (KtTypeReference) findChildByType(KtNodeTypes.TYPE_REFERENCE);
    }

    @Override
    @NotNull
    public KtSimpleNameExpression getOperationReference() {
        return (KtSimpleNameExpression) findChildByType(KtNodeTypes.OPERATION_REFERENCE);
    }

    public boolean isNegated() {
        return getOperationReference().getReferencedNameElementType() == KtTokens.NOT_IS;
    }

}
