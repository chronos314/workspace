package com.zzxx.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("张三","qwe");
        map.put("李四","qwer");
        map.put("王五","qwert");
        Set<String> set=map.keySet();
        for (String key:set){
            String value=map.get(key);
            System.out.println(key+'='+value);
        }
    }
}
