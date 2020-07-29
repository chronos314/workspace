package com.zzxx.day18;

public class ShowPicture extends Thread{
    Picture picture=new Picture();
    @Override
    public void run() {

        //等待图片加载完成
        if (!picture.isLoad){
            synchronized (picture){
                try{
                    picture.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("显示图片");
    }
}
