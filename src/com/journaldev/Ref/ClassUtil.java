package com.journaldev.Ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-05
 * @Description: com.journaldev.Ref
 * @Version:1.0
 打印类的信息，包括类的成员函数，成员变量
 */
public class ClassUtil {
    public static void printClassMessage(Object object) {
//        要获取类的信息，首先要获取类的类类型，class type
//        传递的是哪个子类，c就是该子类的类类型
        Class c = object.getClass();
//        获取类的名称
        System.out.println("类名称："+c.getName());
//        获取方法信息：
//        万事万物皆对象，方法也是对象，Method类是所有方法的类类型
        Method[] methods = c.getMethods();
        for (Method m1: methods
             ) {
//           获取方法返回值类型的类类型
            Class returnType = m1.getReturnType();
            System.out.print(returnType.getName()+" ");
//            获取方法名，加上左括号
            System.out.print(m1.getName()+"(");
//            获取参数列表
//            获得参数列表类型的类类型，它是一个数组
            Class[] parameterTypes = m1.getParameterTypes();
            for (Class c3: parameterTypes
                 ) {
                System.out.print(c3.getName()+",");
//                parameterTypes[0].ge
            }
            System.out.println(")");

        }


        /**
         * 成员变量也是对象，java.lang.Reflect.Field
         * Field类封装了关于成员变量的操作
         * getFields()获取所有public的成员变量
         * getDeclaredFields()获取该类自己声明的所有成员变量
         *
         */printFieldMessage(c);
    }

    public static void printFieldMessage(Object o) {
        Class<?> aClass = o.getClass();
        //        获取所有自己声明的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
//            获取成员变量类型的类类型（public/private,protected）
            Class<?> fieldType = field.getType();
//            要注意区分开field.getName()和 fieldType.getName();

//            获取成员变量的类类型(int,String,double)
            String fieldTypeName = fieldType.getName();
//            获取成员变量名
            String fieldName = field.getName();
            System.out.println(fieldTypeName + " " + fieldName);
        }
    }


    /**
     * 获取对象的构造函数信息
     */

    public static void printConstructorMessage(Object o) {
        Class<?> aClass = o.getClass();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor c: declaredConstructors
             ) {
//            获取构造函数名
            System.out.print(c.getName()+"(");
//            获取构造函数参数类类型
            Class[] parameterTypes = c.getParameterTypes();
//            获取构造函数参数名
            for (Class c1: parameterTypes
                 ) {
                System.out.print(c1.getName());
            }
            System.out.println(")");
        }
    }

}
