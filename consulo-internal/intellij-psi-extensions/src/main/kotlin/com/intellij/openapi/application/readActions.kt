package com.intellij.openapi.application

import com.intellij.openapi.util.Computable

/** Matches IntelliJ's runReadAction { }: [action] in a read action. */
fun <T> runReadAction(action: () -> T): T = ApplicationManager.getApplication().runReadAction(Computable { action() })

/**
 * Matches IntelliJ's suspending readAction { }: [action] in a read action. Consulo has no suspending read actions, so it
 * runs right away.
 */
suspend fun <T> readAction(action: () -> T): T = runReadAction(action)

/** Matches IntelliJ's runReadActionBlocking { }: [action] in a read action. */
fun <T> runReadActionBlocking(action: () -> T): T = runReadAction(action)

/** Matches IntelliJ's runWriteAction { }: [action] in a write action. */
fun <T> runWriteAction(action: () -> T): T = ApplicationManager.getApplication().runWriteAction(Computable { action() })
