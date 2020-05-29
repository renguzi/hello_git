package com.journaldev.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-03
 * @Description: com.journaldev.Annotation
 * @Version:1.0
 */
public class AnnotationParsing {
    public static void main(String[] args) {
        try {
            for (Method method : AnnotationParsing.class.getClassLoader().loadClass("com.journaldev.Annotation.AnnotationExample").getMethods()) {
                if (method.isAnnotationPresent(com.journaldev.Annotation.MethodInfo.class)) {
                    try {
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '" + method + "' : " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
