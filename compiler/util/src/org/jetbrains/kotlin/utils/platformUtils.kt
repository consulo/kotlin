/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.utils

import consulo.util.collection.MultiMap
import consulo.util.interner.Interner

fun createStringInterner(): Interner<String> =
    Interner.createStringInterner()

fun <K, V> createConcurrentMultiMap(): MultiMap<K, V> =
    MultiMap.createConcurrent<K, V>()
