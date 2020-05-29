package com.journaldev.generics;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.generics
 * @Version:1.0
 */
public class Data {
    private  String name;
    public Data() {
        System.out.println("No-arg Constructors");
    }

    public Data(String s) {
        System.out.println("Parameterized Constructor");
        this.name=s;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Data d= new Data();
        Data d1 = new Data("Java");
        System.out.println("d1 name:"+d1.getName());
        System.out.println("d name:"+d.getName());
    }
}
