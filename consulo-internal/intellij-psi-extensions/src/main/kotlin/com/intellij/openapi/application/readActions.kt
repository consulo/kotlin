package com.intellij.openapi.application

import com.intellij.openapi.util.Computable

/** Matches IntelliJ's runReadAction { }: [action] in a read action. */
fun <T> runReadAction(action: () -> T): T = ApplicationManager.getApplication().runReadAction(Computable { action() })
