package com.journaldev.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-17
 * @Description: com.journaldev.Set.TreeSet
 * @Version:1.0
 */
class Person implements Comparable<Person> {
int id;
String name;

    Person(int id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TreeSetComparable {
    public static void main(String[] args) {
        Set<Person> stringSet=new TreeSet<>();
        stringSet.add(new Person(1, "Mark"));
        stringSet.add(new Person(2, "Vipsi"));
        stringSet.add(new Person(3, "Harmony"));
        System.out.println(stringSet);

        Set<Person> sortedPerson = new TreeSet<>((p1, p2) -> p1.id - p2.id);
        sortedPerson.addAll(stringSet);
        System.out.println(sortedPerson);
    }
}
