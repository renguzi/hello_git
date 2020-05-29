package com.journaldev.generics;

public class GenericsType<Z> {
    private Z t;
    public Z get(){
        return this.t;
    }
    public void set(Z t1){
        this.t=t1;
    }

    public static void main(String[] args) {
        GenericsType<String> genericsType = new GenericsType<String>();
        genericsType.set("Huangwei");
        System.out.println(genericsType.t);


        GenericsType type1=new GenericsType();
        type1.set("huangwei");
        System.out.println(type1.t);

        type1.set(10);

        System.out.println(type1.t);
    }
}
