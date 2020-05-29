package com.journaldev.ComparableAndComparator;

import java.util.Comparator;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-20
 * @Description: com.journaldev.ComparableAndComparator
 * @Version:1.0
 */
public class EmployeeComparatorByIdAndName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int flag=o1.getId()-o2.getId();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }
}
