/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.utils.exceptions

import consulo.application.dumb.IndexNotReadyException
import consulo.util.lang.ControlFlowException

fun shouldIjPlatformExceptionBeRethrown(exception: Throwable): Boolean = when (exception) {
    is ControlFlowException -> true
    is IndexNotReadyException -> true
    else -> false
}