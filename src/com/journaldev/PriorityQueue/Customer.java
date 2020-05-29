package com.journaldev.PriorityQueue;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.PriorityQueue
 * @Version:1.0
 */
public class Customer {
    private int id;
    private String name;

    public Customer(int id, String s) {
        this.id=id;
        this.name=s;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
