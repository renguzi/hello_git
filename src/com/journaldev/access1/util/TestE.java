package com.journaldev.access1.util;

import com.journaldev.access1.TestB;

public class TestE extends TestB {
    public static void main(String[] args) {
        new TestB().methodPublic();
//        TestB testB=new TestB();
//        testB.
//        new TestB().methodProtected();
        new TestE().methodProtected();
    }
}
