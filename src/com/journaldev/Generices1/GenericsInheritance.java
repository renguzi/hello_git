package com.journaldev.Generices1;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-23
 * @Description: com.journaldev.Generices1
 * @Version:1.0
 */
public class GenericsInheritance {
    public static class MyClass<T> {

    }

    public static void main(String[] args) {
        String str = "abc";
        Object obj = new Object();
        obj = str;
        MyClass<String> myClass1 = new MyClass<String>();
        MyClass<Object> myClass2 = new MyClass<Object>();
//        myClass2 = myClass1;

        obj=myClass1;
//        str = myClass1;

    }
}
