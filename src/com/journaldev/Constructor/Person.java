package com.journaldev.Constructor;

import java.time.Period;

public class Person {
    private int age;

    public Person() {
        System.out.println("Person created");
    }

    public Person(int i) {
        this.age = i;
        System.out.println("Person created with age=  " + i);
    }
}
