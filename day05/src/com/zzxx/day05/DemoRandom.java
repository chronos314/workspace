package com.zzxx.day05;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random ran=new Random();
        System.out.println(ran.nextInt(100));
        System.out.println(ran.nextBoolean());
    }
}