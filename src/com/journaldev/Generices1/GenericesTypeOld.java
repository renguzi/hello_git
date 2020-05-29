package com.journaldev.Generices1;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.Generices1
 * @Version:1.0
 */
public class GenericesTypeOld {
    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t=t;
    }

    public static void main(String[] args) {
        GenericesTypeOld genericesTypeOld=new GenericesTypeOld();
        genericesTypeOld.set("Hello");
        System.out.println(genericesTypeOld.get());
        String s = (String) genericesTypeOld.get();
        System.out.println(s);
    }
}
