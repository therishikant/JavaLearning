package com.rishi.utils.tree.AVL;

import com.rishi.utils.tree.Node;

public class AVLTree {
    Node root;

    int height(Node node){
        if(node == null){
            return 0;
        }
        else
            return node.getHeight();
    }

    int max(int a , int b){
        return Math.max(a, b);
    }


    Node rightRotate(Node y){
        Node x = y.getLeftNode();
        Node T2 = x.getRightNode();

        x.setRightNode(y);
        y.setRightNode(T2);

        y.setHeight(max(height(y.getLeftNode()), height(y.getRightNode())) + 1);
        x.setHeight( max(height(x.getLeftNode()), height(x.getRightNode())) +1);
        return x;
    }

    Node leftRotate(Node x){
        Node y = x.getRightNode();
        Node T2 = y.getLeftNode();

        y.setLeftNode(x);
        x.setRightNode(T2);

        x.setHeight( max(height(x.getLeftNode()), height(x.getRightNode())) + 1);
        y.setHeight( max(height(y.getLeftNode()), height(y.getRightNode())) + 1);
        return y;

    }
}
