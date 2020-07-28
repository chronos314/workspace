package com.zzxx.day14;

public class Stack<T> {
    private Object[] data;//存数据的仓库
    private int size;//栈中元素的的个数

    public Stack(int cap){//表示栈的最大容量
        data=new Object[cap];
    }
    //压栈
    public void push(T a){
        data[size++]=a;
    }
    //弹栈,从栈顶开始
    public T pop(){
        T a= (T) data[size-1];
        size--;
        return a;//return data[--size];
    }
    public boolean isFull(){
        if (size>data.length){
            return false;
        }
        return true;
    }
    public boolean isEmpty(){
        return size==0;
    }

}
