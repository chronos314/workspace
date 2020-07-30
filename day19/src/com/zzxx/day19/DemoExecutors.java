package com.zzxx.day19;

public class DemoExecutors {
    public static void main(String[] args) {
        new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        };
    }
}
