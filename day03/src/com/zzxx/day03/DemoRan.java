package com.zzxx.day03;

import java.util.Arrays;
import java.util.Scanner;

public class DemoRan {
    public static void main(String[] args) {
        char[] a1=randomChar();
        Scanner console=new Scanner(System.in);
        System.out.println("请输入5个字母");
        String str=console.next();
//        a2=str.toCharArray();
        char[] a2=parseChar(str);
        int[] result=compare(a1,a2);
        System.out.println("您输入的的5个字母为"+Arrays.toString(a2));
        System.out.println("随机的5个字母为："+Arrays.toString(a1));
        System.out.println("您猜对了"+result[0]+"个字母，有"+result[1]+"个字母位置也正确");

    }
    public static int[] compare(char[] m,char[] n){
        int[] result=new int[2];
        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j <m.length; j++) {
                if (n[j]==m[i]){
                    result[0]++;
                    if (j==i){
                        result[1]++;
                    }
                }
            }
        }
        return result;
    }
    public static char[] randomChar(){
        char[] cs=new char[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i]=(char)(Math.random()*26+'a');
            for (int j = 0; j < i; j++) {
                if (cs[i]==cs[j]){
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(cs);
        return cs;
    }
    public static char[] parseChar(String str){
        char[] a=new char[5];
        for (int i = 0; i <a.length ; i++) {
            a[i]=str.charAt(i);
        }
        return a;
    }
}
