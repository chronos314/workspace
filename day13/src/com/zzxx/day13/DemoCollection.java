package com.zzxx.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("lucy");
        col.add("tom");
        col.add("jack");
        col.add("jack");
        col.add("jack");
        col.add("jack");
        System.out.println(col);

        Iterator<String> it=col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
