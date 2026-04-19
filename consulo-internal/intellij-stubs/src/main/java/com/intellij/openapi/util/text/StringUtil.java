package com.intellij.openapi.util.text;

@SuppressWarnings("all")
public class StringUtil {
  public static final java.lang.String ELLIPSIS = null;
  public static final java.lang.String THREE_DOTS = null;
  public static final java.lang.String NON_BREAK_SPACE = null;
  public static final java.util.function.Function<java.lang.String, java.lang.String> QUOTER = null;
  public static final java.util.function.Function<java.lang.String, java.lang.String> SINGLE_QUOTER = null;
  public StringUtil() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.util.text.MergingCharSequence replaceSubSequence(java.lang.CharSequence p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
  public static java.util.List<java.lang.String> getWordsInStringLongestFirst(java.lang.String p0) { return null; }
  public static java.lang.String escapePattern(java.lang.String p0) { return null; }
  public static <T> com.intellij.util.Function<T, java.lang.String> createToStringFunction(java.lang.Class<T> p0) { return null; }
  public static java.lang.String replace(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
  public static java.lang.String replaceIgnoreCase(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
  public static java.lang.String replaceChar(java.lang.String p0, char p1, char p2) { return null; }
  public static java.lang.String replace(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return null; }
  public static int indexOfIgnoreCase(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
  public static int indexOfIgnoreCase(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2) { return 0; }
  public static int indexOfIgnoreCase(java.lang.String p0, char p1, int p2) { return 0; }
  public static int lastIndexOfIgnoreCase(java.lang.String p0, char p1, int p2) { return 0; }
  public static boolean containsIgnoreCase(java.lang.String p0, java.lang.String p1) { return false; }
  public static boolean endsWithIgnoreCase(java.lang.String p0, java.lang.String p1) { return false; }
  public static boolean startsWithIgnoreCase(java.lang.String p0, java.lang.String p1) { return false; }
  public static java.lang.String stripHtml(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String stripHtml(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String toLowerCase(java.lang.String p0) { return null; }
  public static java.lang.String getPackageName(java.lang.String p0) { return null; }
  public static java.lang.String getPackageName(java.lang.String p0, char p1) { return null; }
  public static int getLineBreakCount(java.lang.CharSequence p0) { return 0; }
  public static boolean containsLineBreak(java.lang.CharSequence p0) { return false; }
  public static boolean isLineBreak(char p0) { return false; }
  public static java.lang.String escapeLineBreak(java.lang.String p0) { return null; }
  public static boolean endsWithLineBreak(java.lang.CharSequence p0) { return false; }
  public static int lineColToOffset(java.lang.CharSequence p0, int p1, int p2) { return 0; }
  public static int offsetToLineNumber(java.lang.CharSequence p0, int p1) { return 0; }
  public static com.intellij.openapi.util.text.LineColumn offsetToLineColumn(java.lang.CharSequence p0, int p1) { return null; }
  public static int difference(java.lang.String p0, java.lang.String p1) { return 0; }
  public static java.lang.String wordsToBeginFromUpperCase(java.lang.String p0) { return null; }
  public static java.lang.String wordsToBeginFromLowerCase(java.lang.String p0) { return null; }
  public static java.lang.String toTitleCase(java.lang.String p0) { return null; }
  public static boolean isPreposition(java.lang.String p0, int p1, int p2, java.lang.String[] p3) { return false; }
  public static com.intellij.util.NotNullFunction<java.lang.String, java.lang.String> escaper(boolean p0, java.lang.String p1) { return null; }
  public static void escapeStringCharacters(int p0, java.lang.String p1, java.lang.StringBuilder p2) {}
  public static java.lang.StringBuilder escapeStringCharacters(int p0, java.lang.String p1, java.lang.String p2, java.lang.StringBuilder p3) { return null; }
  public static java.lang.StringBuilder escapeStringCharacters(int p0, java.lang.String p1, java.lang.String p2, boolean p3, java.lang.StringBuilder p4) { return null; }
  public static java.lang.StringBuilder escapeStringCharacters(int p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4, java.lang.StringBuilder p5) { return null; }
  public static boolean isPrintableUnicode(char p0) { return false; }
  public static java.lang.String escapeStringCharacters(java.lang.String p0) { return null; }
  public static java.lang.String escapeCharCharacters(java.lang.String p0) { return null; }
  public static java.lang.String unescapeStringCharacters(java.lang.String p0) { return null; }
  public static boolean isQuotedString(java.lang.String p0) { return false; }
  public static java.lang.String unquoteString(java.lang.String p0) { return null; }
  public static java.lang.String unquoteString(java.lang.String p0, char p1) { return null; }
  public static void unescapeStringCharacters(int p0, java.lang.String p1, java.lang.StringBuilder p2) {}
  public static java.lang.String unescapeAnsiStringCharacters(java.lang.String p0) { return null; }
  public static java.lang.String pluralize(java.lang.String p0) { return null; }
  public static java.lang.String capitalizeWords(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String capitalizeWords(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3) { return null; }
  public static java.lang.String decapitalize(java.lang.String p0) { return null; }
  public static boolean isVowel(char p0) { return false; }
  public static java.lang.String capitalize(java.lang.String p0) { return null; }
  public static boolean isCapitalized(java.lang.String p0) { return false; }
  public static boolean canBeCapitalized(java.lang.String p0) { return false; }
  public static java.lang.String capitalizeWithJavaBeanConvention(java.lang.String p0) { return null; }
  public static int stringHashCode(java.lang.CharSequence p0) { return 0; }
  public static int stringHashCode(java.lang.CharSequence p0, int p1, int p2) { return 0; }
  public static int stringHashCode(java.lang.CharSequence p0, int p1, int p2, int p3) { return 0; }
  public static int stringHashCode(char[] p0, int p1, int p2) { return 0; }
  public static int stringHashCodeInsensitive(char[] p0, int p1, int p2) { return 0; }
  public static int stringHashCodeInsensitive(java.lang.CharSequence p0, int p1, int p2) { return 0; }
  public static int stringHashCodeInsensitive(java.lang.CharSequence p0, int p1, int p2, int p3) { return 0; }
  public static int stringHashCodeInsensitive(java.lang.CharSequence p0) { return 0; }
  public static int stringHashCodeIgnoreWhitespaces(java.lang.CharSequence p0) { return 0; }
  public static boolean startsWithConcatenation(java.lang.String p0, java.lang.String... p1) { return false; }
  public static java.lang.String trim(java.lang.String p0) { return null; }
  public static java.lang.String trimEnd(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String trimEnd(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
  public static java.lang.String trimEnd(java.lang.String p0, char p1) { return null; }
  public static java.lang.String trimLog(java.lang.String p0, int p1) { return null; }
  public static java.lang.String trimLeading(java.lang.String p0) { return null; }
  public static java.lang.CharSequence trimLeading(java.lang.CharSequence p0) { return null; }
  public static java.lang.String trimLeading(java.lang.String p0, char p1) { return null; }
  public static java.lang.StringBuilder trimLeading(java.lang.StringBuilder p0, char p1) { return null; }
  public static java.lang.String trimTrailing(java.lang.String p0) { return null; }
  public static java.lang.CharSequence trimTrailing(java.lang.CharSequence p0) { return null; }
  public static java.lang.String trimTrailing(java.lang.String p0, char p1) { return null; }
  public static java.lang.StringBuilder trimTrailing(java.lang.StringBuilder p0, char p1) { return null; }
  public static java.lang.CharSequence trim(java.lang.CharSequence p0) { return null; }
  public static boolean startsWithChar(java.lang.CharSequence p0, char p1) { return false; }
  public static boolean endsWithChar(java.lang.CharSequence p0, char p1) { return false; }
  public static java.lang.String trimStart(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String trimExtensions(java.lang.String p0) { return null; }
  public static java.lang.String pluralize(java.lang.String p0, int p1) { return null; }
  public static void repeatSymbol(java.lang.Appendable p0, char p1, int p2) {}
  public static java.lang.String defaultIfEmpty(java.lang.String p0, java.lang.String p1) { return null; }
  public static boolean isNotEmpty(java.lang.String p0) { return false; }
  public static boolean isEmpty(java.lang.String p0) { return false; }
  public static boolean isEmpty(java.lang.CharSequence p0) { return false; }
  public static int length(java.lang.CharSequence p0) { return 0; }
  public static java.lang.String notNullize(java.lang.String p0) { return null; }
  public static java.lang.String notNullize(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String nullize(java.lang.String p0) { return null; }
  public static java.lang.String nullize(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String nullize(java.lang.String p0, boolean p1) { return null; }
  public static boolean isEmptyOrSpaces(java.lang.String p0) { return false; }
  public static boolean isEmptyOrSpaces(java.lang.CharSequence p0) { return false; }
  public static boolean isWhiteSpace(char p0) { return false; }
  public static java.lang.String getThrowableText(java.lang.Throwable p0) { return null; }
  public static java.lang.String getMessage(java.lang.Throwable p0) { return null; }
  public static java.lang.String repeatSymbol(char p0, int p1) { return null; }
  public static java.lang.String repeat(java.lang.String p0, int p1) { return null; }
  public static java.util.List<java.lang.String> splitHonorQuotes(java.lang.String p0, char p1) { return null; }
  public static java.util.List<java.lang.String> split(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.util.List<java.lang.CharSequence> split(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
  public static java.util.List<java.lang.String> split(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
  public static java.util.List<java.lang.String> split(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3) { return null; }
  public static java.util.List<java.lang.CharSequence> split(java.lang.CharSequence p0, java.lang.CharSequence p1, boolean p2, boolean p3) { return null; }
  public static java.util.List<java.lang.String> split(java.lang.String p0, com.intellij.openapi.util.text.CharFilter p1, boolean p2, boolean p3) { return null; }
  public static java.util.List<java.lang.CharSequence> split(java.lang.CharSequence p0, com.intellij.openapi.util.text.CharFilter p1, boolean p2, boolean p3) { return null; }
  public static java.lang.Iterable<java.lang.String> tokenize(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.Iterable<java.lang.String> tokenize(java.util.StringTokenizer p0) { return null; }
  public static java.util.List<java.lang.String> getWordsIn(java.lang.String p0) { return null; }
  public static java.util.List<com.intellij.openapi.util.TextRange> getWordIndicesIn(java.lang.String p0) { return null; }
  public static java.util.List<com.intellij.openapi.util.TextRange> getWordIndicesIn(java.lang.String p0, java.util.Set<java.lang.Character> p1) { return null; }
  public static java.lang.String join(java.lang.String[] p0, java.lang.String p1) { return null; }
  public static java.lang.String join(java.lang.String[] p0, int p1, int p2, java.lang.String p3) { return null; }
  public static java.lang.String[] zip(java.lang.String[] p0, java.lang.String[] p1, java.lang.String p2) { return null; }
  public static java.lang.String[] surround(java.lang.String[] p0, java.lang.String p1, java.lang.String p2) { return null; }
  public static <T> java.lang.String join(T[] p0, com.intellij.util.Function<? super T, java.lang.String> p1, java.lang.String p2) { return null; }
  public static <T> java.lang.String join(java.util.Collection<? extends T> p0, com.intellij.util.Function<? super T, java.lang.String> p1, java.lang.String p2) { return null; }
  public static java.lang.String join(java.lang.Iterable<?> p0, java.lang.String p1) { return null; }
  public static <T> java.lang.String join(java.lang.Iterable<? extends T> p0, com.intellij.util.Function<? super T, ? extends java.lang.CharSequence> p1, java.lang.String p2) { return null; }
  public static <T> void join(java.lang.Iterable<? extends T> p0, com.intellij.util.Function<? super T, ? extends java.lang.CharSequence> p1, java.lang.String p2, java.lang.StringBuilder p3) {}
  public static java.lang.String join(java.util.Collection<java.lang.String> p0, java.lang.String p1) { return null; }
  public static void join(java.util.Collection<java.lang.String> p0, java.lang.String p1, java.lang.StringBuilder p2) {}
  public static java.lang.String join(int[] p0, java.lang.String p1) { return null; }
  public static java.lang.String join(java.lang.String... p0) { return null; }
  public static java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> joining() { return null; }
  public static java.lang.String stripQuotesAroundValue(java.lang.String p0) { return null; }
  public static java.lang.String formatFileSize(long p0) { return null; }
  public static java.lang.String formatFileSize(long p0, java.lang.String p1) { return null; }
  public static java.lang.String formatDuration(long p0) { return null; }
  public static java.lang.String formatDuration(java.time.Duration p0) { return null; }
  public static java.lang.String unpluralize(java.lang.String p0) { return null; }
  public static boolean containsAlphaCharacters(java.lang.String p0) { return false; }
  public static boolean containsAnyChar(java.lang.String p0, java.lang.String p1) { return false; }
  public static boolean containsAnyChar(java.lang.String p0, java.lang.String p1, int p2, int p3) { return false; }
  public static boolean containsChar(java.lang.String p0, char p1) { return false; }
  public static java.lang.String strip(java.lang.String p0, com.intellij.openapi.util.text.CharFilter p1) { return null; }
  public static java.lang.String trim(java.lang.String p0, com.intellij.openapi.util.text.CharFilter p1) { return null; }
  public static java.util.List<java.lang.String> findMatches(java.lang.String p0, java.util.regex.Pattern p1) { return null; }
  public static java.util.List<java.lang.String> findMatches(java.lang.String p0, java.util.regex.Pattern p1, int p2) { return null; }
  public static int findFirst(java.lang.CharSequence p0, com.intellij.openapi.util.text.CharFilter p1) { return 0; }
  public static java.lang.String replaceSubstring(java.lang.String p0, com.intellij.openapi.util.TextRange p1, java.lang.String p2) { return null; }
  public static boolean startsWithWhitespace(java.lang.String p0) { return false; }
  public static boolean isChar(java.lang.CharSequence p0, int p1, char p2) { return false; }
  public static boolean startsWith(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static boolean startsWith(java.lang.CharSequence p0, int p1, java.lang.CharSequence p2) { return false; }
  public static boolean endsWith(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static boolean endsWith(java.lang.CharSequence p0, int p1, int p2, java.lang.CharSequence p3) { return false; }
  public static java.lang.String commonPrefix(java.lang.String p0, java.lang.String p1) { return null; }
  public static int commonPrefixLength(java.lang.CharSequence p0, java.lang.CharSequence p1) { return 0; }
  public static int commonPrefixLength(java.lang.CharSequence p0, java.lang.CharSequence p1, boolean p2) { return 0; }
  public static java.lang.String commonSuffix(java.lang.String p0, java.lang.String p1) { return null; }
  public static int commonSuffixLength(java.lang.CharSequence p0, java.lang.CharSequence p1) { return 0; }
  public static boolean contains(java.lang.CharSequence p0, int p1, int p2, char p3) { return false; }
  public static boolean containsWhitespaces(java.lang.CharSequence p0) { return false; }
  public static int indexOf(java.lang.CharSequence p0, char p1) { return 0; }
  public static int indexOf(java.lang.CharSequence p0, char p1, int p2) { return 0; }
  public static int indexOf(java.lang.CharSequence p0, char p1, int p2, int p3) { return 0; }
  public static boolean contains(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static int indexOf(java.lang.CharSequence p0, java.lang.CharSequence p1) { return 0; }
  public static int indexOf(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2) { return 0; }
  public static int indexOf(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2, int p3) { return 0; }
  public static int indexOf(java.lang.CharSequence p0, char p1, int p2, int p3, boolean p4) { return 0; }
  public static int indexOf(char[] p0, char p1, int p2, int p3, boolean p4) { return 0; }
  public static int indexOfSubstringEnd(java.lang.String p0, java.lang.String p1) { return 0; }
  public static int indexOfAny(java.lang.String p0, java.lang.String p1) { return 0; }
  public static int indexOfAny(java.lang.CharSequence p0, java.lang.String p1) { return 0; }
  public static int indexOfAny(java.lang.String p0, java.lang.String p1, int p2, int p3) { return 0; }
  public static int indexOfAny(java.lang.CharSequence p0, java.lang.String p1, int p2, int p3) { return 0; }
  public static int lastIndexOfAny(java.lang.CharSequence p0, java.lang.String p1) { return 0; }
  public static java.lang.String substringBefore(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String substringBeforeLast(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String substringBeforeLast(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
  public static java.lang.String substringAfter(java.lang.String p0, java.lang.String p1) { return null; }
  public static java.lang.String substringAfterLast(java.lang.String p0, java.lang.String p1) { return null; }
  public static int lastIndexOf(java.lang.CharSequence p0, char p1, int p2, int p3) { return 0; }
  public static java.lang.String first(java.lang.String p0, int p1, boolean p2) { return null; }
  public static java.lang.CharSequence first(java.lang.CharSequence p0, int p1, boolean p2) { return null; }
  public static java.lang.CharSequence last(java.lang.CharSequence p0, int p1, boolean p2) { return null; }
  public static java.lang.String firstLast(java.lang.String p0, int p1) { return null; }
  public static java.lang.String escapeChar(java.lang.String p0, char p1) { return null; }
  public static java.lang.String escapeChars(java.lang.String p0, char... p1) { return null; }
  public static void escapeChar(java.lang.StringBuilder p0, char p1) {}
  public static java.lang.String escapeQuotes(java.lang.String p0) { return null; }
  public static void escapeQuotes(java.lang.StringBuilder p0) {}
  public static java.lang.String escapeSlashes(java.lang.String p0) { return null; }
  public static java.lang.String escapeBackSlashes(java.lang.String p0) { return null; }
  public static java.lang.String unescapeBackSlashes(java.lang.String p0) { return null; }
  public static java.lang.String unescapeChar(java.lang.String p0, char p1) { return null; }
  public static void quote(java.lang.StringBuilder p0) {}
  public static void quote(java.lang.StringBuilder p0, char p1) {}
  public static java.lang.String wrapWithDoubleQuote(java.lang.String p0) { return null; }
  public static java.lang.String unescapeXml(java.lang.String p0) { return null; }
  public static java.lang.String escapeXml(java.lang.String p0) { return null; }
  public static java.lang.String unescapeXmlEntities(java.lang.String p0) { return null; }
  public static java.lang.String escapeXmlEntities(java.lang.String p0) { return null; }
  public static java.lang.String removeHtmlTags(java.lang.String p0) { return null; }
  public static java.lang.String removeHtmlTags(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String removeEllipsisSuffix(java.lang.String p0) { return null; }
  public static java.lang.String escapeMnemonics(java.lang.String p0) { return null; }
  public static java.lang.String htmlEmphasize(java.lang.String p0) { return null; }
  public static java.lang.String escapeToRegexp(java.lang.String p0) { return null; }
  public static java.lang.StringBuilder escapeToRegexp(java.lang.CharSequence p0, java.lang.StringBuilder p1) { return null; }
  public static boolean isEscapedBackslash(java.lang.CharSequence p0, int p1, int p2) { return false; }
  public static java.lang.String replace(java.lang.String p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2) { return null; }
  public static java.lang.String[] filterEmptyStrings(java.lang.String[] p0) { return null; }
  public static int countNewLines(java.lang.CharSequence p0) { return 0; }
  public static int countChars(java.lang.CharSequence p0, char p1) { return 0; }
  public static int countChars(java.lang.CharSequence p0, char p1, int p2, boolean p3) { return 0; }
  public static int countChars(java.lang.CharSequence p0, char p1, int p2, int p3, boolean p4) { return 0; }
  public static java.lang.String joinOrNull(java.lang.String... p0) { return null; }
  public static java.lang.String getPropertyName(java.lang.String p0) { return null; }
  public static boolean isJavaIdentifierStart(char p0) { return false; }
  public static boolean isJavaIdentifierPart(char p0) { return false; }
  public static boolean isJavaIdentifier(java.lang.String p0) { return false; }
  public static boolean isJavaIdentifier(java.lang.CharSequence p0, int p1, int p2) { return false; }
  public static java.lang.String escapeProperty(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String getQualifiedName(java.lang.String p0, java.lang.String p1) { return null; }
  public static int compareVersionNumbers(java.lang.String p0, java.lang.String p1) { return 0; }
  public static int getOccurrenceCount(java.lang.String p0, char p1) { return 0; }
  public static int getOccurrenceCount(java.lang.String p0, java.lang.String p1) { return 0; }
  public static java.lang.String fixVariableNameDerivedFromPropertyName(java.lang.String p0) { return null; }
  public static java.lang.String sanitizeJavaIdentifier(java.lang.String p0) { return null; }
  public static void assertValidSeparators(java.lang.CharSequence p0) {}
  public static java.lang.String tail(java.lang.String p0, int p1) { return null; }
  public static java.lang.String[] splitByLines(java.lang.String p0) { return null; }
  public static java.lang.String[] splitByLines(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.String[] splitByLinesDontTrim(java.lang.String p0) { return null; }
  public static java.lang.String[] splitByLinesKeepSeparators(java.lang.String p0) { return null; }
  public static java.util.List<com.intellij.openapi.util.Pair<java.lang.String, java.lang.Integer>> getWordsWithOffset(java.lang.String p0) { return null; }
  public static int naturalCompare(java.lang.String p0, java.lang.String p1) { return 0; }
  public static boolean isDecimalDigit(char p0) { return false; }
  public static boolean isNotNegativeNumber(java.lang.CharSequence p0) { return false; }
  public static int compare(java.lang.String p0, java.lang.String p1, boolean p2) { return 0; }
  public static int compare(java.lang.CharSequence p0, java.lang.CharSequence p1, boolean p2) { return 0; }
  public static int comparePairs(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) { return 0; }
  public static boolean equals(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static boolean equalsIgnoreCase(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static boolean equalsIgnoreWhitespaces(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static boolean equalsTrimWhitespaces(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static java.lang.String collapseWhiteSpace(java.lang.CharSequence p0) { return null; }
  public static boolean findIgnoreCase(java.lang.String p0, java.lang.String... p1) { return false; }
  public static int compare(char p0, char p1, boolean p2) { return 0; }
  public static java.lang.String formatLinks(java.lang.String p0) { return null; }
  public static boolean isHexDigit(char p0) { return false; }
  public static boolean isOctalDigit(char p0) { return false; }
  public static java.lang.String shortenTextWithEllipsis(java.lang.String p0, int p1, int p2) { return null; }
  public static java.lang.String trimMiddle(java.lang.String p0, int p1) { return null; }
  public static java.lang.String shortenTextWithEllipsis(java.lang.String p0, int p1, int p2, java.lang.String p3) { return null; }
  public static java.lang.String shortenTextWithEllipsis(java.lang.String p0, int p1, int p2, boolean p3) { return null; }
  public static java.lang.String shortenPathWithEllipsis(java.lang.String p0, int p1, boolean p2) { return null; }
  public static java.lang.String shortenPathWithEllipsis(java.lang.String p0, int p1) { return null; }
  public static boolean charsEqualIgnoreCase(char p0, char p1) { return false; }
  public static char toUpperCase(char p0) { return 0; }
  public static java.lang.String toUpperCase(java.lang.String p0) { return null; }
  public static char toLowerCase(char p0) { return 0; }
  public static boolean isUpperCase(java.lang.CharSequence p0) { return false; }
  public static boolean isLowerCase(java.lang.CharSequence p0) { return false; }
  public static com.intellij.util.LineSeparator detectSeparators(java.lang.CharSequence p0) { return null; }
  public static com.intellij.util.LineSeparator getLineSeparatorAt(java.lang.CharSequence p0, int p1) { return null; }
  public static java.lang.String convertLineSeparators(java.lang.String p0) { return null; }
  public static java.lang.String convertLineSeparators(java.lang.String p0, java.lang.String p1) { return null; }
  public static int parseInt(java.lang.String p0, int p1) { return 0; }
  public static long parseLong(java.lang.String p0, long p1) { return 0; }
  public static double parseDouble(java.lang.String p0, double p1) { return 0.0; }
  public static <E extends java.lang.Enum<E>> E parseEnum(java.lang.String p0, E p1, java.lang.Class<E> p2) { return null; }
  public static java.lang.String getShortName(java.lang.Class<?> p0) { return null; }
  public static java.lang.String getShortName(java.lang.String p0) { return null; }
  public static java.lang.String getShortName(java.lang.String p0, char p1) { return null; }
  public static boolean isShortNameOf(java.lang.String p0, java.lang.String p1) { return false; }
  public static java.lang.CharSequence newBombedCharSequence(java.lang.CharSequence p0, long p1) { return null; }
  public static boolean trimEnd(java.lang.StringBuilder p0, java.lang.CharSequence p1) { return false; }
  public static boolean isBetween(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return false; }
  public static boolean hasUpperCaseChar(java.lang.String p0) { return false; }
  public static boolean hasLowerCaseChar(java.lang.String p0) { return false; }
  public static java.lang.String replaceUnicodeEscapeSequences(java.lang.String p0) { return null; }
  public static java.lang.String toHexString(byte[] p0) { return null; }
  public static byte[] parseHexString(java.lang.String p0) { return null; }
  public static boolean isLatinAlphanumeric(java.lang.CharSequence p0) { return false; }
  public static boolean isNumeric(java.lang.CharSequence p0) { return false; }
  public static java.lang.String internEmptyString(java.lang.String p0) { return null; }
  public static int skipWhitespaceForward(java.lang.CharSequence p0, int p1) { return 0; }
  public static int skipWhitespaceOrNewLineForward(java.lang.CharSequence p0, int p1) { return 0; }
  public static int skipWhitespaceBackward(java.lang.CharSequence p0, int p1) { return 0; }
  public static int skipWhitespaceOrNewLineBackward(java.lang.CharSequence p0, int p1) { return 0; }
  public static boolean equal(java.lang.CharSequence p0, java.lang.CharSequence p1, boolean p2) { return false; }
  public static java.lang.String convertLineSeparators(java.lang.String p0, boolean p1) { return null; }
  public static java.lang.CharSequence convertLineSeparators(java.lang.CharSequence p0, java.lang.String p1) { return null; }
  public static java.lang.String convertLineSeparators(java.lang.String p0, java.lang.String p1, int[] p2) { return null; }
  public static java.lang.String convertLineSeparators(java.lang.String p0, java.lang.String p1, int[] p2, boolean p3) { return null; }
  public static boolean startsWithIgnoreCase(java.lang.String p0, int p1, java.lang.String p2) { return false; }
  public static boolean endsWithIgnoreCase(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
  public static java.lang.String formatFileSize(long p0, java.lang.String p1, int p2) { return null; }
  public static java.lang.String formatFileSize(long p0, java.lang.String p1, int p2, boolean p3) { return null; }
  public static int rankForFileSize(long p0) { return 0; }
}
