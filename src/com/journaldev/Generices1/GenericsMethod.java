package com.journaldev.Generices1;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.Generices1
 * @Version:1.0
 */
public class GenericsMethod {
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.getT().equals(g2.getT());
    }

    public static void main(String[] args) {
        GenericsType<String> gt1 = new GenericsType<>();
        gt1.setT("Java");
        GenericsType<String> gt2 = new GenericsType<>();
        gt2.setT("Java");
        boolean equal = GenericsMethod.<String>isEqual(gt1, gt2);
        System.out.println(equal);
        equal = GenericsMethod.isEqual(gt1, gt2);

    }
}
