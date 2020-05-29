package com.journaldev.mooc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-12
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("花花", 12, "英国短毛猫");
        Cat fanfan = new Cat("凡凡", 6, "中华宠物猫");
        Set set = new HashSet();

        set.add(huahua);
        set.add(fanfan);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
//            System.out.println( ((Cat)iterator.next()).getName());
            System.out.println( iterator.next());
        }

        Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
        set.add(huahua01);
        iterator = set.iterator();

        System.out.println("=================");

        while (iterator.hasNext()) {
//            System.out.println( ((Cat)iterator.next()).getName());
            System.out.println( iterator.next());
        }


        if (set.contains(huahua01)) {
            System.out.println("花花找到了");
            System.out.println(huahua01);
        } else {
            System.out.println("花花没找到");
        }

        iterator = set.iterator();
        boolean flag=false;
        Cat cat=null;
        while (iterator.hasNext()) {
            cat = ((Cat) iterator.next());
            if (cat.getName() == "花花") {
//                System.out.println("凡凡找到了");
//                System.out.println(cat);
                flag=true;
                break;
            }
        }

        if (flag) {
            System.out.println("凡凡找到了");
            System.out.println(cat);
        } else {
            System.out.println("凡凡没找到");
        }

        System.out.println("foreach loop for set");
        for (Object c: set
             ) {
            System.out.println((Cat)c);
        }
    }
}
