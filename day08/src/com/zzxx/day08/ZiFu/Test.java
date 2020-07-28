package com.zzxx.day08.ZiFu;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.eat();
        Animal a2 = new Dog();
        a2.eat();
        if (a1 instanceof Cat) {
            Cat c = (Cat) a1;
            c.catchMouse();
        } else if (a1 instanceof Dog) {
            Dog d = (Dog) a1;
            d.watchHouse();
        }
    }

    public static void giveMePet(Animal A) {

    }
}