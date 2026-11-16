package consulo.kotlin.compat.codeStyle;

import consulo.language.codeStyle.setting.CodeStyleSettingsCustomizable;

/** IntelliJ keeps the option group names and choices of {@link CodeStyleSettingsCustomizable} in an instance; Consulo in the interface. */
public final class CodeStyleSettingsCustomizableOptions {
    private static final CodeStyleSettingsCustomizableOptions INSTANCE = new CodeStyleSettingsCustomizableOptions();

    public final String SPACES_AROUND_OPERATORS = CodeStyleSettingsCustomizable.SPACES_AROUND_OPERATORS;
    public final String SPACES_BEFORE_PARENTHESES = CodeStyleSettingsCustomizable.SPACES_BEFORE_PARENTHESES;
    public final String SPACES_BEFORE_LEFT_BRACE = CodeStyleSettingsCustomizable.SPACES_BEFORE_LEFT_BRACE;
    public final String SPACES_BEFORE_KEYWORD = CodeStyleSettingsCustomizable.SPACES_BEFORE_KEYWORD;
    public final String SPACES_WITHIN = CodeStyleSettingsCustomizable.SPACES_WITHIN;
    public final String SPACES_IN_TERNARY_OPERATOR = CodeStyleSettingsCustomizable.SPACES_IN_TERNARY_OPERATOR;
    public final String SPACES_WITHIN_TYPE_ARGUMENTS = CodeStyleSettingsCustomizable.SPACES_WITHIN_TYPE_ARGUMENTS;
    public final String SPACES_IN_TYPE_ARGUMENTS = CodeStyleSettingsCustomizable.SPACES_IN_TYPE_ARGUMENTS;
    public final String SPACES_IN_TYPE_PARAMETERS = CodeStyleSettingsCustomizable.SPACES_IN_TYPE_PARAMETERS;
    public final String SPACES_OTHER = CodeStyleSettingsCustomizable.SPACES_OTHER;
    public final String BLANK_LINES_KEEP = CodeStyleSettingsCustomizable.BLANK_LINES_KEEP;
    public final String BLANK_LINES = CodeStyleSettingsCustomizable.BLANK_LINES;
    public final String WRAPPING_KEEP = CodeStyleSettingsCustomizable.WRAPPING_KEEP;
    public final String WRAPPING_BRACES = CodeStyleSettingsCustomizable.WRAPPING_BRACES;
    public final String WRAPPING_COMMENTS = CodeStyleSettingsCustomizable.WRAPPING_COMMENTS;
    public final String WRAPPING_METHOD_PARAMETERS = CodeStyleSettingsCustomizable.WRAPPING_METHOD_PARAMETERS;
    public final String WRAPPING_METHOD_PARENTHESES = CodeStyleSettingsCustomizable.WRAPPING_METHOD_PARENTHESES;
    public final String WRAPPING_METHOD_ARGUMENTS_WRAPPING = CodeStyleSettingsCustomizable.WRAPPING_METHOD_ARGUMENTS_WRAPPING;
    public final String WRAPPING_CALL_CHAIN = CodeStyleSettingsCustomizable.WRAPPING_CALL_CHAIN;
    public final String WRAPPING_IF_STATEMENT = CodeStyleSettingsCustomizable.WRAPPING_IF_STATEMENT;
    public final String WRAPPING_FOR_STATEMENT = CodeStyleSettingsCustomizable.WRAPPING_FOR_STATEMENT;
    public final String WRAPPING_WHILE_STATEMENT = CodeStyleSettingsCustomizable.WRAPPING_WHILE_STATEMENT;
    public final String WRAPPING_DOWHILE_STATEMENT = CodeStyleSettingsCustomizable.WRAPPING_DOWHILE_STATEMENT;
    public final String WRAPPING_SWITCH_STATEMENT = CodeStyleSettingsCustomizable.WRAPPING_SWITCH_STATEMENT;
    public final String WRAPPING_TRY_STATEMENT = CodeStyleSettingsCustomizable.WRAPPING_TRY_STATEMENT;
    public final String WRAPPING_TRY_RESOURCE_LIST = CodeStyleSettingsCustomizable.WRAPPING_TRY_RESOURCE_LIST;
    public final String WRAPPING_BINARY_OPERATION = CodeStyleSettingsCustomizable.WRAPPING_BINARY_OPERATION;
    public final String WRAPPING_EXTENDS_LIST = CodeStyleSettingsCustomizable.WRAPPING_EXTENDS_LIST;
    public final String WRAPPING_EXTENDS_KEYWORD = CodeStyleSettingsCustomizable.WRAPPING_EXTENDS_KEYWORD;
    public final String WRAPPING_THROWS_LIST = CodeStyleSettingsCustomizable.WRAPPING_THROWS_LIST;
    public final String WRAPPING_THROWS_KEYWORD = CodeStyleSettingsCustomizable.WRAPPING_THROWS_KEYWORD;
    public final String WRAPPING_TERNARY_OPERATION = CodeStyleSettingsCustomizable.WRAPPING_TERNARY_OPERATION;
    public final String WRAPPING_ASSIGNMENT = CodeStyleSettingsCustomizable.WRAPPING_ASSIGNMENT;
    public final String WRAPPING_FIELDS_VARIABLES_GROUPS = CodeStyleSettingsCustomizable.WRAPPING_FIELDS_VARIABLES_GROUPS;
    public final String WRAPPING_ARRAY_INITIALIZER = CodeStyleSettingsCustomizable.WRAPPING_ARRAY_INITIALIZER;
    public final String WRAPPING_MODIFIER_LIST = CodeStyleSettingsCustomizable.WRAPPING_MODIFIER_LIST;
    public final String WRAPPING_ASSERT_STATEMENT = CodeStyleSettingsCustomizable.WRAPPING_ASSERT_STATEMENT;
    public final String[] WRAP_OPTIONS = CodeStyleSettingsCustomizable.WRAP_OPTIONS;
    public final String[] WRAP_OPTIONS_FOR_SINGLETON = CodeStyleSettingsCustomizable.WRAP_OPTIONS_FOR_SINGLETON;
    public final String[] BRACE_OPTIONS = CodeStyleSettingsCustomizable.BRACE_OPTIONS;
    public final String[] BRACE_PLACEMENT_OPTIONS = CodeStyleSettingsCustomizable.BRACE_PLACEMENT_OPTIONS;
    public final String[] WRAP_ON_TYPING_OPTIONS = CodeStyleSettingsCustomizable.WRAP_ON_TYPING_OPTIONS;

    public static CodeStyleSettingsCustomizableOptions getInstance() {
        return INSTANCE;
    }
}
