package com.zzxx.day20;

import org.junit.Test;

public class Demo02 {
    @Test
    public void test02(){
        String path=Demo02.class.getResource("a.txt").getPath();
        System.out.println(path);
    }

    @Test
    public void test03(){
        String path=Demo02.class.getClassLoader().getResource("b.txt").getPath();
        System.out.println(path);
    }
}
