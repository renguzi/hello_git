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
public class StackToListExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        List<Integer> list=new ArrayList<>();
        list.addAll(stack);
        System.out.println(list);

        List<String> list1=new ArrayList<>();
        list1.addAll(Collections.singleton(stack.toString()));
        System.out.println(list1);
        System.out.println(list1.size());
    }
}
