package com.zzxx.day04;

public class DemoOver {
    public static void main(String[] args) {
        DemoOver demo1=new DemoOver();
        demo1.打(1);
        demo1.打("伞");
    }
    void 打(int a){
        System.out.println("打"+a+"个人");
    }
    String 打(String san){
        System.out.println("打"+san);
        return null;
    }
}
