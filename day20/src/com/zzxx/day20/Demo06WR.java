package com.zzxx.day20;


import org.junit.Test;

import java.io.*;


public class Demo06WR {
    @Test
    public void test01() throws IOException {
        OutputStream os=new FileOutputStream("src/o.txt");
        os.write(65);
        os.write(-1);
    }
    @Test
    public void test02() throws IOException {
        InputStream is=new FileInputStream("o.txt");
        int i;
        while ((i=is.read())!=-1){
            System.out.println("i:"+i);
        }
    }
}
