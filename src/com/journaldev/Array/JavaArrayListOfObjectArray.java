package com.journaldev.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-01
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class JavaArrayListOfObjectArray {
    public static void main(String[] args) {
        List<Object[]> list = new ArrayList<Object[]>();
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"1", "2", "3", "4"};
        JavaArrayListOfObjectArray aa = new JavaArrayListOfObjectArray();
        JavaArrayListOfObjectArray.A[] arr3 = {aa.new A("AA"), aa.new A("BB")};

        JavaArrayListOfObjectArray.A[] arr4 = {new JavaArrayListOfObjectArray().new A("CC"),
                                               new JavaArrayListOfObjectArray().new A("DD")};
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);

        for (Object[] obj: list
             ) {
            System.out.println(Arrays.toString(obj));

            for (Object obj1: obj
                 ) {
                if (obj1 instanceof String) {
                    System.out.println(obj1.getClass());
                    System.out.println(obj1);
                }
                if (obj1 instanceof JavaArrayListOfObjectArray.A) {
                    System.out.println(((A) obj1).getName() + obj1.toString());
                }

            }

        }



    }

    class A{
        private String name;

        public A(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "A.class::"+this.name;
        }
    }
}
