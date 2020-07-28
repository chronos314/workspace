package com.zzxx.day06;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.add("haha");
        list.add("hehe");
        list.add("hiahia");
        String remove =  list.remove(2);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
