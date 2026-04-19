package com.intellij.psi.stubs;

@SuppressWarnings("all")
public class StubOutputStream extends com.intellij.util.io.DataOutputStream {
  public StubOutputStream(java.io.OutputStream p0, com.intellij.util.io.AbstractStringEnumerator p1) { super(p0); }
  public void writeUTFFast(java.lang.String p0) throws java.io.IOException {}
  public void writeName(java.lang.String p0) throws java.io.IOException {}
  public void writeVarInt(int p0) throws java.io.IOException {}
}
