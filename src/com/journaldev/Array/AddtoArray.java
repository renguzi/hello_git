package com.journaldev.Array;

import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-01
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class AddtoArray {

    public static void main(String[] args) {
        Object[] obj1 = {"1", "2", "3"};
        Object[] obj2 = {"A", "B"};

        Object[] n = addArray(obj1, "5");
        System.out.println(Arrays.toString(n));

        System.out.println(Arrays.toString(addArray(obj1, 5)));
        System.out.println(addArray(obj2,"333"));


    }



    public static Object[] addArray(Object[] objArr, Object... obj) {
        Object[] tempArr = new Object[objArr.length + obj.length];
        System.arraycopy(objArr,0, tempArr,0,objArr.length);
        for (int i = 0; i <obj.length ; i++) {
            tempArr[objArr.length+i] = obj[i];
        }
        return tempArr;
    }
}
