package com.journaldev.Annotation;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-03
 * @Description: com.journaldev.Annotation
 * @Version:1.0
 */


public class AnnotationExample {

    public static void main(String[] args) {

    }
    @Override
    @MethodInfo(author = "Pankaj", date = "Mar 02 2020", revision = 1, comment = "Test")
    public String toString(){
        return "Overriden toString method";
    }

    @SuppressWarnings({"unchecked","depreciation"})
    @MethodInfo(author = "Pankaj", date = "Mar 03 2020", revision = 1, comment = "test")
    public static void genericsTest() {
        List list=new ArrayList();
        list.add("abc");
        oldMethod();
    }

    @Deprecated
    @MethodInfo(author = "Pankaj",date = "Mar 02 2020",revision = 1,comment = "old")
    private static void oldMethod() {
        System.out.println("old method ,dont use it");
    }
}
