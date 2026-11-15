package com.intellij.diagnostic

import com.intellij.openapi.diagnostic.ControlFlowException
import com.intellij.openapi.progress.ProcessCanceledException

/** Matches IntelliJ's rethrowControlFlowException(): control-flow exceptions (e.g. cancellation) must not be swallowed. */
fun rethrowControlFlowException(e: Throwable) {
    if (e is ControlFlowException || e is ProcessCanceledException) throw e
}
