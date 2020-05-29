package com.journaldev.String;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-29
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class CheckPalaidrome {
    public static boolean Paralidrome(String string) {
        if (string == null) {
            return false;
        }
        if (string.length() <= 1) {
            return true;
        }
//        String first = string.substring(0, 1);
//        String last = string.substring(string.length() - 1);
//        if (!(first == last)) {
//            return false;
//        }
//        else return Paralidrome(string.substring())
        StringBuilder reverse = new StringBuilder(string).reverse();
        if (string.equals(new String(reverse))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Paralidrome("a"));
        System.out.println(Paralidrome(null));
        System.out.println(Paralidrome("ABA"));
        System.out.println(Paralidrome("AA"));
    }
}
