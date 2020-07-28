package com.zzxx.day13;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("haha");
        sb.append("what");
        System.out.println(sb);
        sb.insert(4,"xixi");
        System.out.println(sb);
        sb.replace(0,4,"hehe");
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);

    }
}
