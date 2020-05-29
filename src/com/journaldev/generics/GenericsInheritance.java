package com.journaldev.generics;

public class GenericsInheritance {
    public static class MyClass<T>{}

    public static void main(String[] args) {
        String str = "ABC";
        Object obj = new Object();
//        works because String is-a Object,inheritance in java
        obj= str;

        MyClass<String> myClass1= new MyClass<String>();
        MyClass<Object> myClass2= new MyClass<Object>();
//        compilation error,since MyClass<String> is not a MyClass<Object>
//        myClass2=myClass1;
//We are not allowed to assign MyClass<String> variable to MyClass<Object> variable
//        because the are not related,in fact MyClass<T> parent is Object.


        obj=myClass2;
//        MyClass<T> parent is Object
        obj=myClass1;
    }
}