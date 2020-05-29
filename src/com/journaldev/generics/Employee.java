package com.journaldev.generics;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.generics
 * @Version:1.0
 */
public class Employee {
    private  int id;
    private String name;

    public Employee() {
        this("John Doe", 999);
        System.out.println("Default Employee Created");
    }

    public Employee(int id) {
        this("Jack", 10);
        System.out.println("Employee created with default name");
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Employee Created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Employee huangwei = new Employee("Huangwei", 101);
        System.out.println(huangwei);

    }

}
