package com.zzxx.day16;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<Student> set= new HashSet<>();
        set.add(new Student("张三",18));
        set.add(new Student("李四",21));
        set.add(new Student("张三",18));
        set.add(new Student("李四",21));

        System.out.println(set);
        System.out.println(set.size());
    }
}
