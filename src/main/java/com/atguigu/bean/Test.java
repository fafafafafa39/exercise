package com.atguigu.bean;

import java.lang.reflect.InvocationTargetException;

/**
 * @author xuze
 * @create 2019-11-27 20:36
 */
public class Test {

    public void method1(String name) {
        System.out.println("method1() invoked"+name);
    }

    public void method2(String name) {
        System.out.println("method2() invoked"+name);
    }

    public void method3(String name) {
        System.out.println("method3() invoked"+name);
    }

    public void invokeMethod(String methodName,String name) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Test.class.getMethod(methodName,String.class).invoke(this,name);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        new Test().invokeMethod("method2","xuze");
    }
}
