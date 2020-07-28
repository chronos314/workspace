package com.zzxx.day02;

import java.util.Scanner;

public class DemoRabbit {
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner console = new Scanner(System.in);
        int month = console.nextInt();
        System.out.println(month + "个月后兔子有" + number(month) + "对");
    }

    public static int number(int month) {
        int sum = 0;
        if (month < 3) {
            sum = 1;
        } else {
            sum = number(month - 1) + number(month - 2);
        }
        return sum;
    }
}
