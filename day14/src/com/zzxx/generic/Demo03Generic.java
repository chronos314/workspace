package com.zzxx.generic;

import java.util.Date;

public class Demo03Generic{
    public static void main(String[] args) {
        GenericClass gc =new GenericClass();//使用时没规定类型，就可以使用任意类型object
        gc.print(1, "hehe");

        GenericClass<Date, String>  gc1 = new GenericClass<>();//规定了类型
        gc1.print(new Date(), "hello");
        GenericClass<Date, Date>  gc2 = new GenericClass<>();
        gc2.print(new Date(), new Date(0));
    }
}
