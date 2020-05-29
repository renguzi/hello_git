package com.journaldev.mooc;

import java.util.Objects;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-12
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class Cat {
    private String name;
    private int month;
    private String species;

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getMonth() == cat.getMonth() &&
                getName().equals(cat.getName()) &&
                getSpecies().equals(cat.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMonth(), getSpecies());
    }
}
