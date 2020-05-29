package com.journaldev.InnerClass;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.InnerClass
 * @Version:1.0
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private  int i=11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();
        System.out.println(contents.value());
    }
}
