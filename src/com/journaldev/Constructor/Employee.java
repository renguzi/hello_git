package com.journaldev.Constructor;

public class Employee {
    private int id;
    private String name;

    public Employee() {
        this("John Doe", 99);
        System.out.println("Default Employee Created");
    }

    public Employee(int i) {
        this("John Doe", i);
        System.out.println("Employee created with default name");
    }
    public Employee(String s, int i) {
        this.name = s;
        this.id = i;
        System.out.println("Employee Create");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
        Employee employee1 = new Employee(10);
        System.out.println(employee1);
        Employee employee2 = new Employee("Pankj", 20);
        System.out.println(employee2);
    }
}
