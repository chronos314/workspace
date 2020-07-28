package com.zzxx.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("张三");
        col.add("李四");
        col.add("王五");


        Iterator<String> it=col.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
            it.remove();
        }
        System.out.println(col);
    }
}
