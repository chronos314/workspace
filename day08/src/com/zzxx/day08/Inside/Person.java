package com.zzxx.day08.Inside;

public class Person {
    private boolean live = true;
    class Heart {
        public void jump() {
            // 直接访问外部类成员
            if (live) {
                System.out.println("⼼脏在跳动");
            } else {
                System.out.println("⼼脏不跳了"); }
        }
    }
    public boolean isLive() {
        return live;
    }
    public void setLive(boolean live) {
        this.live = live;
    }
}
