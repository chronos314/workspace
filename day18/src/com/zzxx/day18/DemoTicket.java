package com.zzxx.day18;

public class DemoTicket {
    public static void main(String[] args) {
        // 创建线程任务对象
        Ticket ticket = new Ticket();
        // 创建三个窗⼝对象
        Thread t1 = new Thread(ticket, "窗⼝1");
        Thread t2 = new Thread(ticket, "窗⼝2");
        Thread t3 = new Thread(ticket, "窗⼝3");

        // 同时卖票
        t1.start();
        t2.start();
        t3.start();
    }
}
