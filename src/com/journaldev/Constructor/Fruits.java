package com.journaldev.Constructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.Constructor
 * @Version:1.0
 */
public class Fruits {
    private List<String> fruitList;

    public List<String> getFruitList() {
        return this.fruitList;
    }

    public void setFruitList(List<String> fruitList) {
        this.fruitList=fruitList;
    }

    public Fruits(List<String> f1) {
        this.fruitList=f1;
    }

    public Fruits(Fruits fruits) {
        List<String> f1=new ArrayList<>();
        for (String f : fruits.getFruitList()) {
            f1.add(f);
        }
        this.fruitList=f1;
    }

}
