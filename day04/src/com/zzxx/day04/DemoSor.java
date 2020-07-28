package com.zzxx.day04;

import java.util.Arrays;

public class DemoSor {
    public static void main(String[] args) {
        int[] arr1={5,2,6,4,8,3};
        selectSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] selectSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int index=0;//记录最大值的坐标
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j]>arr[index]){
                    index=j;
                }
            }
            //交换index与length-1-i位置的值
            int temp=arr[index];
            arr[index]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){

                }
            }
        }
        return arr;
    }
}


