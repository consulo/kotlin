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

package org.jetbrains.kotlin.kdoc.lexer;

import consulo.language.ast.TokenSet;
import consulo.language.lexer.FlexAdapter;
import consulo.language.lexer.MergingLexerAdapter;

import java.io.Reader;

public class KDocLexer extends MergingLexerAdapter {
    private static final TokenSet KDOC_TOKENS = TokenSet.create(KDocTokens.TEXT, KDocTokens.CODE_BLOCK_TEXT);

    public KDocLexer() {
        super(
                new FlexAdapter(
                        new _KDocLexer((Reader) null)
                ),
                KDOC_TOKENS
        );
    }
}
