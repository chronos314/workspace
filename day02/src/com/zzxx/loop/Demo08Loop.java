package com.zzxx.loop;

public class Demo08Loop {
    public static void main(String[] args) {
        // 1.循环是可以嵌套的
        x:for(int i = 0; i < 5; i++) {
            y:for(int j = 0; j < 3; j++) {
                // 结束当前本次循环
                if (j == 1) {
                    // 结束这一次循环,继续下一次循环
                    continue;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }


    }
}
