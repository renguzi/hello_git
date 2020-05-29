package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-14
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListForEachExample {
    public static void main(String[] args) {
        List<String> stocks = new ArrayList<String>();
        stocks.add("Google");
        stocks.add("Apple");
        stocks.add("Facebook");
        stocks.add("ALIGN");


        Consumer<Object> consumer = new ArrayListForEachExample().new MyConsumer();
        stocks.forEach(consumer);
        stocks.forEach(x -> {
            System.out.println("Processed" + x);
        });
    }
    class MyConsumer implements Consumer<Object> {

        @Override
        public void accept(Object o) {
            System.out.println("Processing" + o);
        }
    }

}
