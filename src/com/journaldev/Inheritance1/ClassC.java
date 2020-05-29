package com.journaldev.Inheritance1;

public class ClassC  {
    ClassA objA = new ClassA();
    ClassB objB = new ClassB();

    public void test() {
        objA.doSomething();
        objB.doSomething();
    }

    public void methodA() {
        objA.methodA();
    }

    public void methodB() {
        objB.methodB();
    }

    public static void main(String[] args) {
        ClassC objC = new ClassC();
        objC.test();
        objC.objA.doSomething();
    }
}
