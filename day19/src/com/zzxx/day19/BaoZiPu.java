package com.zzxx.day19;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }
    @Override
    public void run() {
        int count = 0;
        // 造包⼦
        while (true) {
            // 同步
            synchronized (bz) {
                if (bz.flag == true) { // 包⼦资源 存在
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 没有包⼦ 造包⼦
                System.out.println("包⼦铺开始做包⼦");
                if (count % 2 == 0) {
                       // 冰⽪ 五仁
                    bz.pier = "冰⽪";
                    bz.xianer = "五仁";
                } else {
                    // 薄⽪ ⽜⾁⼤葱
                    bz.pier = "薄⽪";
                    bz.xianer = "⽜⾁⼤葱";
                }
                count++;
                bz.flag = true;
                System.out.println("包⼦造好了：" + bz.pier + bz.xianer);
                System.out.println("吃货来吃吧");
                // 唤醒等待线程 (吃货)
                bz.notify();
            }
        }
    }
}
