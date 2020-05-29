package com.journaldev.Inheritance;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        BaseClass bc = new ChildClass();
        bc.doSomething("override");

    }
}
