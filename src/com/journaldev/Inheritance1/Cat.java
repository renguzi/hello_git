package com.journaldev.Inheritance1;

public class Cat extends Animal{
    private String color;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = "White";
    }

    public Cat(Boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
