package com.zzxx.day23;

public class Man extends Human {
    @Override
    public void hi(String str) {
        System.out.println("Man"+str);
    }
    public void method(String str,People p){
        p.print(str);
    }
    public void show(){
       /* method("Hello",s ->{
            super.hi(s);
        });*/
        method("hello",super::hi);
    }

    public static void main(String[] args) {
        new Man().show();

    }
}
