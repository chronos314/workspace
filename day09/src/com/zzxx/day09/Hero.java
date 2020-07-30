package com.zzxx.day09;

public class Hero extends FlyingObject{
    private int life;
    private int grade;
    private Bullet[] bullets;
    public Hero(){
        img=HeroTest.hero0;
        width=img.getWidth();
        height=img.getHeight();
        life=3;
        x=300;
        y=300;

    }
    @Override
    public void move() {

    }

    //子弹

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
