package com.journaldev.Ref;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-07
 * @Description: com.journaldev.Ref
 * @Version:1.0
 */
public class CollectionReflection {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        list.add("hello");
        list.add(123);
        stringArrayList.add("hello");
//        stringArrayList.add(123);

//        说明了，list和stringArrayList的类类型是一样的
//        集合的泛型，其作用就是为了防止输入错误，作用在编译阶段，编译之后就不生效了
//        System.out.println(list.getClass() == stringArrayList.getClass());

        Class stringArrayListClass = stringArrayList.getClass();
        try {
            Method declaredMethod = stringArrayListClass.getDeclaredMethod("add", Object.class);
            declaredMethod.invoke(stringArrayList, 123);
            System.out.println(stringArrayList.size());
            System.out.println(stringArrayList);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
