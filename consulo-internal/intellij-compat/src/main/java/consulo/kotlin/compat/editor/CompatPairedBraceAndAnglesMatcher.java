package consulo.kotlin.compat.editor;

import consulo.codeEditor.HighlighterIterator;
import consulo.language.BracePair;
import consulo.language.Language;
import consulo.language.PairedBraceMatcher;
import consulo.language.ast.IElementType;
import consulo.language.ast.TokenSet;
import consulo.language.file.LanguageFileType;
import consulo.virtualFileSystem.fileType.FileType;

/**
 * Remap target of IntelliJ's {@code com.intellij.codeInsight.highlighting.PairedBraceAndAnglesMatcher} (not in
 * Consulo): treats {@code <}/{@code >} as braces only when the tokens between them can form type arguments.
 */
public abstract class CompatPairedBraceAndAnglesMatcher extends CompatPairedBraceMatcherAdapter {
    private final TokenSet myTokenSetAllowedInsideAngleBrackets;
    private final LanguageFileType myFileType;

    public CompatPairedBraceAndAnglesMatcher(PairedBraceMatcher matcher,
                                             Language language,
                                             LanguageFileType fileType,
                                             TokenSet tokenSetAllowedInsideAngleBrackets) {
        super(matcher, language);
        myTokenSetAllowedInsideAngleBrackets = tokenSetAllowedInsideAngleBrackets;
        myFileType = fileType;
    }

    @Override
    public boolean isLBraceToken(HighlighterIterator iterator, CharSequence fileText, FileType fileType) {
        return isBrace(iterator, fileText, fileType, true);
    }

    @Override
    public boolean isRBraceToken(HighlighterIterator iterator, CharSequence fileText, FileType fileType) {
        return isBrace(iterator, fileText, fileType, false);
    }

    public abstract IElementType lt();

    public abstract IElementType gt();

    private boolean isBrace(HighlighterIterator iterator, CharSequence fileText, FileType fileType, boolean left) {
        BracePair pair = findPair(left, iterator, fileText, fileType);
        if (pair == null) {
            return false;
        }

        IElementType opposite = left ? gt() : lt();
        if ((left ? pair.getRightBraceType() : pair.getLeftBraceType()) != opposite) {
            return true;
        }
        if (fileType != myFileType) {
            return false;
        }

        IElementType braceElementType = left ? lt() : gt();
        int count = 0;
        try {
            int paired = 1;
            while (true) {
                count++;
                if (left) {
                    iterator.advance();
                }
                else {
                    iterator.retreat();
                }
                if (iterator.atEnd()) {
                    break;
                }
                IElementType tokenType = (IElementType) iterator.getTokenType();
                if (tokenType == opposite) {
                    paired--;
                    if (paired == 0) {
                        return true;
                    }
                    continue;
                }
                if (tokenType == braceElementType) {
                    paired++;
                    continue;
                }
                if (!myTokenSetAllowedInsideAngleBrackets.contains(tokenType)) {
                    return false;
                }
            }
            return false;
        }
        finally {
            while (count-- > 0) {
                if (left) {
                    iterator.retreat();
                }
                else {
                    iterator.advance();
                }
            }
        }
    }
}
