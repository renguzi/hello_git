package com.journaldev.Interface;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-27
 * @Description: com.journaldev.Interface
 * @Version:1.0
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("drawing circle.");
    }

    @Override
    public double getArea() {
         return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }
}
