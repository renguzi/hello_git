package com.journaldev.AbstractFactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.AbstractFactoryPattern
 * @Version:1.0
 */
public class PCFactory implements ComputerAbstractFactory {
    private String hdd;
    private String cpu;
    private String ram;

    public PCFactory(String ram, String cpu, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, cpu, hdd);
    }
}
