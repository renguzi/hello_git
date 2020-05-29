package com.journaldev.JavaBreak;

public class JavaBreak {
    public static void main(String[] args) {
        String[] arr = {"A", "E", "I", "O", "U"};
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].equals("O")) {
                System.out.println("Array contains 'O' at index " + i);
                break;
            }
        }
        int len = 0;
        while (len < arr.length) {
            if (arr[len].equals("E")) {
                System.out.println("Array contains 'E' at index: " + len);
                break;
            }
            len++;
        }
        len = 0;
        do {
            if (arr[len].equals("U")) {
                System.out.println("Array contains 'U' at index " + len);
                break;
            }
            len++;
        }
        while (len < arr.length);
    }
}
