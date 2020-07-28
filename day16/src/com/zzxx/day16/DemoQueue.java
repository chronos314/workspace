package com.zzxx.day16;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> qu=new LinkedList<>();
        qu.offer("哈哈哈");
        qu.offer("嘿嘿嘿");
        System.out.println(qu);
        String s1=qu.peek();
        System.out.println("队列头"+s1);
        System.out.println("队列"+qu);
        s1=qu.poll();
        System.out.println("队列头2"+s1);
        System.out.println("队列2"+qu);
    }
}
