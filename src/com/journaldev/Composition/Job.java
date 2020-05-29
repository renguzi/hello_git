package com.journaldev.Composition;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Composition
 * @Version:1.0
 */
public class Job {
    private  int id;
    private String name;
    private long salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
