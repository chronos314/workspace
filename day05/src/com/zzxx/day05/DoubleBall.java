package com.zzxx.day05;

import java.util.Arrays;

public class DoubleBall {
    public static void main(String[] args) {
        int[] red = new int[5];
        // 2.生成5个随机数字 - 代表5个红球
        // 循环，不能重复
        for (int i = 0; i < red.length; i++) {
            red[i] = (int)(Math.random() * 33 + 1);
            // 判断是否重复
            for (int j = 0; j < i; j++) {
                // 重复，这个位置重新生成一个 ball[i]
                if (red[i] == red[j]) {
                    i--; // 为了让下一次循环保持原来的i
                    break; // 结束重复判断
                }
            }
        }
        // 3.排序
        Arrays.sort(red);
        red = Arrays.copyOf(red, red.length + 1);
        red[red.length - 1] = (int)(Math.random() * 16 + 1);
        System.out.println(Arrays.toString(red));

    }
}
