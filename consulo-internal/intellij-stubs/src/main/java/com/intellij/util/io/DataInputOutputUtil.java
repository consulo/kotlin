package com.intellij.util.io;

@SuppressWarnings("all")
public final class DataInputOutputUtil {
  public static final long timeBase = 0;
  public static int readINT(java.io.DataInput p0) throws java.io.IOException { return 0; }
  public static int readINT(java.nio.ByteBuffer p0) { return 0; }
  public static void writeINT(java.io.DataOutput p0, int p1) throws java.io.IOException {}
  public static void writeINT(java.nio.ByteBuffer p0, int p1) {}
  public static long readLONG(java.io.DataInput p0) throws java.io.IOException { return 0; }
  public static long readLONG(java.nio.ByteBuffer p0) throws java.io.IOException { return 0; }
  public static void writeLONG(java.io.DataOutput p0, long p1) throws java.io.IOException {}
  public static int readSINT(java.io.DataInput p0) throws java.io.IOException { return 0; }
  public static void writeSINT(java.io.DataOutput p0, int p1) throws java.io.IOException {}
  public static void writeTIME(java.io.DataOutput p0, long p1) throws java.io.IOException {}
  public static void writeTIME(java.nio.ByteBuffer p0, long p1) {}
  public static long readTIME(java.io.DataInput p0) throws java.io.IOException { return 0; }
  public static long readTIME(java.nio.ByteBuffer p0) { return 0; }
  public static <T> void writeNullable(java.io.DataOutput p0, T p1, com.intellij.util.ThrowableConsumer<? super T, ? extends java.io.IOException> p2) throws java.io.IOException {}
  public static <T> T readNullable(java.io.DataInput p0, com.intellij.openapi.util.ThrowableComputable<? extends T, ? extends java.io.IOException> p1) throws java.io.IOException { return null; }
  public static <T> java.util.List<T> readSeq(java.io.DataInput p0, com.intellij.openapi.util.ThrowableComputable<? extends T, java.io.IOException> p1) throws java.io.IOException { return null; }
  public static <T> void writeSeq(java.io.DataOutput p0, java.util.Collection<? extends T> p1, com.intellij.util.ThrowableConsumer<T, java.io.IOException> p2) throws java.io.IOException {}
}
