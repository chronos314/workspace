package com.zzxx.day15;

import java.util.ArrayList;
import java.util.Collection;

public class DemoIterator2 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("张三");
        col.add("李四");
        col.add("王五");

        for(String s:col){
            System.out.println(s);
        }
    }
}
