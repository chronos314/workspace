package com.zzxx.day17;

public class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("多线程执行了:"+i);
        }
    }
}
