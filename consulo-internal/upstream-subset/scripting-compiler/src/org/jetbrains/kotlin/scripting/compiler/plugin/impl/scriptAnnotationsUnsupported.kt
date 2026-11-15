/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Consulo: script annotation resolution (@file:DependsOn and the like) builds a compiler session on the JVM CLI environment
// (psiScriptAnnotationsCollector.kt, sessionUtils.kt, ScriptJvmK2CompilerImpl.kt), which the IDE does not include yet.
// These declarations stand in for the ones script services reach; they fail when a script needs annotation refinement.

package org.jetbrains.kotlin.scripting.compiler.plugin.impl

import org.jetbrains.kotlin.diagnostics.impl.BaseDiagnosticsCollector
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.FirFile
import org.jetbrains.kotlin.psi.KtFile
import java.io.File
import kotlin.script.experimental.api.ResultWithDiagnostics
import kotlin.script.experimental.api.ScriptCollectedData
import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.SourceCode
import kotlin.script.experimental.host.ScriptingHostConfiguration

private fun unsupported(): Nothing =
    throw UnsupportedOperationException("Kotlin script annotation resolution is not supported in Consulo yet")

class PsiScriptAnnotationsCollector(
    @Suppress("unused") private val getRegularClasspath: (KtFile) -> List<File> = { emptyList() },
) {
    fun collectAnnotations(
        scriptFile: KtFile,
        compilationConfiguration: ScriptCompilationConfiguration,
        hostConfiguration: ScriptingHostConfiguration,
    ): ResultWithDiagnostics<ScriptCollectedData> = unsupported()
}

fun SourceCode.convertToFirViaPsi(session: FirSession, diagnosticsReporter: BaseDiagnosticsCollector): FirFile = unsupported()

fun SourceCode.convertToFirViaLightTree(session: FirSession, diagnosticsReporter: BaseDiagnosticsCollector): FirFile = unsupported()

internal fun createScriptAnnotationResolutionSession(
    contextSession: FirSession,
    hostConfiguration: ScriptingHostConfiguration,
): FirSession = unsupported()
