package com.zzxx.day21;

import org.junit.Test;

import java.io.*;

public class DemoCopy {
    @Test
    public void mc() throws IOException {
        InputStream is=new FileInputStream("a.txt");
        OutputStream os=new FileOutputStream("ab.txt");
        int len;
        byte[] bs=new byte[1024];
        while ((len=is.read(bs))!=-1){
            os.write(bs,0,len);
        }
    }
    @Test
    public void mc2() throws IOException {
        InputStream is=new FileInputStream("ab2.txt");
        BufferedInputStream bis=new BufferedInputStream(is);
        OutputStream os=new FileOutputStream("ab2.txt");
        BufferedOutputStream bos=new BufferedOutputStream(os);
        int a;
        while ((a=is.read())!=-1){
            os.write(a^1);
        }

    }
}
