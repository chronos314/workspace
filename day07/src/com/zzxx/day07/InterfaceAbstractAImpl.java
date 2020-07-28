
package com.zzxx.day07;

public class InterfaceAbstractAImpl implements DemoInterface{
    @Override
    public void m1() {
        System.out.println("m1方法");
    }

    @Override
    public void m3() {
        System.out.println("m3方法");
    }

    @Override
    public void m2() {
        System.out.println("m2default方法");
    }
}