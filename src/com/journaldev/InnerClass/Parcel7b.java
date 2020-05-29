package com.journaldev.InnerClass;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.InnerClass
 * @Version:1.0
 */
public class Parcel7b {
    class MyContents implements Contents {
        private  int i=11;
        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b parcel7b = new Parcel7b();
        Contents contents = parcel7b.contents();
        System.out.println(contents.value());
    }


}
