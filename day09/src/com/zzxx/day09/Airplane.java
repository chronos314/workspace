package com.zzxx.day09;

public class Airplane extends FlyingObject {
    private int blood;
    public Airplane(){
        img=HeroTest.airplane;
        width=img.getWidth();
        height=img.getHeight();
        blood=1;
        x= (int) (Math.random()*400);
//        y=-HeroTest.bee.getHeight();
        y=100;
    }
    @Override
    public void move() {

    }
}
