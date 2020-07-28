package com.zzxx.day05;

public class DemoStatic {
    static{
        System.out.println("静态代码块");
    }
    public static void main(String[] args) {
        Child c1=new Child("小王",22);
        Child c2=new Child("小管",22);
        c1.玩();
        Child.吃饭();
    }
}
