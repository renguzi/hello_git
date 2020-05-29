package com.journaldev.Constructor1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CopyConstructorTest {
    public static void main(String[] args) {
        List<String> f1=new ArrayList<>();
        f1.add("Mango");
        f1.add("Orange");

        Fruits fr = new Fruits(f1);
        System.out.println(fr.getFruitsList());

        Fruits frCopy=fr;
        System.out.println(frCopy.getFruitsList().add("Apple"));
        System.out.println(frCopy.getFruitsList());
        frCopy = new Fruits(fr);
        frCopy.getFruitsList().add("Banana");
        System.out.println(frCopy.getFruitsList());

    }


}
