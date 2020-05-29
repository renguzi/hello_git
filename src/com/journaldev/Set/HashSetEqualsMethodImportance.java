package com.journaldev.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class HashSetEqualsMethodImportance {
    public static void main(String[] args) {
        Set<Emp> set = new HashSet<>();
        set.add(new Emp(1, "Java"));
        set.add(new Emp(2, "DBA"));
        set.add(new Emp(1, "Java"));

        System.out.println(set);
        Emp emp = new Emp(3, "Mongo");
        set.add(emp);
        System.out.println(set);
        System.out.println(set.size());
        emp.setId(2);
        System.out.println(set);
        emp.setName("DBA");
        System.out.println(set);
        System.out.println(set.size());

    }

    static class Emp {
    private int id;
    private String name;

        public  Emp(int i, String name) {
            this.id=i;
            this.name=name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Emp)) return false;
            Emp emp = (Emp) o;
            return id == emp.id &&
                    Objects.equals(name, emp.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

}
