package consulo.kotlin.compat.completion;

import consulo.language.editor.completion.lookup.LookupElementBuilder;
import consulo.language.editor.completion.lookup.LookupElement;
import consulo.application.util.matcher.PrefixMatcher;
import consulo.ui.ex.awtUnsafe.TargetAWT;
import consulo.language.editor.completion.CompletionContributor;
import consulo.language.editor.completion.CompletionType;
import consulo.language.editor.template.Template;
import consulo.language.pattern.ElementPattern;
import consulo.language.pattern.PatternCondition;
import consulo.language.pattern.StringPattern;
import consulo.language.psi.PsiElement;
import consulo.language.util.ProcessingContext;

/** IntelliJ completion API that Consulo lacks; calls are redirected here by remap.xml. */
public final class CompletionCompat {
    private CompletionCompat() {
    }

    /** {@code CompletionContributor.extend} with an IntelliJ-style {@link CompletionProvider}. */
    public static void extend(CompletionContributor contributor, CompletionType type, ElementPattern<? extends PsiElement> place,
                              CompletionProvider<?> provider) {
        contributor.extend(type, place, provider);
    }

    /** IntelliJ {@code StringPattern.endsWithUppercaseLetter()}. */
    public static StringPattern endsWithUppercaseLetter(StringPattern pattern) {
        return pattern.with(new PatternCondition<String>("endsWithUppercaseLetter") {
            @Override
            public boolean accepts(String s, ProcessingContext context) {
                return !s.isEmpty() && Character.isUpperCase(s.charAt(s.length() - 1));
            }
        });
    }

    /** IntelliJ {@code Template.setToShortenLongNames}: Consulo's templates always keep the names as written. */
    public static void setToShortenLongNames(Template template, boolean value) {
    }

    /** IntelliJ {@code LookupElementBuilder.withItemTextForeground(Color)}: Consulo takes a ColorValue. */
    public static LookupElementBuilder withItemTextForeground(LookupElementBuilder builder, java.awt.Color color) {
        return builder.withItemTextForeground(TargetAWT.from(color));
    }

    /** IntelliJ {@code PrefixMatcher.prefixMatches(LookupElement)}: Consulo matches the element as a CompositeStringHolder. */
    public static boolean prefixMatches(PrefixMatcher matcher, LookupElement element) {
        return matcher.prefixMatches(element);
    }
}
