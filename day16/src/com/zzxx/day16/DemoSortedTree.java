package com.zzxx.day16;

public class DemoSortedTree<T> {
    private class Node<T>{
        private T data;
        private Node left;
        private Node right;
        public Node(T data){
            this.data=data;
        }
    }
    private Node<T> root;//根节点
    private void addToNode(Node node,T t){
        if (((Comparable)t).compareTo(node.data)<0){
            if(node.left==null){
                node.left=new Node<T>(t);
                return;
            }
            addToNode(node.left,t);
        }else if (((Comparable)t).compareTo(node.data)>0){
            if(node.right==null){
                node.right=new Node<T>(t);
                return;
            }
            addToNode(node.right,t);
        }
    }
    // 给自己使用
    private void travelNode(Node node) {
        if (node.left != null) {
            travelNode(node.left);
        }
        System.out.println(node.data);
        if (node.right != null) {
            travelNode(node.right);
        }
    }

    // 给外部提供的方法
    public void travel() {
        travelNode(root);
    }
}
