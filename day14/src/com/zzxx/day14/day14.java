package com.zzxx.day14;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class day14 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="你好";
        byte[] bs=str.getBytes();
        System.out.println(str);
        System.out.println(Arrays.toString(bs));
        byte[] bs1=str.getBytes("gbk");
        System.out.println(Arrays.toString(bs1));



    }
}
