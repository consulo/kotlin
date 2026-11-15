/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Consulo: the part of plugins/scripting/scripting-compiler/.../impl/compilationContext.kt that IDE script sessions use.
// The rest of that file runs the JVM script compiler (KotlinCoreEnvironment), which the IDE does not include.

package org.jetbrains.kotlin.scripting.compiler.plugin.impl

import org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments
import org.jetbrains.kotlin.cli.common.arguments.parseCommandLineArguments

const val SCRIPT_BASE_COMPILER_ARGUMENTS_PROPERTY = "kotlin.script.base.compiler.arguments"

fun makeScriptCompilerArguments(compilerOptions: List<String>): K2JVMCompilerArguments {

    val compilerArguments = K2JVMCompilerArguments()
    val argumentsWithExternalProp =
        (System.getProperty(SCRIPT_BASE_COMPILER_ARGUMENTS_PROPERTY)?.takeIf { it.isNotBlank() }?.split(' ') ?: emptyList()) +
                compilerOptions

    parseCommandLineArguments(argumentsWithExternalProp, compilerArguments)
    return compilerArguments
}
