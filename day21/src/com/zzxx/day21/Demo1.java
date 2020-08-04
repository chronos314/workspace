package com.zzxx.day21;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class Demo1 {
    @Test
    public void test01Write() throws IOException {
        OutputStream os=new FileOutputStream("a.txt");
        String str="你好,你吃了吗？";
        byte[] bs=str.getBytes("gbk");
        os.write(bs,2,3);
    }
    @Test
    public void tes01Read() throws IOException {
        InputStream is=new FileInputStream("a.txt");
        byte[] bs=new byte[6];
        int len;
        while ((len=is.read(bs))!=-1){
            System.out.println("len:"+len);
            System.out.println("bs:"+ Arrays.toString(bs));
        }
    }
}
