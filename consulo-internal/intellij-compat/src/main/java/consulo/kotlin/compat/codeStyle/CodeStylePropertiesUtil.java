package consulo.kotlin.compat.codeStyle;

import java.util.Arrays;
import java.util.List;

public final class CodeStylePropertiesUtil {
    private CodeStylePropertiesUtil() {
    }

    public static List<String> getValueList(String string) {
        return Arrays.stream(string.split(",")).map(String::trim).filter(s -> !s.isEmpty()).toList();
    }

    public static String toCommaSeparatedString(List<String> list) {
        return String.join(",", list);
    }
}
