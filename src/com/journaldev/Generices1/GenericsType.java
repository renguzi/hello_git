package com.journaldev.Generices1;


/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.Generices1
 * @Version:1.0
 */
public class GenericsType<T> {

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        GenericsType<String> stringGenericsType = new GenericsType<>();
        stringGenericsType.setT("HuangWei");
        System.out.println(stringGenericsType.getT());

        GenericsType genericsType=new GenericsType();
        genericsType.setT("100");
        System.out.println(genericsType.getT());
    }
}
