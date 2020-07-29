package com.zzxx.day18;

public class DemoThread3 {
    public static void main(String[] args) {
        Thread t=new Thread("线程1"){
            @Override
            public void run() {
                Thread t=Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName()+":"+i);
                }
            }
        };
        t.start();
        Runnable run=new Runnable(){
            @Override
            public void run() {
                Thread t=Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName()+":"+i);
                }
            }
        };
        Thread t1= new Thread(run,"线程2");
        t1.start();
    }
}
