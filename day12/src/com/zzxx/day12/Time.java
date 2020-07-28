package com.zzxx.day12;

import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date data=new Date();
        long time=data.getTime();
        System.currentTimeMillis();
        System.out.println("time:"+time);
        time+=30l*24*60*60*1000;
        data.setTime(time);
        System.out.println(data);
    }
}
