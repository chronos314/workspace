package com.zzxx.day09;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
    protected int x;
    protected int y;
    protected BufferedImage img;
    protected int width;
    protected int height;

//    protected FlyingObject(int x,int y,BufferedImage img){
//        this.img=img;
//        this.width=img.getWidth();
//        this.height=img.getHeight();
//        this.x=x;
//        this.y=y;
//    }
    public abstract void move();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
