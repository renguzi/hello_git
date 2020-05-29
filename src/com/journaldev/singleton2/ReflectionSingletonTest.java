package com.journaldev.singleton2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton eagerInitializedSingletonOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingletonTwo = null;
        Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
        for (Constructor c: constructors
             ) {
            c.setAccessible(true);
            try {
                eagerInitializedSingletonTwo = (EagerInitializedSingleton) c.newInstance();
                break;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println(eagerInitializedSingletonOne.hashCode());
        System.out.println(eagerInitializedSingletonTwo.hashCode());
    }
}
