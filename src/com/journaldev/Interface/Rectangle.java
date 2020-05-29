package com.journaldev.Interface;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-27
 * @Description: com.journaldev.Interface
 * @Version:1.0
 */
public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("drawing Rectangle.");
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
