package com.zzxx.day02;

import java.util.Scanner;

public class DemoNumber {
    public static void main(String[] args) {
        int m=(int)(Math.random()*100);
        System.out.println(m);
        Scanner console=new Scanner(System.in);
        System.out.println("请猜数字：");
        int n=-1;
        while(n!=m){
            n=console.nextInt();
            if (n==0){
                System.out.println("已请求退出！");
                break;
            } else if (n<m){
                System.out.println("小了");
                System.out.println("请继续猜数字：");
            }else if (n>m) {
                System.out.println("大了");
                System.out.println("请继续猜数字：");
            }else {
                System.out.println("猜对了");
            }
        }

    }
}
