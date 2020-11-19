package com.rishi.main;

import com.rishi.utils.sort.selection.Selection;

class Driver {
    public static void main(String[] args) {

        int[] arr = {5,9,5,7,2,4,3,10,11};
//        Linear linear = new Linear(arr);
//        linear.finder(4);
//        linear.finder(0);

//        Binary binary = new Binary(arr);
//        binary.finder(7);

//        BinaryLinkedList binaryTree = new BinaryLinkedList(arr);
//        binaryTree.checkElement(99);

        Selection selection = new Selection(arr);
        selection.sort();
        selection.printArray();

    }
}