package com.zzxx.day15;

public class DemoSortTree {
    public class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int data){
            this.data=data;
        }
        private Node root;//根节点
        public void add(int a){
            if (root==null){
                data=a;
                return;
            }
            Node node=root;//记录每一次的当前节点
            Node parentNode;//记录每一次node的父节点
            parentNode=node;
            if (node.data>a){
                node=node.left;
                if (node==null){
                    parentNode.left=new Node(a);
                    return;
                }
            }else if (node.data<a){

            }
        }
    }

}
