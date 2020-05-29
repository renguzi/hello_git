package com.journaldev.Inheritance;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
 * @Version:1.0
 */
public class AnimalInheritanceExample {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "Black");
        System.out.println("Cat is vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats:" + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + "legs");
        System.out.println("Cat color is" + cat.getColor());
        Cat kitty = new Cat(false, "chochlate", 4);
        System.out.println(kitty.getColor());

        Animal animal = new Animal();
        animal=cat;
        System.out.println("cat instance of Animal:" + (cat instanceof Animal));
        System.out.println("animal instance of Cat:" + (animal instanceof Cat));
        kitty=(Cat)animal;


        Dog dog=new Dog();
        dog.setName("Puppy");
        System.out.println(dog.getName());
        animal=dog;
        System.out.println("animal instance of Dog" + (animal instanceof Dog));
        System.out.println("animal instance of Cat:" + (animal instanceof Cat));
//        kitty= (Cat) animal;
        Animal animal1 = new Animal();
//        Cat cat1= (Cat) animal1;

        Animal a = new Animal();
        Cat c = new Cat(false, "milk", 4, "Black");
        boolean flag= a instanceof Cat;
        if (flag) {
            c= (Cat) a;
        }
        else System.out.println(flag);


    }
}
