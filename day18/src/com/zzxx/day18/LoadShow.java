package com.zzxx.day18;

public class LoadShow {
    public static void main(String[] args) {

        Thread load=new Thread(){
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i <100 ; i++) {
                    System.out.println("正在加载第"+(i+1)+"张图");
                }
                System.out.println("图片加载完了");
            }
        };
        Thread show=new Thread(){
            public void run() {
                System.out.println("等待图片加载完成");
                try{
                    load.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("显示图片");
            }
        };
        load.start();
        show.start();
    }
}
