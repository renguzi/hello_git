package com.journaldev.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-06
 * @Description: com.journaldev.Singleton
 * @Version:1.0
 */
public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = null;
        try {
            Constructor[] declaredConstructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for ( Constructor constructor:declaredConstructors
                 ) {
                constructor.setAccessible(true);
                singleton2 = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (SecurityException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
