package com.zzxx.day15;

import java.util.*;

public class DemoCollectionStudent {
    public static void main(String[] args) {
//        Collection<Student> col=new ArrayList<>();
//        Student s1=new Student("张三",34);
//        Student s2=new Student("李四",43);
//        col.add(s1);
//        col.add(s2);
//        System.out.println(col);
//
//        Student s3=new Student("张三",34);
//        col.remove(s3);
//        System.out.println(col);
        List<Student> list=new ArrayList<>();
        list.add(new Student("zhangsan",39));
        list.add(new Student("lisif",36));
        list.add(new Student("wangwu",37));
        System.out.println(list);
        Collections.sort(list,new MyComparator());
        System.out.println(list);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().length()-o1.getName().length();
            }
        });
        System.out.println(list);
    }
}
