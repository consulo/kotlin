/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.stubs

import consulo.language.psi.stub.StubElement
import consulo.language.psi.stub.StubInputStream
import consulo.language.psi.stub.StubOutputStream
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.psi.KtClassLikeDeclaration
import org.jetbrains.kotlin.psi.KtEnumEntry
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes

object StubUtils {
    @JvmStatic
    fun deserializeClassId(dataStream: StubInputStream): ClassId? {
        val classId = dataStream.readName() ?: return null
        return ClassId.fromString(classId.string)
    }

    @JvmStatic
    fun serializeClassId(dataStream: StubOutputStream, classId: ClassId?) {
        dataStream.writeName(classId?.asString())
    }

    @JvmStatic
    fun createNestedClassId(parentStub: StubElement<*>, currentDeclaration: KtClassLikeDeclaration): ClassId? = when {
        parentStub is KotlinFileStub -> ClassId(parentStub.getPackageFqName(), currentDeclaration.nameAsSafeName)
        parentStub is KotlinScriptStub -> createNestedClassId(parentStub.parentStub, currentDeclaration)
        parentStub is KotlinPlaceHolderStub<*> && parentStub.stubType == KtStubElementTypes.CLASS_BODY -> {
            val containingClassStub = parentStub.parentStub as? KotlinClassifierStub
            if (containingClassStub != null && currentDeclaration !is KtEnumEntry) {
                containingClassStub.getClassId()?.createNestedClassId(currentDeclaration.nameAsSafeName)
            } else {
                null
            }
        }
        else -> null
    }
}
