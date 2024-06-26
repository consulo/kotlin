/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.plugin.internal

import org.gradle.api.Project
import org.gradle.api.invocation.Gradle

internal class ConfigurationCacheStartParameterAccessorG81(
    private val gradle: Gradle,
) : ConfigurationCacheStartParameterAccessor {
    override val isConfigurationCacheRequested: Boolean by lazy {
        gradle.startParameter.isConfigurationCacheRequested
    }

    internal class Factory : ConfigurationCacheStartParameterAccessor.Factory {
        override fun getInstance(project: Project) = ConfigurationCacheStartParameterAccessorG81(project.gradle)
    }
}