package com.journaldev.Composition;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Composition
 * @Version:1.0
 */
public class Person {
    private  Job job;

    public Person() {
        this.job = new Job();
        job.setSalary(10000);
    }

    public long getSalary() {
        return job.getSalary();
    }
}
