package com.journaldev.Static;

public class TestStatic {
    public static void main(String[] args) {
        StaticExample.setCount(5);
        StaticExample.str = "abc";
        StaticExample se = new StaticExample();
        System.out.println(se.getCount());
        System.out.println(StaticExample.str + " is same as " + se.str);
        StaticExample.MyStaticClass myStaticClass1 = new StaticExample.MyStaticClass();
        myStaticClass1.count = 10;
        StaticExample.MyStaticClass myStaticClass2 = new StaticExample.MyStaticClass();
        myStaticClass2.count = 20;
        System.out.println(myStaticClass1.count);
        System.out.println(myStaticClass2.count);
    }
}
