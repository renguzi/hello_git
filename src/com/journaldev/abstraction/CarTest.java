package com.journaldev.abstraction;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new AutoCar();
        Car car2 = new ManualCar();
        car1.turnOnCar();
        car1.turnOffCar();
        System.out.println(car1.getCarType());

        car2.turnOnCar();
        car2.turnOffCar();
        System.out.println(car2.getCarType());

        String[] s = of("hello", "world");
        System.out.println(s.length);
        System.out.println(s);
    }

    private static <T> T[] of(T...result) {
        return result;
    }
}
