package com.zzxx.day08;

public class Demo1 {
    public static void main(String[] args) {
        Demohaha d=new Demohaha();
        //向上造型
        MyInterfaceA1 b=new MyInterfaceB1Impl();
        d.haha(b);
        MyInterfaceA1 a=new MyInterfaceA1Impl();
        d.haha(a);
        //验证返回值类型是接口
        MyInterfaceA1 re=d.haha(a);
    }
}
