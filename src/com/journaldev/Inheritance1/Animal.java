package com.journaldev.Inheritance1;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal() {
    }

    public Animal(boolean veg, String food, int noOfLegs) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = noOfLegs;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public String getEats() {
        return this.eats;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getNoOfLegs() {
        return this.noOfLegs;
    }

}
