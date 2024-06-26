/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kdoc.psi.impl

import consulo.language.Language
import consulo.language.ast.IElementType
import consulo.language.impl.psi.LazyParseablePsiElement
import org.jetbrains.kotlin.idea2.KotlinLanguage
import org.jetbrains.kotlin.kdoc.lexer.KDocTokens
import org.jetbrains.kotlin.kdoc.parser.KDocKnownTag
import org.jetbrains.kotlin.kdoc.psi.api.KDoc
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtDeclaration
import org.jetbrains.kotlin.psi.psiUtil.getChildOfType
import org.jetbrains.kotlin.psi.psiUtil.getChildrenOfType
import org.jetbrains.kotlin.psi.psiUtil.getParentOfType
import org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly

class KDocImpl(buffer: CharSequence?) : LazyParseablePsiElement(KDocTokens.KDOC, buffer), KDoc {

    override fun getLanguage(): Language = KotlinLanguage.INSTANCE

    override fun toString(): String = node.elementType.toString()

    override fun getTokenType(): IElementType = KtTokens.DOC_COMMENT

    override fun getOwner(): KtDeclaration? = getParentOfType(true)

    override fun getDefaultSection(): KDocSection = getChildOfType()!!

    override fun getAllSections(): List<KDocSection> =
        getChildrenOfType<KDocSection>().toList()

    override fun findSectionByName(name: String): KDocSection? =
        getChildrenOfType<KDocSection>().firstOrNull { it.name == name }

    override fun findSectionByTag(tag: KDocKnownTag): KDocSection? =
        findSectionByName(tag.name.toLowerCaseAsciiOnly())

    override fun findSectionByTag(tag: KDocKnownTag, subjectName: String): KDocSection? =
        getChildrenOfType<KDocSection>().firstOrNull {
            it.name == tag.name.toLowerCaseAsciiOnly() && it.getSubjectName() == subjectName
        }
}
