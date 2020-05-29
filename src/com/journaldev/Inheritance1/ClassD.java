package com.journaldev.Inheritance1;

public class ClassD {
    SuperClass obj = null;

    public ClassD(SuperClass superClass) {
        this.obj = superClass;
    }

    public void test() {
        obj.doSomething();
    }

    public static void main(String[] args) {
        ClassD obj1 = new ClassD(new ClassA());
        ClassD obj2 = new ClassD(new ClassB());
        obj1.test();
        obj2.test();
    }
}
