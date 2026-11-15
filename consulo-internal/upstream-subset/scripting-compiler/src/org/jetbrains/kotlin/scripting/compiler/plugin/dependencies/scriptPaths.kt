/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Consulo: from ScriptsCompilationDependencies.kt, whose script dependency collection needs the compiler CLI environment.

package org.jetbrains.kotlin.scripting.compiler.plugin.dependencies

internal fun String.toSystemIndependentScriptPath(): String = replace('\\', '/')
