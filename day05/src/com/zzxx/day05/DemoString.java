package com.zzxx.day05;

import java.util.Scanner;

public class DemoString {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String str=console.nextLine();
        System.out.println(str.substring(0,str.indexOf('@')));
    }
}