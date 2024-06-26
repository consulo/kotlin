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

import consulo.language.ast.IElementType;

public abstract class AbstractTokenStreamPattern implements TokenStreamPattern {

    protected int lastOccurrence = -1;

    protected void fail() {
        lastOccurrence = -1;
    }

    @Override
    public int result() {
        return lastOccurrence;
    }

    @Override
    public boolean isTopLevel(int openAngleBrackets, int openBrackets, int openBraces, int openParentheses) {
        return openBraces == 0 && openBrackets == 0 && openParentheses == 0 && openAngleBrackets == 0;
    }

    @Override
    public boolean handleUnmatchedClosing(IElementType token) {
        return false;
    }

    public void reset() {
        lastOccurrence = -1;
    }
}

