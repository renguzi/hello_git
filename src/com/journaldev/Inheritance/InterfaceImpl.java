package com.journaldev.Inheritance;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class InterfaceImpl implements InterfaceA, InterfaceB, InterfaceC {
    @Override
    public void doSomething() {
        System.out.println("doSomething implementation of concrete class");
    }

    public static void main(String[] args) {
        InterfaceA interfaceA = new InterfaceImpl();
        InterfaceB interfaceB = new InterfaceImpl();
        InterfaceC interfaceC = new InterfaceImpl();
        interfaceA.doSomething();
        interfaceB.doSomething();
        interfaceC.doSomething();
    }
}
