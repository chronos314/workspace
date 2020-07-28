package zzxx.interfaceDemo;

public interface InterfaceDefault {
    //公开的抽象方法
    void methodAbs1();
    //默认的方法
    public default void defaultMethod() {
        System.out.println("Default A");
    }
}
