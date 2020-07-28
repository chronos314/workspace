package com.zzxx.day08.Inside;

public class InnerDemo {
    public static void main(String[] args) {
        // 创建外部类对象
        Person p = new Person();
        // 创建内部类对象
        Person.Heart heart = p.new Heart();
        // 调⽤内部类⽅法
        heart.jump();
        // 调⽤外部类⽅法
        p.setLive(false);
        // 调⽤内部类⽅法
        heart.jump();
    }
}
