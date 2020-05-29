package com.journaldev.Inheritance;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class MainClass1 {
    static {
        class Foo {

        }
        Foo foo = new Foo();
    }

    public void bar() {
        if (1 < 2) {
            class Bar{
            }
            Bar bar = new Bar();
        }
    }
}
