package com.journaldev.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-02
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class ArrayListToArrayMutableObjects {
    public static void main(String[] args) {
//        Person person1 = new Person("Tom");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom"));
        personList.add(new Person("Jack"));

        Person[] people=new Person[personList.size()];
//        people = personList.toArray(people);

         for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            Person temp = new Person(person.getName());
            people[i] = temp;
        }
        System.out.println("original list:" + personList.toString());
        System.out.println("original Array:" + Arrays.toString(people));
        personList.get(0).setName("newname");
        people[1].setName("newSecond");

        System.out.println("new list:" + personList.toString());
        System.out.println("new Array:" + Arrays.toString(people));

    }



    static class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

