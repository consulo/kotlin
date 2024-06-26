/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi

import consulo.document.util.FileContentUtilCore
import consulo.language.file.FileViewProvider
import consulo.language.impl.psi.PsiFileBase
import consulo.language.psi.PsiElement
import consulo.language.psi.PsiElementVisitor
import consulo.language.psi.PsiNamedElement
import consulo.language.psi.stub.StubElement
import consulo.language.psi.util.PsiTreeUtil
import consulo.language.util.IncorrectOperationException
import consulo.util.collection.ArrayFactory
import consulo.virtualFileSystem.VirtualFileWithId
import consulo.virtualFileSystem.fileType.FileType
import org.jetbrains.kotlin.KtNodeTypes
import org.jetbrains.kotlin.idea2.KotlinFileType
import org.jetbrains.kotlin.idea2.KotlinLanguage
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.parsing.KotlinParserDefinition
import org.jetbrains.kotlin.psi.psiUtil.getChildOfType
import org.jetbrains.kotlin.psi.psiUtil.hasExpectModifier
import org.jetbrains.kotlin.psi.stubs.KotlinFileStub
import org.jetbrains.kotlin.psi.stubs.elements.KtPlaceHolderStubElementType
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes

/**
 * This class represents kotlin psi file, independently of java psi (no [PsiClassOwner] super).
 * It can be created by [org.jetbrains.kotlin.parsing.KotlinCommonParserDefinition], if java psi is not available e.g., on JB Client.
 *
 * It's not supposed to be used directly, use [PsiFile] or if you need to check instanceof, check its' file type or language instead.
 */
