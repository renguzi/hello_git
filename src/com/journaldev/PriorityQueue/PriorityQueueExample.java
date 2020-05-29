package com.journaldev.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.PriorityQueue
 * @Version:1.0
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            integerPriorityQueue.add(random.nextInt(100));
        }
        System.out.println(integerPriorityQueue);
        for (int i = 0; i < 7; i++) {
            Integer z = integerPriorityQueue.poll();
            System.out.println("Processing Integer:" + z);
        }

        Queue<Customer> customerQueue = new PriorityQueue<>(7, idComparator);
        addDataToQueue(customerQueue);
        pollDataFromQueue(customerQueue);
    }

    public static Comparator<Customer> idComparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getId() - o2.getId();
        }
    };

    public static void addDataToQueue(Queue<Customer> customerPriorityQueue) {
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int id = random.nextInt(100);
            customerPriorityQueue.add(new Customer(id, "Pankaj" + id));
        }
    }

    public static void pollDataFromQueue(Queue<Customer> customerQueue) {
        while (true) {
            Customer customer = customerQueue.poll();
            if (customer == null) {
                break;
            }
            System.out.println("Processing Customer with ID=" + customer.getId());
        }
    }
}
