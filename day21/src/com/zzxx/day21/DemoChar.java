package com.zzxx.day21;

import org.junit.Test;

import java.io.*;

public class DemoChar {
    @Test
    public void write01() throws IOException {
        Writer w=new OutputStreamWriter(new FileOutputStream("c.txt"));
        w.write('你');
        w.close();
    }
    @Test
    public void write02() throws IOException {
        Writer w=new OutputStreamWriter(new FileOutputStream("c.txt"));
        char[] ch={'你','好','鸭'};
        w.write(ch);
        w.close();
    }
    @Test
    public void read01() throws IOException {
        Reader r=new InputStreamReader(new FileInputStream("c.txt"));
        int c;
        while ((c= r.read())!=-1){
            System.out.println("c:"+(char)c);
        }

    }
}
