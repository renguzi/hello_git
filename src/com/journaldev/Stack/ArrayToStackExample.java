package com.journaldev.Stack;

import java.util.Stack;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Stack
 * @Version:1.0
 */
public class ArrayToStackExample {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4};
        Stack<Integer> stack = new Stack<>();
        for (Integer integer: integers
             ) {stack.push(integer);
        }
        System.out.println("Stack is :" + stack);
    }
}
