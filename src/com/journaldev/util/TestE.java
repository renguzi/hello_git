package com.journaldev.util;

import com.journaldev.access.TestB;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.util
 * @Version:1.0
 */
public class TestE extends TestB {
    public static void main(String[] args) {
        new TestB().methodPublic();
//        compile error，值得多研究下。
        //        new TestB().methodProtected();
        TestE e= (TestE) new TestB();
        e.methodProtected();
        new TestE().methodProtected();

        TestE e1=new TestE();
        e1.methodProtected();
    }

}
