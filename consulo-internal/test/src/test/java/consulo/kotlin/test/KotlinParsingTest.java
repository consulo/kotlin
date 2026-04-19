package consulo.kotlin.test;

import consulo.language.file.LanguageFileType;
import consulo.test.junit.impl.language.SimpleParsingTest;
import org.jetbrains.kotlin.idea.KotlinFileType;
import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.Test;

/**
 * Kotlin PSI parsing test using Consulo test framework.
 * Verifies that the shaded Kotlin parser works with Consulo platform.
 */
public class KotlinParsingTest extends SimpleParsingTest<Object> {
    public KotlinParsingTest() {
        super("kotlin", "kt");
    }

    @Test
    public void testSimpleFunction(Context context) throws Exception {
        doTest(context, null);
    }

    @Test
    public void testClassDeclaration(Context context) throws Exception {
        doTest(context, null);
    }

    @Test
    public void testPropertyDeclaration(Context context) throws Exception {
        doTest(context, null);
    }

    @Override
    protected LanguageFileType getFileType(Context context, @Nullable Object testContext) {
        return KotlinFileType.INSTANCE;
    }
}
