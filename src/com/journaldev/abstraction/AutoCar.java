package com.journaldev.abstraction;

public class AutoCar implements Car{
    private String carType = "Auto";
    @Override
    public void turnOnCar() {
        System.out.println("turn on the auto car");
    }

    @Override
    public void turnOffCar() {
        System.out.println("Turn off the auto car");
    }

    @Override
    public String getCarType() {
        return carType;
    }
}
