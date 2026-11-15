/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Consulo: configureScriptDefinitions of ScriptingCompilerConfigurationExtension.kt loads script templates through the
// compiler CLI environment, which the IDE does not include yet; script definitions come from the IDE instead.

package org.jetbrains.kotlin.scripting.compiler.plugin

import org.jetbrains.kotlin.config.CompilerConfiguration
import kotlin.script.experimental.host.ScriptingHostConfiguration

internal fun configureScriptDefinitions(
    configuration: CompilerConfiguration,
    hostConfiguration: ScriptingHostConfiguration,
    classLoader: ClassLoader
) {
}
