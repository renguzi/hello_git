package com.journaldev.Constructor;

public class Student extends Person {
    private String name;

    public Student() {
        System.out.println("Student created");
    }

    public Student(String name, int i) {
        super(i);
        this.name = name;
        System.out.println("Student created with name= " + name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Huangwei", 30);
    }
}
