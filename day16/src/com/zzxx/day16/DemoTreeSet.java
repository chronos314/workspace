package com.zzxx.day16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        set.add(new Student("李四",21));
        set.add(new Student("张三",18));
        System.out.println(set);
    }
}
