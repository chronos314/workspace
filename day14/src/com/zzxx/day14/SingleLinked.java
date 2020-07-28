package com.zzxx.day14;

import java.util.Arrays;

public class SingleLinked {
    private class Node{
        private int data;//
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }
    //最开始初始化链表时，head不存储数据，next是null
    private Node head=new Node(0);
    //添加新的节点
    public void add(int a){
        //寻找next=null的节点
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
        //node.next==null
        node.next=new Node(a);
    }
    //得到index-1位置上的元素
    private Node getIndexPreNode(int index){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }
    //在index位置上插入元素
    public void insert(int index,int a){
        Node node=getIndexPreNode(index);
        Node node3=new Node(a);
        node3.next=node.next;
        node.next=node3;
    }
    //删除index位置上的元素
    public void remove(int index){
        Node node=getIndexPreNode(index);
        node.next=node.next.next;
    }

}
