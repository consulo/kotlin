package consulo.kotlin.test;

import consulo.language.file.LanguageFileType;
import consulo.language.psi.PsiFile;
import consulo.language.version.LanguageVersion;
import consulo.language.version.LanguageVersionUtil;
import consulo.test.junit.impl.language.SimpleParsingTest;
import consulo.virtualFileSystem.fileType.FileType;
import org.jetbrains.kotlin.idea.KotlinFileType;
import org.jetbrains.kotlin.idea.KotlinLanguage;
import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.Test;

public class KotlinBulkParsingTest extends SimpleParsingTest<Object> {
    public KotlinBulkParsingTest() {
        super("bulk", "ktt");
    }

    @Override
    protected LanguageFileType getFileType(Context context, @Nullable Object tc) {
        return KotlinFileType.INSTANCE;
    }

    @Override
    protected PsiFile createFile(Context context, @Nullable Object tc, String fileName, FileType fileType, String text) {
        // Use .kt extension so KotlinParser calls parseFile() not parseScript()
        String ktName = fileName.replace(".ktt", ".kt");
        LanguageVersion lv = LanguageVersionUtil.findDefaultVersion(KotlinLanguage.INSTANCE);
        return context.psiFileFactory().createFileFromText(ktName, lv.getLanguage(), lv, text);
    }

    @Test public void testTest0(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest1(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest2(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest3(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest4(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest5(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest6(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest7(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest8(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest9(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest10(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest11(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest12(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest13(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest14(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest15(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest16(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest17(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest18(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest19(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest20(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest21(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest22(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest23(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest24(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest25(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest26(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest27(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest28(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest29(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest30(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest31(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest32(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest33(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest34(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest35(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest36(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest37(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest38(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest39(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest40(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest41(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest42(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest43(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest44(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest45(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest46(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest47(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest48(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest49(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest50(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest51(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest52(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest53(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest54(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest55(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest56(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest57(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest58(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest59(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest60(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest61(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest62(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest63(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest64(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest65(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest66(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest67(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest68(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest69(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest70(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest71(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest72(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest73(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest74(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest75(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest76(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest77(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest78(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest79(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest80(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest81(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest82(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest83(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest84(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest85(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest86(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest87(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest88(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest89(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest90(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest91(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest92(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest93(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest94(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest95(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest96(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest97(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest98(Context c) throws Exception { doTest(c, null); }
    @Test public void testTest99(Context c) throws Exception { doTest(c, null); }
}
