package com.zzxx.day22;

import java.util.function.Function;

public class DemoFunction {
    public static void change(String str,
                              Function<String,String> fun1,
                              Function<String,Integer> fun2,
                              Function<Integer,Integer> fun3){
        int i=fun1.andThen(fun2).andThen(fun3).apply(str);
        System.out.println(i);
    }

    public static void main(String[] args) {
        change("赵丽颖, 23",
                s -> s.split("[, ]")[1],
                s -> Integer.valueOf(s),
                integer -> integer+100
        );
    }
}

//new Function<String, String>() {
//@Override
//public String apply(String s) {
//        return s.split("[, ]")[1];
//        }
//        }, new Function<String, Integer>() {
//@Override
//public Integer apply(String s) {
//        return Integer.valueOf(s);
//        }
//        }, new Function<Integer, Integer>() {
//@Override
//public Integer apply(Integer integer) {
//        return integer+100;
//        }
//        }