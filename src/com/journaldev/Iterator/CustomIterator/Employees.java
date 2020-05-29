package com.journaldev.Iterator.CustomIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Iterator.CustomIterator
 * @Version:1.0
 */

public class Employees implements Iterable{

    private List<Employee> emps = null;

    public Employees(){
        emps = new ArrayList<>();
        emps.add(new Employee(1001,"Rams","Lead", 250000L));
        emps.add(new Employee(1002,"Posa","Dev", 150000L));
        emps.add(new Employee(1003,"Chinni","QA", 150000L));
    }

    @Override
    public Iterator<Employee> iterator() {
        return emps.iterator();
    }

}
