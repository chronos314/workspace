package com.zzxx.day12;

import java.util.Objects;

public class Demo1 {
    private String name;
    private int age;
    Demo1(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public boolean equals(Object o) {
        // 如果对象地址⼀样，则认为相同
        if (this == o)
            return true;
        // 如果参数为空，或者类型信息不⼀样，则认为不同
        if (o == null || getClass() != o.getClass())
            return false;
        // 转换为当前类型
        Demo1 person = (Demo1) o;
        // 要求基本类型相等，并且将引⽤类型交给java.util.Objects类的equals静态⽅法取⽤结果
        return age == person.age && Objects.equals(name, person.name);
    }

}
