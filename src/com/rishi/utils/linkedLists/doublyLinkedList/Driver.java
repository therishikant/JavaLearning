package com.rishi.utils.linkedLists.doublyLinkedList;

public class Driver {
    public static void main(String[] args) {
        DoublyCircular<Integer> list = new DoublyCircular<Integer>();

        list.AddNode(1);
        list.AddNode(2);
        list.AddNode(3);
        list.AddNode(4);
        list.AddNode(5);
        list.AddNode(6);
        list.printNode();
        list.DeleteNode(66);
        list.printNode();
    }
}
