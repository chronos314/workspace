package com.zzxx.day20;

import org.junit.Test;

import java.io.File;

public class Demo05De {
    public void deleteFile(File file){
        File[] files=file.listFiles();
        if(files!=null){
            for(File f:files){
                deleteFile(f);
            }
        }
        file.delete();
    }
    @Test
    public void Test05(){
        File file=new File("dir");
        deleteFile(file);
    }
}
