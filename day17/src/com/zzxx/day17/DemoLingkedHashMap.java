package com.zzxx.day17;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLingkedHashMap {
    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("lucy","有点傻");
        map.put("jack","有点呆");
        map.put("tom","有点蠢");
        map.put("rose","有点萌");
        System.out.println(map);
    }
}

