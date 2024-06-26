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

package org.jetbrains.kotlin.psi

import com.intellij.java.language.psi.JavaCodeFragment
import com.intellij.java.language.psi.JavaCodeFragment.VisibilityChecker
import com.intellij.java.language.psi.PsiType
import consulo.annotation.component.ComponentScope
import consulo.annotation.component.TopicAPI
import consulo.annotation.component.TopicBroadcastDirection
import consulo.language.ast.IElementType
import consulo.language.ast.TokenType
import consulo.language.file.light.LightVirtualFile
import consulo.language.impl.ast.FileElement
import consulo.language.impl.file.SingleRootFileViewProvider
import consulo.language.impl.internal.psi.PsiManagerEx
import consulo.language.psi.PsiElement
import consulo.language.psi.PsiFile
import consulo.language.psi.PsiManager
import consulo.language.psi.scope.GlobalSearchScope
import consulo.logging.Logger
import consulo.project.Project
import consulo.util.dataholder.Key
import org.jetbrains.kotlin.idea2.KotlinFileType
import org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext

abstract class KtCodeFragment(
    private val myProject: Project,
    name: String,
    text: CharSequence,
    imports: String?, // Should be separated by KtCodeFragment.IMPORT_SEPARATOR
    elementType: IElementType,
    private val context: PsiElement?
) : KtFile(
    run {
        val psiManager = PsiManager.getInstance(myProject) as PsiManagerEx
        psiManager.fileManager.createFileViewProvider(LightVirtualFile(name, KotlinFileType.INSTANCE, text), true)
    }, false
), KtCodeFragmentBase {
    private var viewProvider = super.getViewProvider() as SingleRootFileViewProvider
    private val importDirectiveStrings = LinkedHashSet<String>()

    private val fakeContextForJavaFile: PsiElement? by lazy {
        this.getCopyableUserData(FAKE_CONTEXT_FOR_JAVA_FILE)?.invoke()
    }

    init {
        @Suppress("LeakingThis")
        getViewProvider().forceCachedPsi(this)
        init(TokenType.CODE_FRAGMENT, elementType)

        if (imports != null) {
            appendImports(imports)
        }
    }

    final override fun init(elementType: IElementType, contentElementType: IElementType?) {
        super.init(elementType, contentElementType)
    }

    private var resolveScope: GlobalSearchScope? = null
    private var thisType: PsiType? = null
    private var superType: PsiType? = null
    private var exceptionHandler: JavaCodeFragment.ExceptionHandler? = null
    private var isPhysical = true

    abstract fun getContentElement(): KtElement?

    override fun forceResolveScope(scope: GlobalSearchScope?) {
        resolveScope = scope
    }

    override fun getForcedResolveScope() = resolveScope

    override fun isPhysical() = isPhysical

    override fun isValid() = true

    override fun getContext(): PsiElement? {
        if (fakeContextForJavaFile != null) return fakeContextForJavaFile
        if (context != null && context !is KtElement) {
            val logInfoForContextElement = (context as? PsiFile)?.virtualFile?.path ?: context.getElementTextWithContext()
            LOG.warn("CodeFragment with non-kotlin context should have fakeContextForJavaFile set: \noriginalContext = $logInfoForContextElement")
            return null
        }

        return context
    }

    override fun getResolveScope() = context?.resolveScope ?: super.getResolveScope()

    override fun clone(): KtCodeFragment {
        val elementClone = calcTreeElement().clone() as FileElement

        return (cloneImpl(elementClone) as KtCodeFragment).apply {
            isPhysical = false
            myOriginalFile = this@KtCodeFragment
            importDirectiveStrings.clear()
            importDirectiveStrings.addAll(this@KtCodeFragment.importDirectiveStrings)
            viewProvider = SingleRootFileViewProvider(
                PsiManager.getInstance(myProject),
                LightVirtualFile(name, KotlinFileType.INSTANCE, text),
                false
            )
            viewProvider.forceCachedPsi(this)
        }
    }

    final override fun getViewProvider() = viewProvider

    override fun getThisType() = thisType

    override fun setThisType(psiType: PsiType?) {
        thisType = psiType
    }

    override fun getSuperType() = superType

    override fun setSuperType(superType: PsiType?) {
        this.superType = superType
    }

    override fun importsToString(): String {
        return importDirectiveStrings.joinToString(IMPORT_SEPARATOR)
    }

    override fun addImportsFromString(imports: String?) {
        if (imports != null && appendImports(imports)) {
            // For K1: This forces the code fragment to be re-highlighted.
            add(KtPsiFactory(project).createColon()).delete()

            // Increment the modification stamp
            clearCaches()

            if (viewProvider.isEventSystemEnabled) {
                project.messageBus.syncPublisher(IMPORT_MODIFICATION).onCodeFragmentImportsModification(this)
            }
        }
    }

    @Deprecated("Use 'addImportsFromString()' instead", ReplaceWith("addImportsFromString(import)"), level = DeprecationLevel.WARNING)
    fun addImport(import: String) {
        addImportsFromString(import)
    }

    /**
     * Parses raw [rawImports] and appends them to the list of code fragment imports.
     *
     * Import strings must be separated by the [IMPORT_SEPARATOR].
     * Each import must be either a qualified name to import (e.g., 'foo.bar'), or a complete text representation of an import directive
     * (e.g., 'import foo.bar as baz').
     *
     * Note that already present import directives will be ignored.
     *
     * @return `true` if new import directives were added.
     */
    private fun appendImports(rawImports: String): Boolean {
        if (rawImports.isEmpty()) {
            return false
        }

        var hasNewImports = false

        for (rawImport in rawImports.split(IMPORT_SEPARATOR)) {
            val importDirectiveString = if (rawImport.startsWith("import ")) rawImport else "import $rawImport"
            if (importDirectiveStrings.add(importDirectiveString) && !hasNewImports) {
                hasNewImports = true
            }
        }

        return hasNewImports
    }

    fun importsAsImportList(): KtImportList? {
        if (importDirectiveStrings.isNotEmpty() && context != null) {
            val ktPsiFactory = KtPsiFactory.contextual(context)
            val fileText = importDirectiveStrings.joinToString("\n")
            return ktPsiFactory.createFile("imports_for_codeFragment.kt", fileText).importList
        }

        return null
    }

    override val importLists: List<KtImportList>
        get() = listOfNotNull(importsAsImportList())

    override val importDirectives: List<KtImportDirective>
        get() = importsAsImportList()?.imports ?: emptyList()

    override fun setVisibilityChecker(checker: VisibilityChecker?) {}

    override fun getVisibilityChecker(): VisibilityChecker = VisibilityChecker.EVERYTHING_VISIBLE

    override fun setExceptionHandler(checker: JavaCodeFragment.ExceptionHandler?) {
        exceptionHandler = checker
    }

    override fun getExceptionHandler() = exceptionHandler

    fun getContextContainingFile(): KtFile? {
        return getOriginalContext()?.takeIf { it.isValid }?.containingKtFile
    }

    fun getOriginalContext(): KtElement? {
        val contextElement = getContext() as? KtElement
        val contextFile = contextElement?.containingFile as? KtFile
        if (contextFile is KtCodeFragment) {
            return contextFile.getOriginalContext()
        }
        return contextElement
    }

    companion object {
        const val IMPORT_SEPARATOR: String = ","

        @Suppress("UnstableApiUsage")
        val IMPORT_MODIFICATION: Class<KotlinCodeFragmentImportModificationListener> = KotlinCodeFragmentImportModificationListener::class.java

        val FAKE_CONTEXT_FOR_JAVA_FILE: Key<Function0<KtElement>> = Key.create("FAKE_CONTEXT_FOR_JAVA_FILE")

        private val LOG = Logger.getInstance(KtCodeFragment::class.java)
    }
}

@TopicAPI(ComponentScope.PROJECT, direction = TopicBroadcastDirection.TO_CHILDREN)
fun interface KotlinCodeFragmentImportModificationListener {
    fun onCodeFragmentImportsModification(codeFragment: KtCodeFragment)
}