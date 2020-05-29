package com.journaldev.generics;

public class GenericsMethods {

    //    Java Generics Methods
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String[] args) {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Huangwei");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Huangwei");

        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);

// above statement can be written simply as below
//        同时，看到上述加了下滑波浪线，意味着idea默认就识别了下述对于generics methods的调用
        isEqual = GenericsMethods.isEqual(g1, g2);


//        This feature,known as type inference,allow you to invoke a generic method as an
//        ordinary method,without specifying a type between angle brackets.
//        compiler will infer the type that is needed.

        System.out.println(isEqual);
    }
}