@Deprecated("Don't use directly, use file.getFileType() instead")
open class KtCommonFile(viewProvider: FileViewProvider, val isCompiled: Boolean) :
    PsiFileBase(viewProvider, KotlinLanguage.INSTANCE),
    KtDeclarationContainer,
    KtAnnotated,
    KtElement,
    PsiNamedElement {

    @Volatile
    private var isScript: Boolean? = null

    @Volatile
    private var hasTopLevelCallables: Boolean? = null

    @Volatile
    private var pathCached: String? = null

    val importList: KtImportList?
        get() = importLists.firstOrNull()

    @Volatile
    private var hasImportAlias: Boolean? = null

    fun hasImportAlias(): Boolean {
        val hasImportAlias = hasImportAlias
        if (hasImportAlias != null) return hasImportAlias

        val newValue = importLists.any(KtImportList::computeHasImportAlias)
        this.hasImportAlias = newValue
        return newValue
    }

    protected open val importLists: List<KtImportList>
        get() = findChildrenByTypeOrClass(KtStubElementTypes.IMPORT_LIST, KtImportList::class.java).asList()

    val fileAnnotationList: KtFileAnnotationList?
        get() = findChildByTypeOrClass(KtStubElementTypes.FILE_ANNOTATION_LIST, KtFileAnnotationList::class.java)

    open val importDirectives: List<KtImportDirective>
        get() = importLists.flatMap { it.imports }

    // scripts have no package directive, all other files must have package directives
    val packageDirective: KtPackageDirective?
        get() {
            val stub = stub
            if (stub != null) {
                val packageDirectiveStub = stub.findChildStubByType(KtStubElementTypes.PACKAGE_DIRECTIVE)
                return packageDirectiveStub?.psi
            }
            return packageDirectiveByTree
        }

    private val packageDirectiveByTree: KtPackageDirective?
        get() {
            val ast = node.findChildByType(KtNodeTypes.PACKAGE_DIRECTIVE)
            return if (ast != null) ast.psi as KtPackageDirective else null
        }

    var packageFqName: FqName
        get() = stub?.getPackageFqName() ?: packageFqNameByTree
        set(value) {
            val packageDirective = packageDirective
            if (packageDirective != null) {
                packageDirective.fqName = value
            } else {
                val newPackageDirective = KtPsiFactory(project).createPackageDirectiveIfNeeded(value) ?: return
                addAfter(newPackageDirective, null)
            }
        }

    val packageFqNameByTree: FqName
        get() = packageDirectiveByTree?.fqName ?: FqName.ROOT

    val script: KtScript?
        get() {
            isScript?.let { if (!it) return null }
            stub?.let { if (!it.isScript()) return null }

            val result = getChildOfType<KtScript>()
            if (isScript == null) {
                isScript = result != null
            }

            return result
        }

    val virtualFilePath
        get(): String {
            pathCached?.let { return it }

            return virtualFile.path.also {
                pathCached = it
            }
        }

    val isScriptByTree: Boolean
        get() = script != null

    /**
     * @return modifier lists that do not belong to any declaration due to incomplete code or syntax errors
     */
    val danglingModifierLists: Array<out KtModifierList>
        get() {
            val stub = stub
            return stub?.getChildrenByType(
                KtStubElementTypes.MODIFIER_LIST,
                KtStubElementTypes.MODIFIER_LIST.arrayFactory
            ) ?: findChildrenByClass(KtModifierList::class.java)
        }

    /**
     * @return annotations that do not belong to any declaration due to incomplete code or syntax errors
     */
    val danglingAnnotations: List<KtAnnotationEntry>
        get() = danglingModifierLists.flatMap { obj: KtModifierList -> obj.annotationEntries }

    override fun getFileType(): FileType = KotlinFileType.INSTANCE

    override fun toString(): String = "KtFile: $name"

    override fun getDeclarations(): List<KtDeclaration> {
        val stub = stub
        return stub?.getChildrenByType(KtFile.FILE_DECLARATION_TYPES, KtDeclaration.ARRAY_FACTORY)?.toList()
            ?: PsiTreeUtil.getChildrenOfTypeAsList(this, KtDeclaration::class.java)
    }

    fun <T : KtElementImplStub<out StubElement<*>>> findChildByTypeOrClass(
        elementType: KtPlaceHolderStubElementType<T>,
        elementClass: Class<T>
    ): T? {
        val stub = stub
        if (stub != null) {
            val importListStub = stub.findChildStubByType(elementType)
            return importListStub?.psi
        }
        return findChildByClass(elementClass)
    }

    fun <T : KtElementImplStub<out StubElement<*>>> findChildrenByTypeOrClass(
        elementType: KtPlaceHolderStubElementType<T>,
        elementClass: Class<T>
    ): Array<out T> {
        val stub = stub
        if (stub != null) {
            val arrayFactory: ArrayFactory<T> = elementType.arrayFactory
            return stub.getChildrenByType(elementType, arrayFactory)
        }
        return findChildrenByClass(elementClass)
    }


    fun findImportByAlias(name: String): KtImportDirective? {
        if (!hasImportAlias()) return null

        return importDirectives.firstOrNull { name == it.aliasName }
    }

    fun findAliasByFqName(fqName: FqName): KtImportAlias? {
        if (!hasImportAlias()) return null

        return importDirectives.firstOrNull {
            it.alias != null && fqName == it.importedFqName
        }?.alias
    }

    fun getNameForGivenImportAlias(name: Name): Name? {
        if (!hasImportAlias()) return null

        return importDirectives.find { it.importedName == name }?.importedFqName?.pathSegments()?.last()
    }

    override fun getStub(): KotlinFileStub? {
        if (virtualFile !is VirtualFileWithId) return null
        val stub = super.getStub()
        if (stub is KotlinFileStub?) {
            return stub
        }

        error("Illegal stub for KtFile: type=${this.javaClass}, stub=${stub?.javaClass} name=$name")
    }

    override fun clearCaches() {
        @Suppress("RemoveExplicitSuperQualifier")
        super<PsiFileBase>.clearCaches()
        isScript = null
        hasTopLevelCallables = null
        pathCached = null
        hasImportAlias = null
    }

    fun isScript(): Boolean = isScript ?: stub?.isScript() ?: isScriptByTree

    fun hasTopLevelCallables(): Boolean {
        hasTopLevelCallables?.let { return it }

        val result = declarations.any {
            (it is KtProperty ||
                    it is KtNamedFunction ||
                    it is KtScript ||
                    it is KtTypeAlias) && !it.hasExpectModifier()
        }

        hasTopLevelCallables = result
        return result
    }

    override fun accept(visitor: PsiElementVisitor) {
        if (visitor is KtVisitor<*, *>) {
            @Suppress("UNCHECKED_CAST")
            accept(visitor as KtVisitor<Any, Any?>, null)
        } else {
            visitor.visitFile(this)
        }
    }

    override fun getContainingKtFile(): KtFile = this as KtFile

    override fun <D> acceptChildren(visitor: KtVisitor<Void, D>, data: D) {
        KtPsiUtil.visitChildren(this, visitor, data)
    }

    override fun <R, D> accept(visitor: KtVisitor<R, D>, data: D): R {
        return visitor.visitKtCommonFile(this)
    }

    override fun getAnnotations(): List<KtAnnotation> =
        fileAnnotationList?.annotations ?: emptyList()

    override fun getAnnotationEntries(): List<KtAnnotationEntry> =
        fileAnnotationList?.annotationEntries ?: emptyList()

    @Throws(IncorrectOperationException::class)
    override fun setName(name: String): PsiElement {
        val result = super.setName(name)
        val willBeScript = name.endsWith(KotlinParserDefinition.STD_SCRIPT_EXT)
        if (isScript() != willBeScript) {
            FileContentUtilCore.reparseFiles(listOfNotNull(virtualFile))
        }
        return result
    }

    override fun getPsiOrParent(): KtElement = this

    @Suppress("unused") //keep for compatibility with potential plugins
    fun shouldChangeModificationCount(@Suppress("UNUSED_PARAMETER") place: PsiElement): Boolean {
        // Modification count for Kotlin files is tracked entirely by KotlinCodeBlockModificationListener
        return false
    }
}

private fun KtImportList.computeHasImportAlias(): Boolean {
    var child: PsiElement? = firstChild
    while (child != null) {
        if (child is KtImportDirective && child.alias != null) {
            return true
        }

        child = child.nextSibling
    }

    return false
}