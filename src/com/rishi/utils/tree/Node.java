package com.rishi.utils.tree;

public class Node {
    int data,height;
    Node leftNode = null;
    Node rightNode = null;

    public Node (int data){ this.data = data;}

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public int getHeight(){return height;}

    public void setHeight(int height){
        this.height = height;
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
