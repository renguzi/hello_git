package com.journaldev.Inheritance;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public Parent() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
