package com.zzxx.day19;

public class DemoTest {
    public static void main(String[] args) {
        // 等待唤醒案例
        BaoZi bz = new BaoZi();

        ChiHuo ch = new ChiHuo("吃货", bz);
        BaoZiPu bzp = new BaoZiPu("包⼦铺", bz);

        ch.start();
        bzp.start();
    }
}
