package com.zzxx.day08;

public class Demohaha {
    public MyInterfaceA1 haha(MyInterfaceA1 a1){//参数放实现类对象
        a1.methodAbs1();
        a1.methodAbs2();
        System.out.println("hahahaha");
//        MyInterfaceA1 s=new MyInterfaceA1Impl();
//        return s;
        return new MyInterfaceA1Impl();
    }
}
