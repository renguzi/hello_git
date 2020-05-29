package com.journaldev.ComparableAndComparator;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-19
 * @Description: com.journaldev.ComparableAndComparator
 * @Version:1.0
 */
public class JavaObjectSorting {
    public static void main(String[] args) {
        int[] ints = {5, 9, 1, 10};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String[] strArray = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
        List<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("C");
        stringList.add("B");
        stringList.add("Z");
        stringList.add("E");

        Collections.sort(stringList);
        for (String s: stringList
             ) {
            System.out.println(s);
        }

        Employee[] employees = new Employee[4];
        employees[0] = new Employee(10, "Mikey", 25, 10000);
        employees[1] = new Employee(20, "Arun", 29, 20000);
        employees[2] = new Employee(5, "Lisa", 35, 5000);
        employees[3] = new Employee(1, "Pankaj", 32, 50000);
        Arrays.sort(employees);
        System.out.println("Default Sorting of Employees list:" + Arrays.toString(employees));

        Arrays.sort(employees,Employee.SalaryComparator);
        System.out.println("Salary Order"+Arrays.toString(employees));

        Arrays.sort(employees, Employee.AgeComparator);
        System.out.println("Age order:" + Arrays.toString(employees));

        Arrays.sort(employees,Employee.NameComparator);
        System.out.println("Name order:" + Arrays.toString(employees));

        employees[0] = new Employee(1, "SSS", 3, 2000);
        Arrays.sort(employees,new EmployeeComparatorByIdAndName());
        System.out.println("ID and Name order:" + Arrays.toString(employees));


    }

}
