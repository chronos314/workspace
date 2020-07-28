package com.zzxx.day05;

public class Child {
    String name;
    int age;
    static int money=1000;
    Child(String name,int age){
        this.name=name;
        this.age=age;
    }
    static void 吃饭(){
        System.out.println("在吃饭");
    }
    void 玩(){
        System.out.println(name+"在玩");
    }
}
