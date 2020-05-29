package com.journaldev.Ref;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-05
 * @Description: com.journaldev.Ref
 * @Version:1.0
 */
public class ClassDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Foo foo = new Foo();
        Class c1 = Foo.class;
        Class c2 = foo.getClass();
        System.out.println(c1 == c2);
        Class c3 = Class.forName("com.journaldev.Ref.Foo");
        Class c4=double.class;
        Class c5=Double.class;
        System.out.println("c4= "+c4+"c5= "+c5);
        System.out.println("c4==c5:"+( c4 == c5));

        try {
            Foo foo1= (Foo) c3.newInstance();
            foo1.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

class Foo {
    void print() {
        System.out.println("Foo");
    }
}
