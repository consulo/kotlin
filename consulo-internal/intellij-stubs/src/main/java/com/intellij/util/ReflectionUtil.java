package com.intellij.util;

@SuppressWarnings("all")
public final class ReflectionUtil {
  public static java.util.List<java.lang.reflect.Field> collectFields(java.lang.Class<?> p0) { return null; }
  public static java.lang.reflect.Field findField(java.lang.Class<?> p0, java.lang.Class<?> p1, java.lang.String p2) throws java.lang.NoSuchFieldException { return null; }
  public static java.lang.reflect.Field findAssignableField(java.lang.Class<?> p0, java.lang.Class<?> p1, java.lang.String p2) throws java.lang.NoSuchFieldException { return null; }
  public static java.lang.reflect.Field findFieldInHierarchy(java.lang.Class<?> p0, java.util.function.Predicate<? super java.lang.reflect.Field> p1) { return null; }
  public static void resetField(java.lang.Class<?> p0, java.lang.Class<?> p1, java.lang.String p2) {}
  public static void resetField(java.lang.Object p0, java.lang.String p1) {}
  public static void resetField(java.lang.Object p0, java.lang.reflect.Field p1) {}
  public static java.lang.reflect.Method findMethod(java.util.Collection<java.lang.reflect.Method> p0, java.lang.String p1, java.lang.Class<?>... p2) { return null; }
  public static java.lang.reflect.Method getMethod(java.lang.Class<?> p0, java.lang.String p1, java.lang.Class<?>... p2) { return null; }
  public static java.lang.reflect.Method getDeclaredMethod(java.lang.Class<?> p0, java.lang.String p1, java.lang.Class<?>... p2) { return null; }
  public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0, java.lang.String p1) { return null; }
  public static java.util.List<java.lang.reflect.Method> getClassPublicMethods(java.lang.Class<?> p0) { return null; }
  public static java.util.List<java.lang.reflect.Method> getClassDeclaredMethods(java.lang.Class<?> p0) { return null; }
  public static java.lang.Class<?> getMethodDeclaringClass(java.lang.Class<?> p0, java.lang.String p1, java.lang.Class<?>... p2) { return null; }
  public static <T> T getField(java.lang.Class<?> p0, java.lang.Object p1, java.lang.Class<T> p2, java.lang.String p3) { return null; }
  public static <T> T getStaticFieldValue(java.lang.Class<?> p0, java.lang.Class<T> p1, java.lang.String p2) { return null; }
  public static <T> T getFieldValue(java.lang.reflect.Field p0, java.lang.Object p1) { return null; }
  public static boolean isInstanceField(java.lang.reflect.Field p0) { return false; }
  public static <T> boolean setField(java.lang.Class<?> p0, java.lang.Object p1, java.lang.Class<T> p2, java.lang.String p3, T p4) { return false; }
  public static <T> java.lang.reflect.Constructor<T> getDefaultConstructor(java.lang.Class<T> p0) { return null; }
  public static <T> T newInstance(java.lang.Class<T> p0) { return null; }
  public static <T> T newInstance(java.lang.Class<T> p0, boolean p1) { return null; }
  public static <T> T createInstance(java.lang.reflect.Constructor<T> p0, java.lang.Object... p1) { return null; }
  public static java.lang.Class<?> getGrandCallerClass() { return null; }
  public static java.lang.Class<?> getCallerClass(int p0) { return null; }
  public static void copyFields(java.lang.reflect.Field[] p0, java.lang.Object p1, java.lang.Object p2) {}
  public static void copyFields(java.lang.reflect.Field[] p0, java.lang.Object p1, java.lang.Object p2, com.intellij.openapi.util.DifferenceFilter<?> p3) {}
  public static <T> boolean comparePublicNonFinalFields(T p0, T p1) { return false; }
  public static void copyFieldValue(java.lang.Object p0, java.lang.Object p1, java.lang.reflect.Field p2) throws java.lang.IllegalAccessException {}
  public static java.lang.Class<?> forName(java.lang.String p0) { return null; }
  public static java.lang.Class<?> boxType(java.lang.Class<?> p0) { return null; }
  public static <T, V> java.lang.reflect.Field getTheOnlyVolatileInstanceFieldOfClass(java.lang.Class<T> p0, java.lang.Class<V> p1) { return null; }
  public static java.lang.Object getUnsafe() { return null; }
  public static java.lang.Class<?> findCallerClass(int p0) { return null; }
  public static boolean isAssignable(java.lang.Class<?> p0, java.lang.Class<?> p1) { return false; }
  public static java.lang.String dumpFields(java.lang.Class<?> p0, java.lang.Object p1, java.lang.String... p2) { return null; }
  public static <T> T proxy(java.lang.Class<? extends T> p0, java.lang.reflect.InvocationHandler p1) { return null; }
  public static <T> T proxy(java.lang.ClassLoader p0, java.lang.Class<? extends T> p1, java.lang.reflect.InvocationHandler p2) { return null; }
}
