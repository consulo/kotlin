/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analyzer

import consulo.component.util.ModificationTracker
import consulo.project.Project
import org.jetbrains.kotlin.psi.KtFile

open class KotlinModificationTrackerService {
    open val modificationTracker: ModificationTracker = ModificationTracker.NEVER_CHANGED
    open val outOfBlockModificationTracker: ModificationTracker = ModificationTracker.NEVER_CHANGED
    open fun fileModificationTracker(file: KtFile): ModificationTracker = ModificationTracker.NEVER_CHANGED

    companion object {
        private val NEVER_CHANGE_TRACKER_SERVICE = KotlinModificationTrackerService()

        @JvmStatic
        fun getInstance(project: Project): KotlinModificationTrackerService {
            return project.getInstance(KotlinModificationTrackerService::class.java) ?: NEVER_CHANGE_TRACKER_SERVICE
        }
    }
}