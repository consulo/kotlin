/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.resolve.multiplatform

import consulo.util.dataholder.Key
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.UserDataProperty

/**
 * Returns true if this file is a part of the common module in a multi-platform project.
 * This setting only makes sense in the compiler, not in the IDE where sources from common modules are analyzed as common
 */
var KtFile.isCommonSource: Boolean? by UserDataProperty(Key.create("IS_COMMON_SOURCE"))
var KtFile.hmppModuleName: String? by UserDataProperty(Key.create("HMPP_MODULE_NAME"))
