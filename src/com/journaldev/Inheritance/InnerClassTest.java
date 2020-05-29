package com.journaldev.Inheritance;

import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(1, 2, 3, 4);
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        OuterClass.StaticNestedClass staticNestedClass1 = new OuterClass.StaticNestedClass();
        System.out.println(staticNestedClass.getName());
        staticNestedClass.d=10;
        System.out.println(staticNestedClass.d);
        System.out.println(staticNestedClass1.d);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.getName());
        System.out.println(innerClass);
        innerClass.setValues();
        System.out.println(innerClass.getW());
        System.out.println(innerClass);

        outerClass.print("outer");
        System.out.println(Arrays.toString(outerClass.getFilesInDir("src/com/journaldev/nested", ".java")));
        System.out.println(Arrays.toString(outerClass.getFilesInDir("bin/com/journaldev/nested", ".class")));





    }
}
