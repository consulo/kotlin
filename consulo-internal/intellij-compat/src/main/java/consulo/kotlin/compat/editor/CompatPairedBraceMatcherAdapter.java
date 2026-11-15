package consulo.kotlin.compat.editor;

import consulo.codeEditor.HighlighterIterator;
import consulo.language.BracePair;
import consulo.language.Language;
import consulo.language.PairedBraceMatcher;
import consulo.language.ast.IElementType;
import consulo.language.editor.highlight.BraceMatcherTerminationAspect;
import consulo.language.editor.highlight.LanguageBraceMatcher;
import consulo.language.editor.highlight.NontrivialBraceMatcher;
import consulo.language.psi.PsiFile;
import consulo.virtualFileSystem.fileType.FileType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Copy of Consulo's PairedBraceMatcherAdapter, which lives in a package that is not exported to plugins.
 * Base of {@link CompatPairedBraceAndAnglesMatcher}.
 */
public class CompatPairedBraceMatcherAdapter implements NontrivialBraceMatcher, LanguageBraceMatcher {
    private final PairedBraceMatcher myMatcher;
    private final Language myLanguage;

    public CompatPairedBraceMatcherAdapter(PairedBraceMatcher matcher, Language language) {
        myMatcher = matcher;
        myLanguage = language;
    }

    @Override
    public int getBraceTokenGroupId(IElementType tokenType) {
        for (BracePair pair : myMatcher.getPairs()) {
            if (tokenType == pair.getLeftBraceType() || tokenType == pair.getRightBraceType()) {
                return myLanguage.hashCode();
            }
        }
        return -1;
    }

    public BracePair findPair(boolean left, HighlighterIterator iterator, CharSequence fileText, FileType fileType) {
        IElementType tokenType = (IElementType) iterator.getTokenType();
        for (BracePair pair : myMatcher.getPairs()) {
            if (tokenType == (left ? pair.getLeftBraceType() : pair.getRightBraceType())) {
                return pair;
            }
        }
        return null;
    }

    @Override
    public boolean isLBraceToken(HighlighterIterator iterator, CharSequence fileText, FileType fileType) {
        return findPair(true, iterator, fileText, fileType) != null;
    }

    @Override
    public boolean isRBraceToken(HighlighterIterator iterator, CharSequence fileText, FileType fileType) {
        return findPair(false, iterator, fileText, fileType) != null;
    }

    @Override
    public IElementType getOppositeBraceTokenType(IElementType type) {
        for (BracePair pair : myMatcher.getPairs()) {
            if (type == pair.getRightBraceType()) {
                return pair.getLeftBraceType();
            }
            if (type == pair.getLeftBraceType()) {
                return pair.getRightBraceType();
            }
        }
        return null;
    }

    @Override
    public boolean isPairBraces(IElementType tokenType, IElementType tokenType2) {
        for (BracePair pair : myMatcher.getPairs()) {
            if (tokenType == pair.getLeftBraceType() && tokenType2 == pair.getRightBraceType()
                || tokenType == pair.getRightBraceType() && tokenType2 == pair.getLeftBraceType()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isStructuralBrace(HighlighterIterator iterator, CharSequence text, FileType fileType) {
        IElementType tokenType = (IElementType) iterator.getTokenType();
        for (BracePair pair : myMatcher.getPairs()) {
            if (tokenType == pair.getRightBraceType() || tokenType == pair.getLeftBraceType()) {
                return pair.isStructural();
            }
        }
        return false;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(IElementType lbraceType, IElementType contextType) {
        return myMatcher.isPairedBracesAllowedBeforeType(lbraceType, contextType);
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return myMatcher.getCodeConstructStart(file, openingBraceOffset);
    }

    @Override
    public List<IElementType> getOppositeBraceTokenTypes(IElementType type) {
        List<IElementType> result = null;
        for (BracePair pair : myMatcher.getPairs()) {
            IElementType match = null;
            if (type == pair.getRightBraceType()) {
                match = pair.getLeftBraceType();
            }
            if (type == pair.getLeftBraceType()) {
                match = pair.getRightBraceType();
            }
            if (match != null) {
                if (result == null) {
                    result = new ArrayList<>(2);
                }
                result.add(match);
            }
        }
        return result != null ? result : Collections.emptyList();
    }

    @Override
    public boolean shouldStopMatch(boolean forward, IElementType braceType, HighlighterIterator iterator) {
        return myMatcher instanceof BraceMatcherTerminationAspect aspect && aspect.shouldStopMatch(forward, braceType, iterator);
    }

    @Override
    public Language getLanguage() {
        return myLanguage;
    }
}
