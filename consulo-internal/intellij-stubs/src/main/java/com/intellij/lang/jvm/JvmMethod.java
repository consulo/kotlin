package com.intellij.lang.jvm;
@SuppressWarnings("all")
public interface JvmMethod extends JvmMember {
    default JvmParameter[] getParameters() { return new JvmParameter[0]; }
}
