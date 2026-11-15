package consulo.kotlin.compat.lang;

import consulo.language.Language;
import consulo.language.parser.ParserDefinition;

/** IntelliJ {@code com.intellij.lang.LanguageParserDefinitions}: Consulo's parser definitions are language extensions. */
public final class LanguageParserDefinitions {
    public static final LanguageParserDefinitions INSTANCE = new LanguageParserDefinitions();

    private LanguageParserDefinitions() {
    }

    public Object forLanguage(Language language) {
        return ParserDefinition.forLanguage(language);
    }
}
