package com.zzxx.day22;

import java.util.function.Supplier;

public class DemoSupplier {
    public static int getMax(int[] arr, Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 45, 21, 78, 33};
        int max = getMax(arr, () -> {
            int a = 0;
            for (int i : arr) {
                if (a < i) {
                    a = i;
                }
            }
            return a;
        });
        System.out.println("最大的数为：" + max);
    }
}
