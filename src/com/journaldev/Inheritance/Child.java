package com.journaldev.Inheritance;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class Child extends Parent {
    private String name;

    public Child(String name) {
        super(name);
    }

    public Child() {
        super();
    }

    public static void main(String[] args) {
        Child child = new Child();

    }

}
