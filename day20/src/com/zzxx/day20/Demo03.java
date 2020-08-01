package com.zzxx.day20;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Demo03 {
    @Test
    public void test01() throws IOException {
//        File file1=new File("d.txt");
//        file1.createNewFile();
//        file1.delete();
        File file2=new File("dir/a");
        file2.mkdir();
//        file2.delete();
        File file3=new File("dir/a/f.txt");
        file3.createNewFile();
        File file4=new File(".");
        File[] files=file4.listFiles();
        for (File f:files){
            System.out.println(f);
        }



    }
}
