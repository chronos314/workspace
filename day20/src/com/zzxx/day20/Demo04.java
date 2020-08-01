package com.zzxx.day20;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo04 {
    @Test
    public void Test04(){
        File file=new File(".");
        File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isFile();
            }
        });
        System.out.println(Arrays.toString(files));

        File[] files1=file.listFiles(f->{
            String name=f.getName();
            return name.endsWith(".txt");
        });
        System.out.println(Arrays.toString(files1));
    }
}
