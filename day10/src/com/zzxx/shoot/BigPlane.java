package com.zzxx.shoot;

/*
大敌机
 */
public class BigPlane extends FlyingObject {
    private int blood;
    private int speed;
    public BigPlane() {
        super((int) (Math.random() * (Main.WIDTH-Main.bigplane.getWidth())),
                - Main.bigplane.getHeight(),
                Main.bigplane);
        blood = 5;
        speed = 3;
    }

    @Override
    public void move() {
        // y坐标变大
        setY(getY() + speed);
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
