package com.zzxx.day08.Anonymity;

public class Demo08 {
    int a=10;
    //外部类的静态成员变量
    static int b=20;
    public static class Inner{
        public void m3(){
            //不能使用非静态成员
            //System.out.println(a);
            System.out.println(b);
        }
    }
}
