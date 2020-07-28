package com.zzxx.method;

/**
 * 方法的执行过程
 */
public class Demo02MethodProcess {
    public static void main(String[] args) {
        // 调用方法
        int c = sum(4, 6);
        System.out.println(c);
    }
    /*
        计算两个整数的和, 并且返回
     */
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
