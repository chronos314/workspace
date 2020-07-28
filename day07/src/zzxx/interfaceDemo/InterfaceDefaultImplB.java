package zzxx.interfaceDemo;

public class InterfaceDefaultImplB implements InterfaceDefault {
    //实现接口中的抽象方法
    @Override
    public void methodAbs1() {
        System.out.println("methodAbs1  BBB");
    }
    // 重写了默认的方法
    public void defaultMethod() {
        System.out.println("Default BBBB");
    }
}
