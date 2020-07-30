package com.zzxx.day09;

public class Bee extends FlyingObject {
    public Bee(){
        img=HeroTest.bee;
        width=img.getWidth();
        height=img.getHeight();
        x= (int) (Math.random()*400);
//        y=-HeroTest.bee.getHeight();
        y=20;
    }
    @Override
    public void move() {

    }
}
