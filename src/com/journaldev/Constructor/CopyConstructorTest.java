package com.journaldev.Constructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.Constructor
 * @Version:1.0
 */
public class CopyConstructorTest {
    public static void main(String[] args) {
        List<String> f1 = new ArrayList<>();
        f1.add("Mango");
        f1.add("Orange");

        Fruits fr = new Fruits(f1);
        System.out.println(fr.getFruitList());

        Fruits frCopy=fr;
        frCopy.getFruitList().add("Apple");
        System.out.println(fr.getFruitList());


        frCopy = new Fruits(fr);
        frCopy.getFruitList().add("Banana");
        System.out.println(fr.getFruitList());
        System.out.println(frCopy.getFruitList());

    }
}
