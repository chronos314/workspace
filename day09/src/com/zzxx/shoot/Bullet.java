package com.zzxx.shoot;

/*
子弹类: 继承自 飞行物类
 */
public class Bullet extends FlyingObject{
    private int speed;
    public Bullet(int x, int y) {
        // 子弹的 x 和 y 不是随机的, 也不是固定的
        // 根据英雄机坐标决定
        super(x, y, Main.bullet);
        speed=3;
    }
    @Override
    public void move() {
        // y坐标减小
        this.setY(this.getY()-speed);
    }
}
