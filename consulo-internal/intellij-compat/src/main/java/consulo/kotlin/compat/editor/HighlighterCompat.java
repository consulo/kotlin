package consulo.kotlin.compat.editor;

import consulo.colorScheme.TextAttributesKey;
import consulo.language.ast.IElementType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * IntelliJ syntax highlighting API that Consulo lacks. Calls are redirected here by remap.xml.
 */
public final class HighlighterCompat {
    private HighlighterCompat() {
    }

    /** IntelliJ {@code SyntaxHighlighterBase.merge(keys1, keys2)}: per token the keys of both maps, in order. */
    public static Map<IElementType, TextAttributesKey[]> merge(Map<IElementType, TextAttributesKey> keys1,
                                                              Map<IElementType, TextAttributesKey> keys2) {
        Set<IElementType> types = new HashSet<>(keys1.keySet());
        types.addAll(keys2.keySet());
        Map<IElementType, TextAttributesKey[]> result = new HashMap<>(types.size());
        for (IElementType type : types) {
            TextAttributesKey key1 = keys1.get(type);
            TextAttributesKey key2 = keys2.get(type);
            TextAttributesKey[] keys;
            if (key1 == null) {
                keys = new TextAttributesKey[]{key2};
            }
            else if (key2 == null) {
                keys = new TextAttributesKey[]{key1};
            }
            else {
                keys = new TextAttributesKey[]{key1, key2};
            }
            result.put(type, keys);
        }
        return result;
    }
}
