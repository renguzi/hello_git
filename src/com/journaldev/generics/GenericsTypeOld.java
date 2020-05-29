package com.journaldev.generics;

public class GenericsTypeOld {
    private Object t;
    public Object get(){
        return t;
    }
    public void set(Object t){
        this.t=t;
    }

    public static void main(String[] args) {
        GenericsTypeOld genericsTypeOld = new GenericsTypeOld();
        genericsTypeOld.set("Huangwei");
        String string= (String) genericsTypeOld.get();
        System.out.println(string);
        System.out.println(genericsTypeOld.t);
    }
}
