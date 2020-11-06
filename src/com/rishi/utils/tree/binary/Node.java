package com.rishi.utils.tree.binary;

public class Node {
    int data;
    Node leftNode = null;
    Node rightNode = null;

    public Node (int data){ this.data = data;}

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node leftNode){
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode){
        this.rightNode = rightNode;
    }
}
