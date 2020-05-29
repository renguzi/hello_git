package com.journaldev.Inheritance;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class ChildClass extends BaseClass {
//    @Override
    public void doSomething(String string) {
        System.out.println("ChildClass impl:" + string);
    }
}
