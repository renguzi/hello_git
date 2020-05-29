package com.journaldev.Exception;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-05
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class Temp {
    private int x;
    public static String mutex=null;
    public static void main(String[] args) {
          Temp temp=Temp.initT();
//          temp.foo("Hi");
//          int x=temp.x;
//        bar(null);
//    throw null;
        int[] ints=null;
//        System.out.println(ints.length);
//        ints[0]=1;
//        synchronized (mutex) {
//            System.out.println("Synchronized block");
//        }

//        test(null);

        String s1 = "hi";
        String s2 = new String("hi");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

    public static void test(String s) {
        if ("Test".equals(s)) {
            System.out.println("test");
        }
    }
    public static void bar(String s) {
        System.out.println(s.toUpperCase());
    }
    public static Temp initT() {
        return null;
    }

    public static void foo(String s) {
        System.out.println(s);
    }
}
