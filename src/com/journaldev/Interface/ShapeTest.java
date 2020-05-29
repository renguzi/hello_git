package com.journaldev.Interface;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-27
 * @Description: com.journaldev.Interface
 * @Version:1.0
 */
public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(2, 5);
        circle.draw();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

        rectangle.draw();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
