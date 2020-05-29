package com.journaldev.mooc;

import java.util.ArrayList;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-11
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("Go");
        list.add("SWIFT");
        list.add("C");
        System.out.println("列表中的元素个数：" + list.size());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        list.remove("C++");
        System.out.println("移除C++之后");
        System.out.println(list);

    }
}
