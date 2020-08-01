package com.zzxx.day20;

import org.junit.Test;

import java.io.File;

public class Demo01Constructor {
    @Test
    public void test1(){
        File file=new File("a.txt");
        String path=file.getAbsolutePath();
        System.out.println(path);
    }
}
