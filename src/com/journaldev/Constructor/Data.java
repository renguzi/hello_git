package com.journaldev.Constructor;

import javax.sql.DataSource;

public class Data {
    private String name;
    private int n;

    public Data() {
        this.name = "Default name";
    }

    public Data(String name) {
        System.out.println("Parameterized constructors.");
        this.name = name;
    }

    public Data(String name, int n) {
        this.name=name;
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", n=" + n +
                '}';
    }

    //    public Data() {
//        System.out.println("No-args constructors");
//    }
    public static void main(String[] args) {
        Data d = new Data();
        System.out.println(d);
        d = new Data("Java");
        System.out.println(d);
        d = new Data("Huangwei", 30);
        System.out.println(d);
    }
}
