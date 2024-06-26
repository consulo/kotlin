/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.resolve.jvm.jvmSignature

import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import consulo.internal.org.objectweb.asm.commons.Method

interface KotlinToJvmSignatureMapper {
    fun mapToJvmMethodSignature(function: FunctionDescriptor): Method
}

fun erasedSignaturesEqualIgnoringReturnTypes(subFunction: Method, superFunction: Method) =
        subFunction.parametersDescriptor() == superFunction.parametersDescriptor()

private fun Method.parametersDescriptor() = descriptor.substring(1, descriptor.lastIndexOf(")"))
