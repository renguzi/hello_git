package com.journaldev.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Stack
 * @Version:1.0
 */
public class ListToStackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        stack.addAll(list);
        System.out.println("stack :" + stack);
        System.out.println("list: "+list);
    }
}
