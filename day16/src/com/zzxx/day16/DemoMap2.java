package com.zzxx.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("张三","qwe");
        map.put("李四","qwer");
        map.put("王五","qwert");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Entry<String, String> en:set){
            String key=en.getKey();
            String value=en.getValue();
            System.out.println(key+'='+value);
        }
    }
}
