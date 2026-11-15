package consulo.kotlin.compat.psi;

import consulo.annotation.access.RequiredReadAction;
import consulo.language.Language;
import consulo.language.ast.IFileElementType;
import consulo.language.file.FileViewProvider;
import consulo.language.parser.ParserDefinition;
import consulo.language.psi.PsiElementVisitor;
import consulo.virtualFileSystem.fileType.FileType;

import java.util.ArrayList;
import java.util.Set;

/**
 * Remap target of {@code com.intellij.extapi.psi.PsiFileBase}. Same as Consulo's PsiFileBase,
 * but on top of {@link CompatPsiFileImpl} so Kotlin files get the IntelliJ-only file API.
 */
public abstract class CompatPsiFileBase extends CompatPsiFileImpl {
    private final Language myLanguage;
    private final ParserDefinition myParserDefinition;

    protected CompatPsiFileBase(FileViewProvider viewProvider, Language language) {
        super(viewProvider);
        myLanguage = findLanguage(language, viewProvider);
        ParserDefinition parserDefinition = ParserDefinition.forLanguage(myLanguage);
        if (parserDefinition == null) {
            throw new RuntimeException("PsiFileBase: language.getParserDefinition() returned null for: " + myLanguage);
        }
        myParserDefinition = parserDefinition;
        IFileElementType nodeType = parserDefinition.getFileNodeType();
        assert nodeType.getLanguage() == myLanguage : nodeType.getLanguage() + " != " + myLanguage;
        init(nodeType, nodeType);
    }

    private static Language findLanguage(Language baseLanguage, FileViewProvider viewProvider) {
        Set<Language> languages = viewProvider.getLanguages();
        for (Language actualLanguage : languages) {
            if (actualLanguage.isKindOf(baseLanguage)) {
                return actualLanguage;
            }
        }
        throw new AssertionError(
            "Language " + baseLanguage + " doesn't participate in view provider " + viewProvider + ": " + new ArrayList<>(languages));
    }

    @Override
    public FileType getFileType() {
        return getViewProvider().getFileType();
    }

    @Override
    @RequiredReadAction
    public final Language getLanguage() {
        return myLanguage;
    }

    @Override
    public void accept(PsiElementVisitor visitor) {
        visitor.visitFile(this);
    }

    public ParserDefinition getParserDefinition() {
        return myParserDefinition;
    }
}
