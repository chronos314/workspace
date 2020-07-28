package com.zzxx.day07;

public class DemoMain {
    public static void main(String[] args) {
        InterfaceAbstractAImpl impl=new InterfaceAbstractAImpl();
        impl.m1();
        impl.m3();
        impl.m2();
        DemoInterface.methodStaticB();
    }
}