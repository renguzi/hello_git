package com.journaldev.mooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-16
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class ListTest {
    public List coursesToSelect;

    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    public void testAdd() {
        Course course = new Course("1", "数据结构");
        coursesToSelect.add(course);
        System.out.println("添 加了课程");
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp.id + ": " + temp.name);

        Course course1 = new Course("2", "C语言");
        coursesToSelect.add(0, course1);

        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp2.id + " : " + temp2.name);

        Course[] courses = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) coursesToSelect.get(2);
        Course temp4 = (Course) coursesToSelect.get(3);
        System.out.println("添加了2门课程：" + temp3.id + ": " + temp3.name + "   " + temp4.id + ":   " + temp4.name);

        Course[] courses1 = {new Course("5,", "高等数学"), new Course("6", "大学英语")};

        coursesToSelect.addAll(2, Arrays.asList(courses1));

        Course temp5 = (Course) coursesToSelect.get(2);
        Course temp6 = (Course) coursesToSelect.get(3);

        System.out.println("添加了2门课程：" + temp5.id + temp5.name + "      " + temp6.id + temp6.name);
    }

    public void testModify() {
        coursesToSelect.set(4, new Course("7", "邓论"));
    }

    public void listIterator() {
        Iterator iterator = coursesToSelect.iterator();
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            System.out.println(course.id+ "     "+ course.name);
        }
    }

    public static void main(String[] args) {
        ListTest listTest=new ListTest();
        listTest.testAdd();
        listTest.listIterator();
        listTest.testModify();
        System.out.println("=======================");
        listTest.listIterator();

    }
}
