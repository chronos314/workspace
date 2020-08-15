package com.zzxx.day22;

import java.util.function.Consumer;

public class DemoConsumer {
    public static void methodAndThen(String str, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(str);
    }

    public static void main(String[] args) {
        methodAndThen("JavaGood", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        });

    }
}