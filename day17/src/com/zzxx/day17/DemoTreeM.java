package com.zzxx.day17;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeM {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        map.put("tom",12);
        map.put("jack",13);
        map.put("zhangsan",20);
        map.put("wangwu",25);
        System.out.println(map);
        map.put("lucy",99);
        System.out.println(map);
    }
}
