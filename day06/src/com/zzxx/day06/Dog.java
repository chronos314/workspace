package com.zzxx.day06;

public class Dog extends Animal{
    Dog(){
//        super("");
        System.out.println("子类无参构造");
    }

    Dog(String dog){
        super("");
        System.out.println("子类有参构造");
    }
    void wang(){
        System.out.println(name+"旺旺！");
    }
    void move(){

    }
}
