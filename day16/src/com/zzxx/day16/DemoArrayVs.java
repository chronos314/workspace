package com.zzxx.day16;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoArrayVs {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        LinkedList<String> linkList=new LinkedList<>();
        for (int i = 0; i <10000000 ; i++) {
            arrList.add(i+"");
            linkList.add(i+"");
            //hh
        }
        long time1=System.currentTimeMillis();
        arrList.get(5000000);
        long time2=System.currentTimeMillis();
        System.out.println("ArrayList取头部元素的时间"+(time2-time1));
        long time3=System.currentTimeMillis();
        linkList.get(5000000);
    }
}
