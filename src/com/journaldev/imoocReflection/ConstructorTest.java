package com.journaldev.imoocReflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Asher Huang
 * @Date: 2020-04-06
 * @Description: com.journaldev.imoocReflection
 * @Version:1.0
 */
public class ConstructorTest {

    //获得无参构造
    public static void main(String[] args) {

        try {
            Class<?> aClass = Class.forName("com.journaldev.imoocReflection.Person");
            Constructor<?> constructor = aClass.getConstructor();
            Person person = (Person) constructor.newInstance();
            person.eat();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
