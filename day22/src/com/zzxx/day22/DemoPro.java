package com.zzxx.day22;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoPro {
    @Test
    public void m1() throws IOException {
        Properties pro=new Properties();
        InputStream is=new FileInputStream(DemoPro.class.getClassLoader().getResource("a.txt").getPath());
        pro.load(is);
//        pro.setProperty("name", "张三");
//        pro.setProperty("password", "12345");
        String str= pro.getProperty("password");
        System.out.println(str);
    }
}
