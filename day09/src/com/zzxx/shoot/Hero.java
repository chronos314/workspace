package com.zzxx.shoot;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/*
    英雄机类 继承自 飞行物类
 */
public class Hero extends FlyingObject{
    private int life;

    // 如果不想用数组
//    private ArrayList<Bullet> bullets;

    public Hero() {
//        super(Main.WIDTH/2, Main.HEIGHT*2/3, Main.hero0);
        super(155, 400, Main.hero0);
        life = 10;

    }
    private int count=0;
    private BufferedImage[] herosImg={Main.hero0,Main.hero1};
    @Override
    public void move() {
        count++;
        setImg(herosImg[count%2]);
    }
    //发射子弹
    public Bullet[] shoot(){
        Bullet[] bullets=new Bullet[1];
        bullets[0]=new Bullet(this.getX()+this.getWidth()/2-2,this.getY());
        return bullets;
    }
//    public void creatBullet(){
//        FlyingObject fly;
//
//    }


    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


}
