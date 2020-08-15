package com.zzxx.day22;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DemoPredicate {
    public static boolean m1(String str, Predicate<String> pre1, Predicate<String> pre2) {
        boolean b = (pre1).and(pre2).test(str);
        return b;
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        String[] arr = {"迪丽热巴,女", "杨幂,女", "马尔扎哈,男", "玛玛哈哈,女"};
        for (String str : arr) {
            boolean B = m1(str, new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return str.split(",")[1].equals("女");
                }
            }, new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return str.split(",")[0].length() == 4;
                }
            });
            if (B) {
                a.add(str);
            }
        }
        System.out.println(a);
    }
}
