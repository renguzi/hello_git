package com.journaldev.InnerClass;

import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-10
 * @Description: com.journaldev.InnerClass
 * @Version:1.0
 */
public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(1, 2, 3, 4);

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        OuterClass.StaticNestedClass staticNestedClass1 = new OuterClass.StaticNestedClass();

        System.out.println(staticNestedClass.getName());
        staticNestedClass.d = 10;
        System.out.println(staticNestedClass.d);
        System.out.println(staticNestedClass1.d);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.getName());
        System.out.println(innerClass);
        innerClass.setValues();
        System.out.println(innerClass);

        outerClass.print("Outer");
        System.out.println(Arrays.toString(outerClass.getFilesInDir("src/com/journaldev/InnerClass", ".java")));
        System.out.println(Arrays.toString(outerClass.getFilesInDir("bin/com/journaldev/InnerClass", ".class")));
    }
}
