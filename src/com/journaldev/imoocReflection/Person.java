package com.journaldev.imoocReflection;

import java.time.Period;

/**
 * @Author: Asher Huang
 * @Date: 2020-04-06
 * @Description: com.journaldev.imoocReflection
 * @Version:1.0
 */
public class Person {
    private  Integer id;
    private String name;

    public Person() {
    }

    public Person(Integer id, String name) {
        this.id=id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("eat something....");
    }
}
