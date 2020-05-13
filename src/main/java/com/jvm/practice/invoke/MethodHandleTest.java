package com.jvm.practice.invoke;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {

        public static void bar(Object o)
        {
            new Exception().printStackTrace();

        }

        public static void main(String[] args) throws Throwable {
            MethodHandles.Lookup l = MethodHandles.lookup();
            MethodType t = MethodType.methodType(void.class, Object.class);
            MethodHandle mh = l.findStatic(MethodHandleTest.class, "bar", t);
            mh.invokeExact(new Object());
        }


}
