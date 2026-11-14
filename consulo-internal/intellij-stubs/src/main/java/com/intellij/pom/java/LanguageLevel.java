package com.intellij.pom.java;

@SuppressWarnings("all")
public enum LanguageLevel {
    JDK_1_3, JDK_1_4, JDK_1_5, JDK_1_6, JDK_1_7, JDK_1_8, JDK_1_9, JDK_11, JDK_17, JDK_21;
    public static LanguageLevel HIGHEST = JDK_21;
}
