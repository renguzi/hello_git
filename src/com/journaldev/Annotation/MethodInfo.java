package com.journaldev.Annotation;

import java.lang.annotation.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-03
 * @Description: com.journaldev.Annotation
 * @Version:1.0
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
        String author() default "Pankaj";
        String date();
        int revision() default 1;
        String comment();
}
