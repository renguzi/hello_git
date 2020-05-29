package com.journaldev.String;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-28
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class StringPalindromeTest {
    public static void main(String[] args) {
        System.out.println(palindrome("ABC"));
        System.out.println(palindrome("A"));
        System.out.println(palindrome("AAA"));
        System.out.println(palindrome("ABA"));
        System.out.println(palindrome(null));
        System.out.println(palindrome("1"));
    String s=null;
        System.out.println(s.length());

    }


    public  static boolean palindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }

        String begin = s.substring(0, 1);
        String end = s.substring(s.length() - 1);
        if (!begin.equals(end)) {
            return false;
        } else {
            return palindrome(s.substring(1, s.length() - 1));
        }

    }
}
