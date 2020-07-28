package com.zzxx.shoot;

/*
小敌机
 */
public class Airplane extends FlyingObject {
    private int speed;
    public Airplane() {
        super((int) (Math.random() * (400-Main.airplane.getWidth())),
                - Main.airplane.getHeight(),
                Main.airplane);
        speed = 5;
    }
    @Override
    public void move() {
        // y坐标变大
        setY(getY() + speed);
    }
}
