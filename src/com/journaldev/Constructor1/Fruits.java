package com.journaldev.Constructor1;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private List<String> fruitsList;

    public void setFruitsList(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public List<String> getFruitsList() {
        return fruitsList;
    }

    public Fruits(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public Fruits(Fruits fruits) {
        List<String> f1 = new ArrayList<>();
        for (String f : fruits.getFruitsList()) {
            f1.add(f);
        }
        this.fruitsList = f1;
    }
}
