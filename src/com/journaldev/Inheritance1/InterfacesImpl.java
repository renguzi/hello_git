package com.journaldev.Inheritance1;

import com.journaldev.Inheritance.InterfaceImpl;

public class InterfacesImpl implements InterfaceA,InterfaceB,InterfaceC{
    @Override
    public void doSomething() {
        System.out.println("doSomething implementation of concrete class");
    }

    public static void main(String[] args) {
        InterfaceA objA = new InterfacesImpl();
        InterfaceB objB = new InterfacesImpl();
        InterfaceC objC = new InterfacesImpl();

        objA.doSomething();
        objB.doSomething();
        objC.doSomething();
    }
}
