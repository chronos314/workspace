package com.zzxx.day18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    /*
     * 执⾏卖票操作
     */
    @Override
    public void run() {
        // 每个窗⼝卖票的操作
        // 窗⼝ 永远开启
        while (true) {
            sellTicket();
        }
    }
    /*
     * 锁对象 是 谁调⽤这个⽅法 就是谁
     * 隐含 锁对象 就是 this
     */
    Lock lock = new ReentrantLock();
    public  void sellTicket() {
        lock.lock();
        if (ticket > 0) { // 有票 可以卖
            // 出票操作
            // 使⽤sleep模拟⼀下出票时间
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 获取当前线程对象的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖:" + ticket--);
        }
        lock.unlock();
    }
}