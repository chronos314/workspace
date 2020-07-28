package com.zzxx.day07;

public interface DemoInterface {
    int NUM=10;
    void m1();
    default void m2(){
        System.out.println("");
    }
    public abstract void m3();
    private void methodPrivateA(){
        System.out.println("AAA");
    }
    private static void methodPrivateB(){
        System.out.println("BBB");
    }
    static void methodStaticB(){
        System.out.println("静态方法B");
        methodPrivateB();
    }
}
