package com.journaldev.Array;

import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-02
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class Arrays {
    public static void main(String[] args) {
        String[] strings = {"hello", "wolrld", "coronavirus"};


        List<String> stringList = java.util.Arrays.asList(strings);
        System.out.println(stringList);
        System.out.println(stringList.size());
        stringList.toArray();

        int[] ints = {5, 2, 1, 4, 3, 9, 6, 8, 7, 10};
        int index = java.util.Arrays.binarySearch(ints, 2);
        if (index >= 0) {
            System.out.println("Finde the element at:" + index);
        } else {
            System.out.println("Cant find the element.");
        }

        int beginindex=3;
        int endindex = 9;
        int mid=(beginindex+endindex)>>>1;
        System.out.println(mid);
        int index2 = java.util.Arrays.binarySearch(ints, beginindex, endindex, 6);
        if (index2 >= 0) {
            System.out.println("Finde the element at:" + index2);
        } else {
            System.out.println("Cant find the element.");
        }

        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String[] arr1 = {"1", "2,3"};
        String[] arr2 = {"1", "2,3"};
        System.out.println(java.util.Arrays.equals(arr1, arr2));

        Object[] obj1 = {arr1};
        Object[] obj2 = {arr2};
        System.out.println(java.util.Arrays.equals(obj1, obj2));
        System.out.println(java.util.Arrays.deepEquals(obj1, obj2));
    }
}
