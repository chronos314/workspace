package com.zzxx.day06;

public abstract class Animal {
    String name;
    Animal(){
        System.out.println("父类无参构造");
    }
    Animal(String animal){
        System.out.println("父类有参构造");
    }
    void eat(){
        System.out.println(name+"在吃");
    }
    abstract void move();
}
