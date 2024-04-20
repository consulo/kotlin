/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.asJava.classes

import com.intellij.java.language.impl.psi.impl.PsiClassImplUtil
import com.intellij.java.language.impl.psi.impl.light.AbstractLightClass
import com.intellij.java.language.psi.PsiField
import com.intellij.java.language.psi.PsiMethod
import consulo.language.psi.PsiElement
import consulo.language.psi.PsiManager
import consulo.navigation.ItemPresentationProvider
import org.jetbrains.kotlin.analyzer.KotlinModificationTrackerService
import org.jetbrains.kotlin.idea2.KotlinLanguage

abstract class KtLightClassBase protected constructor(
    manager: PsiManager
) : AbstractLightClass(manager, KotlinLanguage.INSTANCE), KtExtensibleLightClass {
    private val myInnersCache by lazyPub {
        KotlinClassInnerStuffCache(
            myClass = this,
            dependencies = cacheDependencies(),
            lazyCreator = LightClassesLazyCreator(project)
        )
    }

    protected open fun cacheDependencies(): List<Any> = listOf(
        KotlinModificationTrackerService.getInstance(manager.project).outOfBlockModificationTracker
    )

    override fun getDelegate() =
        throw UnsupportedOperationException("Cls delegate shouldn't be loaded for ultra-light classes!")

    override fun getFields() = myInnersCache.fields

    override fun getMethods() = myInnersCache.methods

    override fun getConstructors() = myInnersCache.constructors

    override fun getInnerClasses() = myInnersCache.innerClasses

    override fun getAllFields() = PsiClassImplUtil.getAllFields(this)

    override fun getAllMethods() = PsiClassImplUtil.getAllMethods(this)

    override fun getAllInnerClasses() = PsiClassImplUtil.getAllInnerClasses(this)

    override fun findFieldByName(name: String, checkBases: Boolean) = myInnersCache.findFieldByName(name, checkBases)

    override fun findMethodsByName(name: String, checkBases: Boolean) = myInnersCache.findMethodsByName(name, checkBases)

    override fun findInnerClassByName(name: String, checkBases: Boolean) = myInnersCache.findInnerClassByName(name, checkBases)

    abstract override fun getOwnFields(): List<PsiField>
    abstract override fun getOwnMethods(): List<PsiMethod>

    override fun getText(): String = kotlinOrigin?.text ?: ""

    override fun getLanguage() = KotlinLanguage.INSTANCE

    override fun getPresentation() = ItemPresentationProvider.getItemPresentation(this)

    abstract override fun equals(other: Any?): Boolean

    abstract override fun hashCode(): Int

    override fun getContext() = parent

    override fun isEquivalentTo(another: PsiElement?): Boolean {
        return PsiClassImplUtil.isClassEquivalentTo(this, another)
    }
}
