package com.zzxx.loop;

public class Demo07Loop {
    public static void main(String[] args) {
        // 1.循环是可以嵌套的
        x:for(int i = 0; i < 5; i++) {
            y:for(int j = 0; j < 3; j++) {
                // 结束当前最近的所有循环
                if (j == 1){
                    break;
                }
                System.out.println("i = " + i + ", j = " + j);
                if (j == 2) {
                    // 结束i循环-外层循环, 需要借助一个变量
                    break x;
                }
            }
        }
    }
}
