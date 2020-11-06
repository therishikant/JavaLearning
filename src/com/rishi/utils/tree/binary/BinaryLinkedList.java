package com.rishi.utils.tree.binary;

public class BinaryLinkedList {

    private Node firstNode = null;
    private boolean flag = false;

    public BinaryLinkedList(int[] arr) {
        setBinaryTree(arr);
    }

    private void setBinaryTree(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(firstNode == null){
                Node node = new Node(arr[i]);
                firstNode = node;
            }else {
                setBinaryNode(firstNode, arr[i]);
            }
        }
    }

    private void setBinaryNode(Node node, int data){
        if(node.getData() <= data){
            if(node.getRightNode() == null){
                Node rightNode = new Node(data) ;
                node.setRightNode(rightNode);
            }else {
                setBinaryNode(node.rightNode, data);
            }
        }else {
            if(node.getLeftNode() == null){
                Node leftNode = new Node(data);
                node.setLeftNode(leftNode);
            }else {
                setBinaryNode(node.leftNode, data);
            }
        }
    }

    public void checkElement(int element){
        elementFinder(firstNode, element);
        if (flag){
            System.out.println("Element Found");
        }else {
            System.out.println("Element Not Found");
        }
    }

    private void elementFinder(Node node, int element){
        if(node.getData() == element){
            flag = true;
            return;
        }
        if(node.getData() < element && node.rightNode != null){
            elementFinder(node.rightNode, element);
        }else if(node.getData() > element && node.leftNode != null){
            elementFinder(node.leftNode, element);
        }
    }


}
