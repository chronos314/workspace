package com.zzxx.day17;

public class DemoTest {
    public static void main(String[] args) {
        try{
//            None no = null;
//            no.m2();
            ArraysDemo.m1();
            System.out.println("m1方法正常结束了");
        }catch (RuntimeException e){
            System.out.println("捕获到数组越界了");
            e.printStackTrace();
        }finally {
            System.out.println("这里是finally代码块");
        }
        System.out.println("try-catch结束了");
    }
}
