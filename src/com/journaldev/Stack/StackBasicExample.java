package com.journaldev.Stack;

import java.util.Stack;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Stack
 * @Version:1.0
 */
public class StackBasicExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println("Empty Stack:" + stack);
        System.out.println("Empty Stack: " + stack.isEmpty());
        stack.push(1001);
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println("Non-empty stack:" + stack);
        System.out.println("Stack pop operation:" + stack.pop());
        System.out.println("After pop operation stack:" + stack);
        System.out.println("Stack search operation:" + stack.search(1002));
        System.out.println("Non empty stack:" + stack.isEmpty());
    }
}
