package com.zzxx.day09;

public class BigPlane extends FlyingObject{
    private int blood;
    public BigPlane(){
        blood=2;
        img=HeroTest.bigplane;
        width=img.getWidth();
        height=img.getHeight();
        x= (int) (Math.random()*400);
        //y=-HeroTest.bee.getHeight();
        y=150;
    }
    @Override
    public void move() {

    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
