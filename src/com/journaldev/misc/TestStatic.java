package com.journaldev.misc;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-25
 * @Description: com.journaldev.misc
 * @Version:1.0
 */
public class TestStatic {
    public static void main(String[] args) {
        StaticExample.setCount(5);
        System.out.println(StaticExample.str);

        StaticExample.str = "abc";
        StaticExample se = new StaticExample();
        System.out.println(se.getCount());
        System.out.println(StaticExample.str + "is same as " + se.str);
        System.out.println(StaticExample.str == se.str);

        StaticExample.MyStaticClass myStaticClass = new StaticExample.MyStaticClass();
        myStaticClass.count = 10;

        StaticExample.MyStaticClass myStaticClass1 = new StaticExample.MyStaticClass();
        myStaticClass1.count = 20;

        System.out.println(myStaticClass.count);
        System.out.println(myStaticClass1.count);


    }
}
