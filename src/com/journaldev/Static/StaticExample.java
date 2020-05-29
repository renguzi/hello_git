package com.journaldev.Static;

public class StaticExample {
    private static int count;
    public static String str;

    static {
        System.out.println("StaticExample static block");
        str="Test";
        setCount(2);
    }

    static {
        System.out.println("StaticExample static block2");
    }

    public int getCount() {
        return this.count;
    }

    public static void setCount(int count) {
        if (count>0)
            count=count;
    }

    public static int addInts(int i, int... js) {
        int sum = i;
        for (int x: js
             ) {
            sum+=x;
        }
        return sum;
    }
   public static class MyStaticClass{
        public int count;
   }


}
