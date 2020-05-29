package com.journaldev.String;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-29
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class DeleteOccurance {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        String delete = "l";

        for (int i = 0; i <stringBuilder.length() ; i++) {
            System.out.println("i=" + i);
            System.out.println(stringBuilder.charAt(i));
            System.out.println(delete);
            if (delete.equals(stringBuilder.charAt(i))) {
                System.out.println("i=" + i);
                System.out.println(stringBuilder.delete(i, 1));
            }
        }
        System.out.println(stringBuilder);

        System.out.println(deleteOccurance('l', "hello"));

    }
//
    public static String deleteOccurance(char d, String string) {
        if (!string.contains(String.valueOf(d))) {
            return string;
        }
        return string.replaceAll(String.valueOf(d), "");
//        string.contains(deleteOccurance(d,string));
    }
}
