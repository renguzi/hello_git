package com.journaldev.abstraction;

public class ManualCar implements Car{
    private String carType = "Manual";
    @Override
    public void turnOnCar() {
        System.out.println("turn on the manual car");
    }

    @Override
    public void turnOffCar() {
        System.out.println("tun off the manual car");
    }

    @Override
    public String getCarType() {
        return carType;
   }
}
