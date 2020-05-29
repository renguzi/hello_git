package com.journaldev.Array;

import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-03
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class ArrayShallowCopy {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Jack");
        employees[1] = new Employee("Tom");
        System.out.println(Arrays.toString(employees));

        Employee[] employees1 = new Employee[2];
        System.arraycopy(employees, 0, employees1, 0, 2);
        System.out.println(Arrays.toString(employees1));

        Employee[] employees2 = new Employee[2];
        employees2 = fullCopy(employees);

        employees[0].setName("Java");
        System.out.println(Arrays.toString(employees1));


        System.out.println(Arrays.toString(employees2));


    }

    public static   Employee[] fullCopy(Employee[] e) {
        Employee[] dest = new Employee[e.length];
        for (int i = 0; i < e.length; i++) {
            Employee employee = e[i];
            Employee temp= new Employee(employee.getName());
            dest[i]=temp;
        }
        return dest;
    }

   static class Employee{
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
