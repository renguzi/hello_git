package com.journaldev.Ref;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-03
 * @Description: com.journaldev.Ref
 * @Version:1.0
 */
public class BaseClass {
    public int baseInt;

    private static void method3() {
        System.out.println("Method3");
    }

    public int method4() {
        System.out.println("Method4");
        return 0;
    }

    public static int method5() {
        System.out.println("Method5");
        return 0;
    }

    void method6() {
        System.out.println("Method6");
    }

    public class BaseClassInnerClass {
    }

    public enum BaseClassMemberEnum {
    }
}
