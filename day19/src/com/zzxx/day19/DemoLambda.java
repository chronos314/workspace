package com.zzxx.day19;

public class DemoLambda {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程开始了");
            }
        });*/
        new Thread(()->
                System.out.println("线程开始了")
        );
    }
}
