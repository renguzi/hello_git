package com.journaldev.Generices1;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.Generices1
 * @Version:1.0
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
