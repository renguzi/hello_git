package com.journaldev.mooc;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-16
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class Student {
    public String id;
    public String name;
    public Set courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
}
