package com.zzxx.shoot;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.util.ArrayList;

/*
    英雄机类 继承自 飞行物类
 */
public class Hero extends FlyingObject {
    private int life;
    private int score;
    // 如果不想用数组
//    private ArrayList<Bullet> bullets;

    public Hero() {
        super(170, 400, Main.hero0);
        life = 3;
    }

    private int count = 0; // 用来记录图片
    private BufferedImage[] herosImg = {Main.hero0, Main.hero1};
    @Override
    public void move() {
        // 切换图片
        count ++;
        setImg(herosImg[count % 2]);
        /*if(count % 2 == 0) {
            setImg(Main.hero0);
        } else {
            setImg(Main.hero1);
        }*/
    }

    // 发射子弹, 生成新的子弹, 并返回
    public Bullet[] shoot() {
        Bullet[] bullets = new Bullet[1];
        // 根据英雄机的x和y,计算子弹的x和y
        bullets[0] = new Bullet(this.getX() + this.getWidth()/2, this.getY());
        return bullets;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
