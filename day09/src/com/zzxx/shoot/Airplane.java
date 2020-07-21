package com.zzxx.shoot;

/*
小敌机
 */
public class Airplane extends FlyingObject{
    private int speed;
    public Airplane() {
        super((int) (Math.random() * (Main.WIDTH-Main.bigplane.getWidth())),
                - Main.airplane.getHeight(),
                Main.airplane);
        speed=2;
    }
    @Override
    public void move() {
        // y坐标变大
        this.setY(this.getY()+speed);
    }
}
