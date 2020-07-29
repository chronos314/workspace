package com.zzxx.day18;

public class LoadPicture extends Thread {
    Picture picture=new Picture();
    @Override
    public void run() {
        //图片进入加载过程
        System.out.println("图片开始加载......");
        for (int i = 0; i <100 ; i++) {
            System.out.println("正在加载第"+(i+1)+"张图");
        }
        System.out.println("图片加载完了");
        //设置图片状态为已加载完成
        picture.isLoad=true;

        //图片要开始下载了，唤醒正在等待的显示线程
        synchronized (picture){
            picture.notify();
        }
        //等待图片显示完成
        if (!picture.isShow){
            synchronized (picture){
                try{
                    picture.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        //假设图片已经显示完成
        System.out.println("图片开始下载......");

    }
}
