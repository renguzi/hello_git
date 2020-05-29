package com.journaldev.misc;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-25
 * @Description: com.journaldev.misc
 * @Version:1.0
 */
public class StaticExample {
    static{
        System.out.println("StaticExample static block");
        str = "Test";

    }

    static {
        System.out.println("StaticExample static block2");
    }

    private static int count;
    public static String str;

    public int getCount() {
        return count;
    }

    public static void setCount(int count) {
        if (count > 0) {
            StaticExample.count = count;
        }
    }

    public static int addInsts(int i, int... js) {
        int sum=i;
        for (int x:js
             ) {sum+=x;
        }
        return sum;
    }

    public static class MyStaticClass{
        public int count;
    }

}
