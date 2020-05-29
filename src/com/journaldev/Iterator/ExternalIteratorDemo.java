package com.journaldev.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Iterator
 * @Version:1.0
 */
public class ExternalIteratorDemo {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Rams");
        name.add("Posa");
        name.add("Pankaj");
        Iterator<String> iterator=name.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String string: name
             ) {
            System.out.println(string);

        }
    }
}
