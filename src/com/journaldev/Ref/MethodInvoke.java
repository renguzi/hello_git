package com.journaldev.Ref;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-07
 * @Description: com.journaldev.Ref
 * @Version:1.0
 */
public class MethodInvoke {
    public static void main(String[] args) {
        /**
         * 用反射来调用方法，其实就是获取类信息，获取类的方法，再去调用方法
         * 1 先要获取类类型；
         * 2 获取类的方法；
         * 3 调用方法；
         */
        InvokeTest invokeTest = new InvokeTest();
//      1  获取InvokeTest类类型
        Class aClass = invokeTest.getClass();
//       2 获取方法，getDeclaredMethods();
        try {
            Method declaredMethod = aClass.getDeclaredMethod("print", int.class, int.class);
            Method declaredMethod1 = aClass.getDeclaredMethod("print", new Class[]{String.class, String.class});
            declaredMethod.invoke(invokeTest, 10, 20);
            declaredMethod1.invoke(invokeTest, new String[]{"helli", "WORLD"});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}


class InvokeTest {
    public void print(int a, int b) {
        System.out.println(a + b);
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + "  " + b.toLowerCase());
    }
}
