package com.zzxx.day08.Anonymity;

public class InnerDemo {
    public static void main(String[] args) {
        /*
         * 1.等号右边:是匿名内部类，定义并创建该接⼝的⼦类对象
         * 2.等号左边:是多态赋值，接⼝类型引⽤指向⼦类对象
         */
        FlyAble f = new FlyAble() {
            public void fly() {
                System.out.println("我⻜了~~~");
            }
        };

        // 调⽤fly⽅法，执⾏重写后的⽅法
        f.fly();

    }
}
